package modele;

public class Frein extends ElementVoiture {
		


	private static final long serialVersionUID = 4297808564660079175L;
	/** Efficacité du frein. */
	private double efficacite;
	private double efficacitemax;
	
	
	public Frein() {
		this.efficacite = 50;
		this.efficacitemax = 50;
		this.dureeDeVie = 100;
	}
	
	public Frein(int efficacite) {
		this.efficacite = efficacite;
		this.efficacitemax = efficacite;
		this.dureeDeVie = 100;
	}
	
	
	private Frein(double efficacite, double efficacitemax, double dureedeVie) {
		this.efficacite = efficacite;
		this.efficacitemax = efficacitemax;
		this.dureeDeVie = dureedeVie;
	}
	
	public Frein copie() {
		return new Frein(efficacite, efficacitemax, dureeDeVie);
	}

	
	public double getEfficacite() {
		return this.efficacite;
	}
	
	public double getEfficaciteMax() {
		return this.efficacitemax;
	}
	
	public double getDureeDeVie() {
		return this.dureeDeVie;
	}
	
	/** Diminue l'efficacite du frein
	 * 
	 * @param valeur perte d'endurance
	 */
	public void perteEfficacite(double pourcentage) {
		if (pourcentage >= 0 && this.efficacite > 0) {
			this.efficacite -= pourcentage;
			if (this.efficacite < 0) {
				this.efficacite = 0;
			}
		}
	}
	
	/** Perte de vie du frein. 
	 *  La durée de vie varie entre 0 et 1
	 * */
	@Override
	public void perteDeVie() {
		// Plus on s'améliore, plus on perd de la vie lentement
		if (this.efficacite == 100 || (30 - 3*this.efficacite/10 <= 0) ) {
			this.dureeDeVie -= 1;
		} else {
			this.dureeDeVie -= (30 - 3*this.efficacite/10 );
		}
		if (this.dureeDeVie < 0) {
			this.dureeDeVie = 0;
		}
	}

	public void reparer() {
		this.efficacite = this.efficacitemax;
		this.dureeDeVie = 100;
	}
	
	public boolean ameliorer() {
		if (this.efficacitemax < 100) {
			this.efficacite += 10;
			this.efficacitemax += 10;
			if (efficacite > 100) {
				efficacite = 100;
			}
			if (efficacitemax > 100) {
				efficacitemax = 100;
			}
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Frein d'efficacite " + efficacite + "/" + efficacitemax + "\nDuree de vie " + dureeDeVie
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
		Frein other = (Frein) obj;
		if (Double.doubleToLongBits(efficacite) != Double.doubleToLongBits(other.efficacite))
			return false;
		if (Double.doubleToLongBits(efficacitemax) != Double.doubleToLongBits(other.efficacitemax))
			return false;
		if (Double.doubleToLongBits(dureeDeVie) != Double.doubleToLongBits(other.dureeDeVie))
			return false;
		return true;
	}

	
}