package modele;

public class Chassis extends ElementVoiture {
	
	private static final long serialVersionUID = 4655522852257674670L;
	/** Efficacité du chassis. */
	private double efficacite;
	private double efficaciteMax;
	
	public Chassis() {
		this.efficacite = 50;
		this.efficaciteMax = 50;
		this.dureeDeVie = 100;
	}
	
	public Chassis(int efficacite) {
		this.efficacite = efficacite;
		this.efficaciteMax = efficacite;
		this.dureeDeVie = 100;
	}

	private Chassis(double efficacite, double efficaciteMax, double dureedeVie) {
		this.efficacite = efficacite;
		this.efficaciteMax = efficaciteMax;
		this.dureeDeVie = dureedeVie;
	}
	
	public Chassis copie() {
		return new Chassis(efficacite, efficaciteMax, dureeDeVie);
	}


	/** Perte de vie du chassis. */
	@Override
	public void perteDeVie() {
		if ((70 - this.efficaciteMax) <= 0) {
			this.dureeDeVie -= 5;
		} else {
			this.dureeDeVie -= (70 - this.efficaciteMax);
		}
		if (this.dureeDeVie < 0) {
			this.dureeDeVie = 0;
		}
	}
	
	/** Diminue l'efficacite du frein
	 * @param valeur perte d'endurance
	 */
	public void perteEfficacite(double valeur) {
		if (efficacite > 0 && valeur >= 0) {
			this.efficacite -= valeur;
			if (this.efficacite < 0) {
				this.efficacite = 0;
			}
		}
	}

	public double getEfficacite() {
		return efficacite;
	}

	public double getEfficaciteMax() {
		return efficaciteMax;
	}
	
	public double getDureeDeVie() {
		return dureeDeVie;
	}
	
	public void reparer() {
		this.dureeDeVie = 100;
		this.efficacite = this.efficaciteMax;
	}
	
	public boolean ameliorer() {
		if (this.efficaciteMax < 100) {
			this.efficacite += 10;
			this.efficaciteMax += 10;
			if(efficacite > 100) {
				efficacite = 100;
			}
			if (efficaciteMax > 100) {
				efficaciteMax = 100;
			}
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Chassis d'efficacite : " + efficacite + "/" + efficaciteMax + "\nDurée de vie : " + dureeDeVie + "/100.0";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chassis other = (Chassis) obj;
		if (Double.doubleToLongBits(efficacite) != Double.doubleToLongBits(other.efficacite))
			return false;
		if (Double.doubleToLongBits(efficaciteMax) != Double.doubleToLongBits(other.efficaciteMax))
			return false;
		return true;
	}
}