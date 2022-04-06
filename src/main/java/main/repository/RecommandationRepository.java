package main.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import main.classes.Recommandation;

public interface RecommandationRepository extends JpaRepository<Recommandation, Long> {

	@Query("Select Count(t.id) From Recommandation t")
	public int findSommeRecommandation();
}
