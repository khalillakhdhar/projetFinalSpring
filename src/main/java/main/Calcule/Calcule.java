package main.Calcule;



public class Calcule {

	
	public double moyennePrixSorties(double[] tableau) {
		if(tableau == null) {
			return 0;
		}
		double somme=0;
		double moyenne=0;
		for(double nombre:tableau) {
			somme+=nombre;
			moyenne=somme/(tableau.length);
			
		}
		return moyenne;
	}
}
