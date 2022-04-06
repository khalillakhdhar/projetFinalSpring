package main.servicesInterfaces;

import java.util.List;

import main.classes.Participant;

public interface ParticipantServicesInterfaces {

	public Participant CréerParticipant(Participant a); 
	public void SupprimerParticipant(Long id);
	public List<Participant> afficherTousLesParticipant();
	public List<Participant> AfficherParticipantParNomEtPrenom(String nom,String prenom);
	public List<Participant> AfficherParticipantParEmail(String email);
	public int NombreDeParticipant();
}
