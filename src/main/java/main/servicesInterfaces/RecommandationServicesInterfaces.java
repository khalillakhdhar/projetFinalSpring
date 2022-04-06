package main.servicesInterfaces;

import java.util.List;


import main.classes.Recommandation;

public interface RecommandationServicesInterfaces {
	public Recommandation CréerRecommandation(Recommandation a); 
	public void SupprimerRecommadation(Long id);
	public List<Recommandation> afficherTouteLesRecommandations();
	public int SommeDesRecommandation();
}
