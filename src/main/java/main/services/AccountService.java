package main.services;

import main.classes.Admin;
import main.classes.Role;

public interface AccountService {
	public Admin saveAdmin(Admin appUser);
	public Role saveRole(Role role);
	public void addRoleToUser(String username, String roleName);
	public Admin findUserByUserName(String username);
}
