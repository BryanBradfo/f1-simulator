package modele;

/* Classe Virages Rapides qui hérite de Virages.
 * Les vitesses de passage sont élévées réduisant le temps de passage.
 * En revanche les performances de passage dépendent beaucoup plus 
 * de la puissance du moteur de la voiture.
 */


public class ViragesRapides extends Virages {

	public ViragesRapides(int numero, double longueur, double vitesseMoyenne) {
		super(numero, longueur, vitesseMoyenne);
	}

	public double tempsPassage() {
		// A CHANGER
		return super.getLongueur()/(super.getVitesseMoyenne()/3.6);
	}

}
