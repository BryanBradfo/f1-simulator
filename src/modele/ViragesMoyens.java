package modele;

/* Classe Virages Moyens qui hérite de Virages.
 * Les vitesses de passage sont assez élévées mais demandent au pilote de décelerer.
 * L'aérodynamique de la voiture jouera un rôle très important dans ces virages.
 */

public class ViragesMoyens extends Virages {

	public ViragesMoyens(int numero, double longueur, double vitesseMoyenne) {
		super(numero, longueur, vitesseMoyenne);
	}

	public double tempsPassage() {
		// A CHANGER
		return super.getLongueur()/(super.getVitesseMoyenne()/3.6);
	}

}
