package modele;

public class LigneDroites extends ElementCircuit {
	
	/** La ligne Droite est elle une zone de DRS */
	final boolean estZoneDRS;
	
	public LigneDroites(double longueur, double vitesseMoyenne, boolean estZoneDRS) {
		super(longueur, vitesseMoyenne);
		this.estZoneDRS = estZoneDRS;
		
	}
	
	public double tempsPassage() {
		return super.getLongueur()/(super.getVitesseMoyenne()/3.6);
	}

}
