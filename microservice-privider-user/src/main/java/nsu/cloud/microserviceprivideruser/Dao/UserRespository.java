package nsu.cloud.microserviceprivideruser.Dao;

import nsu.cloud.microserviceprivideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User,Long> {
}
