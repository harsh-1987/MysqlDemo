package Synechron.MysqlDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Synechron.MysqlDemo.model.User;

public interface UserInterface extends JpaRepository<User, Long>{

}
