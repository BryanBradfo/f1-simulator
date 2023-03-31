package modele;

public abstract class ElementCircuit {
	
	/** Longueur de l'élément */
	private double longueur;
	/** Vitesse Moyenne au passage de l'élement */
	private double vitesseMoyenne;
	/** Etat de performance de l'élément du circuit  */
	private int etatElement; 
	
	public ElementCircuit(double longueur, double vitesseMoyenne) {
		this.longueur = longueur;
		this.vitesseMoyenne = vitesseMoyenne;
		this.etatElement = 0;
	}
	
	
	abstract public double tempsPassage();
	
	/** Change l'etat du circuit.
	 * @param valeur
	 */
	public void changerEtatCircuit(int valeur) {
		this.etatElement = valeur;
	}

	/** Obtenir la longueur de l'élément du circuit.
	 * @return longueur
	 */
	public double getLongueur() {
		return longueur;
	}
	/** Obtenir la vitesse moyenne sur l'élément.
	 * @return vitesseMoyenne
	 */
	public double getVitesseMoyenne() {
		return vitesseMoyenne;
	}

	/** Obtenir l'etat de l'élément du circuit.
	 * @return marque
	 */
	public int getEtatElement() {
		return etatElement;
	}
	
	
}
