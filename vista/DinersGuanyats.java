package vista;

import java.util.HashMap;
import java.util.Map;

import definicioEntitats.Arbre;
import definicioEntitats.Decoracio;
import definicioEntitats.Flor;
import repository.CrearTickets;

public class DinersGuanyats {
	
	public static void dinersGuanyats(CrearTickets compres) {
		
		double sum = 0;	
		for (int i = 0; i < compres.tickets.size(); i++) {

			HashMap<Object, Integer> hash = new HashMap <Object, Integer>();
			hash = (HashMap<Object, Integer>)((Object) compres.tickets.get(i).getCompra());

			for (Map.Entry<Object, Integer> entry: hash.entrySet()) {
				Object objecte = entry.getKey();
				if(objecte instanceof Arbre) {
					Arbre key = (Arbre) entry.getKey();
					int value = entry.getValue();
					sum = sum + key.getPreu() * value;
				} else if (objecte instanceof Flor) {
					Flor key = (Flor) entry.getKey();
					int value = entry.getValue();
					sum = sum + key.getPreu() * value;					
				} else if (objecte instanceof Decoracio) {
					Decoracio key = (Decoracio) entry.getKey();
					int value = entry.getValue();
					sum = sum + key.getPreu() * value;					
				} 
			}				
		}
		System.out.printf("El total de diners guanyats per les ventes és de %.2f", sum );
		System.out.println("€");
	}
}
