package modele;

/* Classe Virages Lents qui hérite de Virages.
 * Les vitesses de passage sont modérées (60 à 130 km/h) augmentant le temps de passage.
 * Les freins et la chassis auront un rôle primoridal dans ces zones pour résister au freinage
 * et pour prendre parfaitement le point de corde (c'est à dire prendre le virage le mieux possible).
 */

public class ViragesLents extends Virages {
		
	
	public ViragesLents(int numero, double longueur, double vitesseMoyenne) {
		super(numero, longueur, vitesseMoyenne);
	}

	@Override
	public double tempsPassage() {
		// A CHANGER 
		return super.getLongueur()/(super.getVitesseMoyenne()/3.6);
	}

}
