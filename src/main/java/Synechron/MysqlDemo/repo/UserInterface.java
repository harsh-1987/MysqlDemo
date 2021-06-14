package Synechron.MysqlDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Synechron.MysqlDemo.model.User;

@Repository
public interface UserInterface extends JpaRepository<User, Long>{

}
