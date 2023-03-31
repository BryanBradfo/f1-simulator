package modele;

public class Secteurs {
	
	/** Numéro du secteur */
	private int numero;
	/** Liste des trois secteurs composés de virages */
	private ElementCircuit[] elements;
	/** Etat du circuit */
	private String drapeau;
	
	/** Construire le secteur avec son numéro allant de 1 à 3, l'ensemble des éléments le composant (ligne droites
	 * virages et ligne des stands) ainsi que l'état de ce secteur
	 * @param numero le numéro du secteur
	 * @param elements le tableau des éléments du secteur
	 * @param drapeau valeur du drapeau choisi par le créateur
	 */
	public Secteurs(int numero, ElementCircuit[] elements, String drapeau) {
		this.numero = numero;
		this.elements = elements;
		this.drapeau = drapeau;
	}
	
	/** Construire le secteur avec son numéro allant de 1 à 3, l'ensemble des éléments le composant (ligne droites
	 * virages et ligne des stands) ainsi que le drapeau du secteur par défaut sur vert (tout va bien)
	 * @param numero le numéro du secteur
	 * @param elements le tableau des éléments du secteur
	 */
	public Secteurs(int numero, ElementCircuit[] elements) {
		this.numero = numero;
		this.elements = elements;
		this.drapeau = "vert";
	}

	/** Retourne le numéro de secteur allant de 1 à 3
	 * @return numero 
	 */
	public int getNumero() {
		return numero;
	}
	
	/** Retourne l'ensemble des éléments du secteur
	 * @return elements
	 */
	public ElementCircuit[] getElements() {
		return elements;
	}
	
	/** Retourne l'état du secteur matérialisé par la couleur du drapeau
	 * @return drapeau
	 */
	public String getDrapeau() {
		return drapeau;
	}
	
	/** Setter permettant de modifier l'état du tableau
	 * @param drapeau la couleur du drapeau
	 */
	public void setDrapeau(String drapeau) {
		this.drapeau = drapeau;
	}
	
	/** Retourne le temps de passage dans le secteur en additionnant les temps de chaque élément
	 * @return temps de passage dans le secteur
	 */
	public double tempsPassage() {
		double temps = 0;
		for(int i = 0; i < this.elements.length; i++) {
			temps += elements[i].tempsPassage();
		}
		return temps;
		
	}
	
	

}
