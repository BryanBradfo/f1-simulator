package modele;

import java.io.Serializable;

public class Experience implements Serializable {

	private static final long serialVersionUID = 5690617776257660903L;		// Numéro de Série (permet d'éviter des erreurs de sérialisation de la classe)

	/** Précision. */
	public final static double EPSILON = 0.001;
	
	/** niveauMax atteignable pour l'objet (Pilote / Ecurie). */
	public static final double niveauMax = 10;

	/** Niveau de l'objet (Pilote / Ecurie) compris entre 1 et niveauMax. */
	private int niveau;

	/** Progression de l'objet (Pilote / Ecurie) comprise entre 0 et 100. */
	private double progression;

	/** Boost de l'objet (Pilote / Ecurie) compris entre 0 et 100. */
	private double boost;
	
	/** Créer la barre d'expérience par défaut.
	 */
	public Experience() {
		this.niveau = 1;
		this.progression = 0.0;
		this.boost = 0.0;
	}
		
	/** Créer la barre d'expérience associée à un objet (Pilote / Ecurie).
	 * @param monNiveau le niveau de l'objet
	 * @param maProgression la progression de l'objet
	 * @param monBoost le boost de l'objet
	 */
	public Experience(int monNiveau, double maProgression, double monBoost) {
		this.niveau = monNiveau;
		this.progression = maProgression;
		this.boost = monBoost;
	}

	/** Augmenter le niveau de l'expérience de 1.
	 */
	public void augmenterNiveau () {

		this.niveau += 1;
		this.progression = this.progression - 100.0;
	}
	
	/** Augmenter la barre de progression de exp*boost.
	 */
	public void augmenterProgression (double exp) {
		this.progression = this.progression + exp*this.boost;
		if (this.progression >= 100.0) {
			this.augmenterNiveau();
		}
	}
	
	/** Obtenir le niveau de l'objet.
	 * @return niveau de l'objet
	 */
	public int getNiveau() {
		return niveau;
	}
	
	/** Obtenir la progression de l'objet.
	 * @return progression de l'objet
	 */
	public double getProgression() {
		return progression;
	}
	
	
	/** Obtenir le boost de l'objet.
	 * @return boost de l'objet
	 */
	public double getBoost() {
		return boost;
	}
	
	/** Changer le boost en fonction de l'objet.
 	* @param boost en fonction des résultats d'une course pour Pilote / de la renommée pour Ecurie
 	*/
	public void setBoost(double boost) {
		this.boost = boost;
	}
	
	public double progressionToFloat() {
		return this.progression;
	}
	
	@Override
	public String toString() {
		return "Niveau : " + this.niveau + " " + "Barre de progression : " + this.progression;
	}
	
	public Experience copierExperience() {
		return new Experience(this.niveau, this.progression, this.boost);
	}
}