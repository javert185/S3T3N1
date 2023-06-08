package repository;

import javax.swing.JOptionPane;
import definicioEntitats.Arbre;

public class AfegirArbre {
	
	public static void afegirArbre(CrearFloristeria floristeria){
		
		//Preguntem pel nom de l'arbre, l'al�ada, el preu i la quantitat
		String nom = JOptionPane.showInputDialog("Introdueix el nom de l'arbre");
		double al�ada = Double.parseDouble(JOptionPane.showInputDialog("Introdueix al�ada (en metres separat per un punt)"));
		double preu = Double.parseDouble(JOptionPane.showInputDialog("Introdueix el preu (si cal, separat per un punt)"));
		int quantitat = Integer.parseInt(JOptionPane.showInputDialog("Introdueix la quantitat (si cal, separat per un punt)"));
		
		//Afegim l'arbre a l'array de la floristeria
		floristeria.arbres.put(new Arbre(nom, al�ada, preu), quantitat);
	}
}
