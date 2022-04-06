
package main.classes;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Admin {
	@Id
	private String login;
	private String password;
	private int active;
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Role> roles=new ArrayList<Role>();
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	public Admin(String login, String password, Collection<Role> roles) {
		super();
		this.login = login;
		this.password = password;
		this.roles = roles;
	}
	public Admin(String login, String password, int active, Collection<Role> roles) {
		super();
		this.login = login;
		this.password = password;
		this.active = active;
		this.roles = roles;
	}
	public Admin() {
		super();
	}
	
	
}