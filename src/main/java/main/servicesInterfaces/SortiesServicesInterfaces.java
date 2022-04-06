package main.servicesInterfaces;

import java.util.List;


import main.classes.Sortie;

public interface SortiesServicesInterfaces {

	public Sortie CréerSortie(Sortie a); 
	public void SupprimerSortie(Long id);
	public List<Sortie> afficherTouteLesSorties();
	public double afficherMoyenne();
	
}
