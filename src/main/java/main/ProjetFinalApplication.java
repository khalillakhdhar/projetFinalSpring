package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import main.classes.Admin;
import main.classes.Role;
import main.services.AccountService;
import main.services.AccountServiceImplement;

@SpringBootApplication
public class ProjetFinalApplication implements CommandLineRunner{

	@Autowired
	AccountServiceImplement accountServiceImplement;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetFinalApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		accountServiceImplement.saveAdmin(new Admin("admin", "admin",1, null));
		accountServiceImplement.saveRole(new Role("guide"));
		accountServiceImplement.addRoleToUser("admin", "guide");
		accountServiceImplement.saveAdmin(new Admin("user", "monuser",1, null));
		accountServiceImplement.saveRole(new Role("orga"));
		accountServiceImplement.addRoleToUser("user", "orga");
		
	}

}
