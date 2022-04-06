package main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import main.classes.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {
	@Query("Select e FROM Evaluation e Order By e.note Desc")
	public List<Evaluation> findEvaluationOrderByAgeDesc();
	@Query("Select AVG(t.note) From  Evaluation t")
	public double findMoyenneEvaluation();
}
