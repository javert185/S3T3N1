package vista;

import definicioEntitats.Arbre;
import definicioEntitats.Flor;
import definicioEntitats.Decoracio;
import repository.CrearFloristeria;

public class VeureStockQuantitats {
	
	public static void veureStockQuantitats(CrearFloristeria floristeria) {
		
		//Imprimim per pantalla dels arbres, flors i decoracions
		System.out.println("Arbres:");
		for(Arbre arbre: floristeria.arbres.keySet()) {
			System.out.println("  -" + arbre.getNom() + ". Stock: " + floristeria.arbres.get(arbre));
		}
		
		System.out.println("Flors:");
		for(Flor flor: floristeria.flors.keySet()) {
			System.out.println("  -" + flor.getNom() + ". Stock: " + floristeria.flors.get(flor));
		}
		
		System.out.println("Decoracions:");
		for(Decoracio decoracio: floristeria.decoracions.keySet()) {
			System.out.println("  -" + decoracio.getNom() + ". Stock: " + floristeria.decoracions.get(decoracio));
		}
	}
}