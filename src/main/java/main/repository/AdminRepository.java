package main.repository;





import org.springframework.data.jpa.repository.JpaRepository;



import main.classes.Admin;

public interface AdminRepository extends JpaRepository<Admin, String>{
	public Admin findByLogin(String login);
}
