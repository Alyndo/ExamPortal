package com.exam;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {

		SpringApplication.run(ExamserverApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");

//		User user = new User();
//		user.setFirstName("Alwyn");
//		user.setLastName("Munatsi");
//		user.setUsername("lolo");
//		user.setPassword("abc");
//		user.setEmail("alwyn@gmail.com");
//		user.setProfile("default.png");
//
//		Role role = new Role();
//		role.setRoleId(44L);
//		role.setRoleName("ADMIN");
//
//		Set<UserRole> userRoles = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//
//		userRoles.add(userRole);
//
//		User user1 = this.userService.createUser(user, userRoles);
//		System.out.println(user1.getUsername());

	}
}
