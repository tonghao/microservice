package nsu.cloud.microservicesimpleprivideruser.Dao;

import nsu.cloud.microservicesimpleprivideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User,Long> {
}
