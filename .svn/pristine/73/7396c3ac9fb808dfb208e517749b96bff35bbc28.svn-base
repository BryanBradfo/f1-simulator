package MVC_interface_graphique.Modèle;

import MVC_interface_graphique.MdJ;
import exceptions.BudgetInsuffisantException;
import exceptions.NomInvalideException;

/** Cette classe décrit le comportement du menu de gestion de la voiture
 * 
 * @version 1.1
 */
public class ModeleMenuVoiture {
	
	private MdJ mdj;				// Moteur du jeu
	private String message;			// Message retourné en cas d'action				
	
	public ModeleMenuVoiture(MdJ mdj) {
		this.mdj = mdj;
	}
	
	/** Revenir au Menu principal */
	public void goMenuPrincipal() {
		mdj.menuPrincipal();
	}
	/* Informations Voiture */
	/** @return les informations sur la voiture */
	public String getInfosVoitures() {
		return this.mdj.getMonEcurie().getVoiture().toString();
	}
	
	/** @return les informations sur la voiture */
	public String getMarque() {
		return this.mdj.getMonEcurie().getVoiture().getMarque();
	}
	
	/** @return les informations sur la voiture */
	public String getPoids() {
		return "" + this.mdj.getMonEcurie().getVoiture().getPoids();
	}
	
	/** @return les informations sur la voiture */
	public String getPerformance() {
		return "" + this.mdj.getMonEcurie().getVoiture().getIndicesPerformances();
	}
	
	/** @return les informations sur la voiture */
	public double getAerodynamique() {
		return this.mdj.getMonEcurie().getVoiture().getAero().getAerodynamisme();
	}
	/** @return les informations sur la voiture */
	public double getAerodynamiqueV() {
		return this.mdj.getMonEcurie().getVoiture().getAero().getDureeDeVie();
	}
	
	/** @return les informations sur la voiture */
	public double getChassis() {
		return this.mdj.getMonEcurie().getVoiture().getChassis().getEfficacite();
	}
	
	/** @return les informations sur la voiture */
	public double getChassisV() {
		return this.mdj.getMonEcurie().getVoiture().getChassis().getDureeDeVie();
	}
	
	/** @return les informations sur la voiture */
	public double getFrein() {
		return this.mdj.getMonEcurie().getVoiture().getFrein().getEfficacite();
	}
	
	/** @return les informations sur la voiture */
	public double getFreinV() {
		return this.mdj.getMonEcurie().getVoiture().getFrein().getDureeDeVie();
	}
	
	/** @return les informations sur la voiture */
	public double getMoteur() {
		return this.mdj.getMonEcurie().getVoiture().getMoteur().getPuissance();
	}
	
	/** @return les informations sur la voiture */
	public double getMoteurV() {
		return this.mdj.getMonEcurie().getVoiture().getMoteur().getDureeDeVie();
	}
	
	/** @return les informations sur la voiture */
	public double getRoue() {
		return this.mdj.getMonEcurie().getVoiture().getRoue().getAdherence();
	}
	
	/** @return les informations sur la voiture */
	public double getRoueV() {
		return this.mdj.getMonEcurie().getVoiture().getRoue().getDureeDeVie();
	}
	
	
	
	
	
	
	/** @return le coût d'amélioration de la voiture */
	public int getCoutAmelioration() {
		return this.mdj.getMonEcurie().coutAmeliorerVoiture();
	}
	
	/** @return si il est possible d'améliorer la voiture */
	public boolean getIsAmeliorationPossible() {
		return (this.mdj.getMonEcurie().getBudget() > this.mdj.getMonEcurie().coutAmeliorerVoiture());
	}
	
	/** @return Le budget de l'écurie */
	public int getBudget() {
		return this.mdj.getMonEcurie().getBudget();
	}
	
	/** Essayer d'améliorer la voiture. Change le message en fonction de la réussite ou non. */
	public void ameliorerVoiture() {
		try {
			this.mdj.getMonEcurie().ameliorerVoiture();
			this.message = "Amélioration effectuée !";
		} catch (BudgetInsuffisantException e) {
			this.message = "Pas assez d'argent";
		}
	}
	
	/** Essayer d'améliorer un élément de la voiture. Change le message en fonction de la réussite ou non. */
	public void ameliorerElementVoiture(String message) {
		try {
			this.mdj.getMonEcurie().ameliorerElementVoiture(message);
			this.message = "Amélioration effectuée !";
		} catch (BudgetInsuffisantException e) {
			this.message = "Pas assez d'argent";
		} catch (NomInvalideException n) {
			System.out.println(("Erreur de code"));
		}
	}
	
	/** Essayer d'améliorer un élément de la voiture. Change le message en fonction de la réussite ou non. */
	public int getPrixElementVoiture(String message) {
		try {
			return this.mdj.getMonEcurie().getPrixElementVoiture(message);
		} catch (NomInvalideException n) {
			System.out.println(("Erreur de code"));
		}
		return -1;
	}
	
	
	
	
	
	/** @return le message à afficher */
	public String getMessage() {
		return this.message;
	}

}
