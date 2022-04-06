package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.classes.Recommandation;
import main.repository.RecommandationRepository;
import main.servicesInterfaces.RecommandationServicesInterfaces;

@Service
public class RecommandationService implements RecommandationServicesInterfaces{

	@Autowired
	RecommandationRepository rr;
	
	@Override
	public Recommandation CréerRecommandation(Recommandation a) {
		return rr.save(a);
	}

	

	@Override
	public List<Recommandation> afficherTouteLesRecommandations() {
		return rr.findAll();
	}



	@Override
	public void SupprimerRecommadation(Long id) {
		rr.deleteById(id);
		
	}



	@Override
	public int SommeDesRecommandation() {
		
		return rr.findSommeRecommandation();
	}

}
