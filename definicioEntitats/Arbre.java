package definicioEntitats;

public class Arbre {
	
	private String nom;
	private double al�ada;
	private double preu;
	
	public Arbre(String nom, double al�ada, double preu) {
		this.nom = nom;
		this.al�ada = al�ada;
		this.preu = preu;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setAl�ada(int al�ada) {
		this.al�ada = al�ada;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}
		
	public String getNom() {
		return nom;
	}

	public double getAl�ada() {
		return al�ada;
	}
	
	public double getPreu() {
		return preu;
	}	
}
