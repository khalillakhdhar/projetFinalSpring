package main.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import main.classes.Sortie;

public interface SortieRepository extends JpaRepository<Sortie, Long> {

	public List<Sortie> findByTitre(String titre);
	public List<Sortie> findByDestination(String destination);
	public List<Sortie> findByDepart(String Depart);
	public List<Sortie> findByRetour(String retour);
	public List<Sortie> findByResponsable(String responsable);
	public List<Sortie> findByDescription(String description);
	@Query("Select AVG(t.prix) From  Sortie t")
	public double findMoyenne();
	
}
