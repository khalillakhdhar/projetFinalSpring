package main.classes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Participant implements Serializable{
	

	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false)
@Size(max = 50,min = 4)
private String nom;

@Column(nullable = false)
@Size(max = 50,min = 4)
private String prenom;

@Column(nullable = false)
private String email;

@Column(nullable = false)
private String telephone;

@Column(nullable = false)
private int age;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public Participant(String nom, String prenom, String email, String telephone, int age) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.telephone = telephone;
	this.age = age;
}

public Participant() {
	super();
}


}
