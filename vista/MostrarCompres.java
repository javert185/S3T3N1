package vista;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import definicioEntitats.Arbre;
import definicioEntitats.Flor;
import definicioEntitats.Ticket;
import definicioEntitats.Decoracio;
import repository.CrearTickets;

public class MostrarCompres {


	public static void mostrarCompres(CrearTickets compres) {

		//Mostrem les compres
		for (int i = 0; i < compres.tickets.size(); i++) {

			System.out.println("Ticket de compra nº" + compres.tickets.get(i).getNum());
			HashMap<Object, Integer> hash = new HashMap <Object, Integer>();
			hash = (HashMap<Object, Integer>)((Object) compres.tickets.get(i).getCompra());

			for (Map.Entry<Object, Integer> entry: hash.entrySet()) {
				Object objecte = entry.getKey();
				if(objecte instanceof Arbre) {
					Arbre key = (Arbre) entry.getKey();
					int value = entry.getValue();
					System.out.println("  -" + key.getNom() + ":" + value);
				} else if (objecte instanceof Flor) {
					Flor key = (Flor) entry.getKey();
					int value = entry.getValue();
					System.out.println("  -" + key.getNom() + ":" + value);					
				} else if (objecte instanceof Decoracio) {
					Decoracio key = (Decoracio) entry.getKey();
					int value = entry.getValue();
					System.out.println("  -" + key.getNom() + ":" + value);					
				} 
			}				
		}
	}
}