package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.classes.Evaluation;
import main.repository.EvaluationRepository;
import main.servicesInterfaces.EvaluationServicesInterfaces;

@Service
public class EvaluationServices implements EvaluationServicesInterfaces{
@Autowired
EvaluationRepository er;
	
	@Override
	public Evaluation CréerEvaluation(Evaluation a) {
		return er.save(a);
	}

	@Override
	public void SupprimerEvaluation(Long id) {
		er.deleteById(id);
		
	}

	@Override
	public List<Evaluation> afficherTouteLesEvaluations() {
		return er.findAll();
	}

	@Override
	public List<Evaluation> afficherAllEvaluationOrderByAgeDesc() {
		return er.findEvaluationOrderByAgeDesc();
	}

	@Override
	public double MoyenneDesEvaluations() {
		return er.findMoyenneEvaluation();
	}

}
