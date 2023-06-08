package repository;

import javax.swing.JOptionPane;

import definicioEntitats.Decoracio;

public class AfegirDecoracio {

	public static void afegirDecoracio(CrearFloristeria floristeria){
		
		//Preguntem pel nom de la decoraci� i el preu
		String nom = JOptionPane.showInputDialog("Introdueix el nom de la decoraci�");
		Double preu = Double.parseDouble(JOptionPane.showInputDialog("Introdueix el preu (si cal, separat per un punt)"));
		int quantitat = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat (si cal, separat per un punt)"));
		
		//Afegim la decoraci� a l'array de la floristeria
		floristeria.decoracions.put(new Decoracio(nom, preu), quantitat);
	}
}