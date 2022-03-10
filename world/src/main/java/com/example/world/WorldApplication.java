package com.example.world;

import com.example.world.enums.UserRoles;
import com.example.world.models.Admin;
import com.example.world.models.Auth;
import com.example.world.models.Customer;
import com.example.world.repos.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthRepo authRepo, 
																					CustomerRepo customerRepo,
																					AdminRepo adminRepo) {
		return args -> {

			Auth a1 = new Auth("xyz@mail.com","1234",UserRoles.CUSTOMER);
			Customer c1 = new Customer("John Doe","5738280357","Atlanta, GA",a1);
			customerRepo.save(c1);

			Auth a2 = new Auth("admin@mail.com","1234",UserRoles.ADMIN);
			Admin a3 = new Admin("Admin","5738280357","Atlanta, GA",a2);
			adminRepo.save(a3);

		};
	}

}
