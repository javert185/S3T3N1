package vista;

import repository.CrearFloristeria;
import definicioEntitats.Arbre;
import definicioEntitats.Flor;
import definicioEntitats.Decoracio;

public class ValorTotal {
	
	public static void valorTotal(CrearFloristeria floristeria) {
		
		//Fem la suma del valor total de la floristeria, sumant quantitats i preus
		double sum = 0;
		
		for (Arbre arbre : floristeria.arbres.keySet()) {
			sum = sum + arbre.getPreu() * floristeria.arbres.get(arbre);
		}
		
		for (Flor flor : floristeria.flors.keySet()) {
			sum = sum + flor.getPreu() * floristeria.flors.get(flor);
		}
		
		for (Decoracio decoracio : floristeria.decoracions.keySet()) {
			sum = sum + decoracio.getPreu() * floristeria.decoracions.get(decoracio);
		}
				
		//Imprimim el resultat
		System.out.printf("El valor total de l'stock és de %.2f", sum );
		System.out.println("€");
	}
}