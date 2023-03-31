package modele;


public abstract class Virages extends ElementCircuit{
	
	/** Numero du virage dans le circuit auquel il est rattaché */
	private int numero;
	/** Nom facultatif du virage */
	private String nom;

	
	public Virages(int numero, double longueur, double vitesseMoyenne) {
		super(longueur, vitesseMoyenne);
		this.numero = numero;
		this.nom = "Virage n°"+numero;
	}
	
	public Virages(int numero, String nom, double longueur, double vitesseMoyenne) {
		super(longueur, vitesseMoyenne);
		this.numero = numero;
		this.nom = nom;
	}
	
	public void changerEtatVirage(int valeur) {
		super.changerEtatCircuit(valeur);
	}

}
