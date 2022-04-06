package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.classes.Sortie;
import main.repository.SortieRepository;
import main.servicesInterfaces.SortiesServicesInterfaces;

@Service
public class SortiesService implements SortiesServicesInterfaces {
@Autowired
SortieRepository sr;

@Override
public Sortie CréerSortie(Sortie a) {
	return sr.save(a);
}

@Override
public void SupprimerSortie(Long id) {
	sr.deleteById(id);
	
}

@Override
public List<Sortie> afficherTouteLesSorties() {
	return sr.findAll();
}

@Override
public double afficherMoyenne() {
	return sr.findMoyenne();
}




}
