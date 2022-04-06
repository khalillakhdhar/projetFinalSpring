package main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import main.repository.AdminRepository;
import main.repository.RoleRepository;
import main.classes.Admin;
import main.classes.Role;
@Service
public class AccountServiceImplement implements AccountService{

	@Bean
	public BCryptPasswordEncoder getBCPE()
	{
		return new BCryptPasswordEncoder();
		
	}
	@Autowired
	AdminRepository adminrepository;
	@Autowired 
	RoleRepository roleRepository;
	
	@Override
	public Admin saveAdmin(Admin appUser) {
		// TODO Auto-generated method stub
		
				String hashPW=this.getBCPE().encode(appUser.getPassword()); //hashPW = le mot de passe crypté
				System.out.print(hashPW);
				appUser.setPassword(hashPW);
				return adminrepository.save(appUser);
	}

	@Override
	public Role saveRole(Role role) {
		// TODO Auto-generated method stub
			return roleRepository.save(role);
	}

	@Override
	public void addRoleToUser(String login, String roleName) {
		// TODO Auto-generated method stub
				Role role=roleRepository.findByRoleName(roleName);
				Admin admin=adminrepository.findByLogin(login);
				admin.getRoles().add(role);
				adminrepository.save(admin);
		
	}

	@Override
	public Admin findUserByUserName(String login) {
		// TODO Auto-generated method stub
				return adminrepository.findByLogin(login);
	}

}
