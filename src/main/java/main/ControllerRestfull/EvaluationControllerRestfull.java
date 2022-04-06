package main.ControllerRestfull;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.classes.Evaluation;
import main.services.EvaluationServices;

@RestController
@RequestMapping
public class EvaluationControllerRestfull {
@Autowired
EvaluationServices es;
	@GetMapping("/AfficherTouteLesEvaluations")
	public List<Evaluation> afficherTouteLesEvaluations(){
		return es.afficherTouteLesEvaluations();
	}
	
	@PostMapping("/CreerEvaluation")
	public Evaluation CréerEvaluation(@Valid @RequestBody Evaluation a){
		return es.CréerEvaluation(a);
	}
	
	@DeleteMapping("/SupprimerEvaluation/{id}")
	public void SupprimerEvaluation(@PathVariable Long id) {
		es.SupprimerEvaluation(id);
	}
	
	@GetMapping("/afficherEvaluationOrderByNoteDesc")
	public List<Evaluation> afficherAllEvaluationOrderByAgeDesc(){
		return es.afficherAllEvaluationOrderByAgeDesc();
	}
	
	@GetMapping("/MoyenneEvaluation")
	public double MoyenneDesvaluations() {
		try {
			return es.MoyenneDesEvaluations();
		}catch (Exception e) {
			return 0;
		}
	}
}
