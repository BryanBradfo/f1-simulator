package modele;

public class Aerodynamique extends ElementVoiture {
	
	private static final long serialVersionUID = -3807614591479001978L;
	/** Aerodynamisme de la voiture. */
	private double aerodynamisme;
	private double aerodynamismeMax;
	
	public Aerodynamique() {
		this.aerodynamisme = 50;
		this.aerodynamismeMax = 50;
		this.dureeDeVie = 100;
	}

	public Aerodynamique(int aero) {
		this.aerodynamisme = aero;
		this.aerodynamismeMax = aero;
		this.dureeDeVie = 100;
	}

	private Aerodynamique(double aerodynamisme, double aerodynamismeMax, double dureedeVie) {
		this.aerodynamisme = aerodynamisme;
		this.aerodynamismeMax = aerodynamismeMax;
		this.dureeDeVie = dureedeVie;
	}
	
	public Aerodynamique copie() {
		return new Aerodynamique(aerodynamisme, aerodynamismeMax, dureeDeVie);
	}

	
	/** Perte de vie de l'aérodynamique. */
	@Override
	public void perteDeVie() {
		if (this.dureeDeVie > 0) {
			this.dureeDeVie -= 5;
		}
		if (this.dureeDeVie < 0) {
			this.dureeDeVie = 0;
		}
	}
	
	/** Diminue l'aerodynamisme 
	 * @param valeur perte d'aerodynamisme
	 */
	public void perteAerodynamisme(double valeur) {
		if (aerodynamisme > 0 && valeur >= 0) {
			this.aerodynamisme -= valeur;
			if (this.aerodynamisme < 0) {
				this.aerodynamisme = 0;
			}
		}
	}

	public double getAerodynamisme() {
		return aerodynamisme;
	}

	public double getAerodynamismeMax() {
		return aerodynamismeMax;
	}
	
	public double getDureeDeVie() {
		return dureeDeVie;
	}
	
	public void reparer() {
		this.dureeDeVie = 100;
		this.aerodynamisme = this.aerodynamismeMax;
	}
	
	public boolean ameliorer() {
		if (this.aerodynamismeMax < 100) {
			this.aerodynamisme += 10;
			this.aerodynamismeMax += 10;
			if (aerodynamisme > 100) {
				aerodynamisme = 100;
			}
			if (aerodynamismeMax > 100) {
				aerodynamismeMax = 100;
			}
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Aerodynamique : " + aerodynamisme + ", maximum possible : " + aerodynamismeMax + "\nDurée de vie : " + dureeDeVie + "/100.0";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aerodynamique other = (Aerodynamique) obj;
		if (Double.doubleToLongBits(aerodynamisme) != Double.doubleToLongBits(other.aerodynamisme))
			return false;
		if (Double.doubleToLongBits(aerodynamismeMax) != Double.doubleToLongBits(other.aerodynamismeMax))
			return false;
		return true;
	}
	
}
