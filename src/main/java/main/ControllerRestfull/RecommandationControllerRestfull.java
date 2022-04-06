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

import main.classes.Recommandation;
import main.services.RecommandationService;
@RestController
@RequestMapping
public class RecommandationControllerRestfull {

	@Autowired
	RecommandationService rs;
	
		@GetMapping("/AfficherTouteLesRecommandation")
		public List<Recommandation> afficherTouteLesRecommandations(){
			return rs.afficherTouteLesRecommandations();
		}
		
		@PostMapping("/CreerRecommandation")
		public Recommandation CréerRecommandation(@Valid @RequestBody Recommandation a){
			return rs.CréerRecommandation(a);
		}
		
		@DeleteMapping("/SupprimerRecommandation/{id}")
		public void SupprimerRecommandation(@PathVariable Long id) {
			rs.SupprimerRecommadation(id);
		}
		
		@GetMapping("/SommeRecommandation")
		public int SommeDesRecommandations() {
			return rs.SommeDesRecommandation();
		}
}
