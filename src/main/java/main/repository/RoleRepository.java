package main.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import main.classes.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
	public Role findByRoleName(String roleName);
}

