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

import main.classes.Participant;
import main.services.ParticipantService;
@RestController
@RequestMapping
public class ParticipantControllerRestfull {

	@Autowired
	ParticipantService ps;
	
		@GetMapping("/AfficherTousLesParticipants")
		public List<Participant> afficherTousLesParticipants(){
			return ps.afficherTousLesParticipant();
		}
		
		@PostMapping("/CreerParticipant")
		public Participant CréerParticipant(@Valid @RequestBody Participant a){
			return ps.CréerParticipant(a);
		}
		
		@DeleteMapping("/SupprimerParticipant/{id}")
		public void SupprimerParticipant(@PathVariable Long id) {
			ps.SupprimerParticipant(id);
		}
		
		@GetMapping("/AfficherParticipantParNomEtPrenom")
		public List<Participant> AfficherParticipantParNomEtPrenom(String nom, String prenom){
			return ps.AfficherParticipantParNomEtPrenom(nom, prenom);
		}
		
		@GetMapping("afficherParticipantParEmail/{email}")
		public List<Participant> AfficherParticipantParEmail(@PathVariable String email){
			return ps.AfficherParticipantParEmail(email);
		}
		
		@GetMapping("/NombreDeParticipants")
		public int NbParticipant() {
			try {
				return ps.NombreDeParticipant();
			}catch (Exception e) {
				return 0;
			}
		}
}
