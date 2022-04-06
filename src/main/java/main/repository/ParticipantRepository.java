package main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import main.classes.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
	public List<Participant> findByNomAndPrenom(String nom,String prenom);
	public List<Participant> findByEmail(String Email);
	@Query("Select Count(t.id) From Participant t")
	public int findSommeParticipant();
}
