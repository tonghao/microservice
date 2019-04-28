package nsu.cloud.microservicesimpleprivideruser.controller;

import nsu.cloud.microservicesimpleprivideruser.Dao.UserRespository;
import nsu.cloud.microservicesimpleprivideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRespository userRespository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = this.userRespository.findById(id).orElse(null);
        return findOne;

    }
}
