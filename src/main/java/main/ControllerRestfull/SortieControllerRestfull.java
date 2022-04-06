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

import main.Calcule.Calcule;
import main.classes.Sortie;
import main.services.SortiesService;
@RestController
@RequestMapping

public class SortieControllerRestfull {

	@Autowired
	SortiesService ss;
	Calcule c = new Calcule();
	
	
		@GetMapping("/AfficherTouteLesSorties")
		public List<Sortie> afficherTouteLesSorties(){
			return ss.afficherTouteLesSorties();
		}
		
		@PostMapping("/CreerSortie")
		public Sortie CréerSortie(@Valid @RequestBody Sortie a){
			return ss.CréerSortie(a);
		}
		
		@DeleteMapping("/SupprimerSortie/{id}")
		public void SupprimerSortie(@PathVariable Long id) {
			ss.SupprimerSortie(id);
		}
		
		@GetMapping("/AfficherMoyenne")
		public double afficherMoyennes(){
			return ss.afficherMoyenne();
		}
		
		
		
}
