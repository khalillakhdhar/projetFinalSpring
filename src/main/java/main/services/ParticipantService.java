package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.classes.Participant;
import main.repository.ParticipantRepository;
import main.servicesInterfaces.ParticipantServicesInterfaces;
@Service
public class ParticipantService implements ParticipantServicesInterfaces{
@Autowired
ParticipantRepository pr;

	@Override
	public Participant CréerParticipant(Participant a) {
		return pr.save(a);
	}

	@Override
	public void SupprimerParticipant(Long id) {
		pr.deleteById(id);
		
	}

	@Override
	public List<Participant> afficherTousLesParticipant() {
		return pr.findAll();
	}

	@Override
	public List<Participant> AfficherParticipantParNomEtPrenom(String nom, String prenom) {
		return pr.findByNomAndPrenom(nom, prenom);
	}

	@Override
	public List<Participant> AfficherParticipantParEmail(String email) {
		return pr.findByEmail(email);
	}

	@Override
	public int NombreDeParticipant() {
		return pr.findSommeParticipant();
	}

	


}
