package vista;
import repository.CrearFloristeria;

public class VeureStock {
	
	public static void veureStock(CrearFloristeria floristeria) {
		
		//Imprimim per pantalla dels arbres, flors i decoracions
		System.out.println("Arbres:");
		floristeria.arbres.keySet().forEach(arbre -> {
			System.out.println("  -" + arbre.getNom());
		});
		
		System.out.println("Flors:");
		floristeria.flors.keySet().forEach(flor -> {
			System.out.println("  -" + flor.getNom());
		});
		
		System.out.println("Decoracions:");
		floristeria.decoracions.keySet().forEach(decoracio -> {
			System.out.println("  -" + decoracio.getNom());
		});
	}
}