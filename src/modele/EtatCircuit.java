package modele;



public class EtatCircuit {
	private String meteo;
	private int bitumePerformances; //Pourcentage de fonctionnement du bitume
	private String drapeau; 
	
	public EtatCircuit() {
		this.meteo = "sèche"; // Le temps est sec par défaut
		this.bitumePerformances = 100; // Le bitume fonctionne à 70% par defaut
		this.drapeau = "vert"; //tout va bien sur le circuit
	}
	
	
	public String getMeteo() {
		return meteo;
	}

	public int getBitumePerformances() {
		return bitumePerformances;
	}

	public String getDrapeau() {
		return drapeau;
	}


	public void setMeteo(String meteo) {
		this.meteo = meteo;
	}
	
	public void setDrapeau(String drapeau) {
		this.drapeau = drapeau;
	}

	@Override
	public String toString() {
		return "= Etat Circuit =\nLa météo est : " + meteo + ", le bitume fonctionne à " + bitumePerformances + "% et drapeau " + drapeau
				+ " sur tout le circuit.";
	}
	
	
}
