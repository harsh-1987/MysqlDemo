package Synechron.MysqlDemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Synechron.MysqlDemo.model.User;
import Synechron.MysqlDemo.repo.UserInterface;

@SpringBootApplication
@RestController
public class BaseController {

	@Autowired
	private UserInterface userRepo;
	
	@GetMapping(value = "/")
	public String pageRead() {
	return "welcome";	
	}
	
	@GetMapping("/users")
	public List<User> getUser() {
		return userRepo.findAll();
	}
	
	@PostMapping("/save")
	public String saveUser(@Valid @RequestBody User user) {
		userRepo.save(user);
		return "saved .....";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BaseController.class, args);
	}

}
