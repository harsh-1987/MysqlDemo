package Synechron.MysqlDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import Synechron.MysqlDemo.model.User;

@NoRepositoryBean
public interface UserInterface extends JpaRepository<User, Long>{

}
