package modele;

public class Moteur extends ElementVoiture {

	private static final long serialVersionUID = 7182571236541224344L;
	/** Puissance du moteur. */
	private double puissance;
	private double puissancemax;
	
	
	public Moteur() {
		this.puissance = 50;
		this.puissancemax = 50;
		this.dureeDeVie = 100;
	}
	
	public Moteur(int puissance) {
		this.puissance = puissance;
		this.puissancemax = puissance;
		this.dureeDeVie = 100;
	}
	
	private Moteur(double puissance, double puissancemax, double dureedeVie) {
		this.puissance = puissance;
		this.puissancemax = puissancemax;
		this.dureeDeVie = dureedeVie;
	}
	
	public Moteur copie() {
		return new Moteur(puissance, puissancemax, dureeDeVie);
	}

	
	public double getPuissance() {
		return this.puissance;
	}
	
	public double getPuissanceMax() {
		return this.puissancemax;
	}
	
	public double getDureeDeVie() {
		return this.dureeDeVie;
	}
	
	/** Diminue la puissance du moteur
	 * 
	 * @param valeur perte d'endurance
	 */
	public void pertePuissance(double pourcentage) {
		if (pourcentage >= 0 && this.puissance > 0) {
			this.puissance -= pourcentage;
			if (this.puissance < 0) {
				this.puissance = 0;
			}
		}
	}
	
	/** Perte de vie du moteur. 
	 *  La durée de vie varie entre 0 et 1
	 * */
	@Override
	public void perteDeVie() {
		// Plus on s'améliore, plus on perd de la vie lentement
		if (this.puissance == 100 || (30 - 3*this.puissance/10) <= 0) {
			this.dureeDeVie -= 1;
		} else {
			this.dureeDeVie -= (30 - 3*this.puissance/10 );
		}
		if (this.dureeDeVie < 0) {
			this.dureeDeVie = 0;
		}
	}

	public void reparer() {
		this.puissance = this.puissancemax;
		this.dureeDeVie = 100;
	}
	
	public boolean ameliorer() {
		if (this.puissancemax < 100) {
			this.puissance += 10;
			this.puissancemax += 10;
			if(puissance > 100) {
				puissance = 100;
			}
			if (puissancemax > 100) {
				puissancemax = 100;
			}
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Moteur de puissance " + puissance + "/" + puissancemax + "\nDuree de vie " + dureeDeVie
				+ "/100]";
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moteur other = (Moteur) obj;
		if (Double.doubleToLongBits(puissance) != Double.doubleToLongBits(other.puissance))
			return false;
		if (Double.doubleToLongBits(puissancemax) != Double.doubleToLongBits(other.puissancemax))
			return false;
		if (Double.doubleToLongBits(dureeDeVie) != Double.doubleToLongBits(other.dureeDeVie))
			return false;
		return true;
	}
}