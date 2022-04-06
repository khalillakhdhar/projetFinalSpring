package main.servicesInterfaces;

import java.util.List;

import main.classes.Evaluation;




public interface EvaluationServicesInterfaces {
	public Evaluation CréerEvaluation(Evaluation a); 
	public void SupprimerEvaluation(Long id);
	public List<Evaluation> afficherTouteLesEvaluations();
	public List<Evaluation> afficherAllEvaluationOrderByAgeDesc();
	public double MoyenneDesEvaluations();
}
