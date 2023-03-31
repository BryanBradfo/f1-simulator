package MVC_interface_graphique.Modèle;

import MVC_interface_graphique.MdJ;
import modele.Circuit;
import modele.Classement;
import modele.MoteurDeCourse;

/** Classe définissant le modèle du menu principal
 *
 * @version 1.0
 */
public class ModeleMenuPrincipal {

	private MdJ mdj;			// Moteur de jeu
	
	/** Constructeur du modèle
	 * @param ecurie l'écurie du joueur
	 */
	public ModeleMenuPrincipal(MdJ mdj) {
		this.mdj = mdj;
	}
	
	/** Retourner le nom de l'écurie
	 * @return le nom de l'écurie
	 */
	public String getEcurieNom() {
		return this.mdj.getMonEcurie().getNom();
	}
	
	/** Retourner le budget de l'écurie
	 * @return le budget de l'écurie
	 */
	public int getBudjetEcurie() {
		return this.mdj.getMonEcurie().getBudget();
	}
	
	/** Retourner le niveau de l'écurie
	 * @return le niveau de l'écurie
	 */
	public int getNiveauEcurie() {
		return this.mdj.getMonEcurie().getExperience().getNiveau();
	}
	
	/** Lancer le menu de gestion de la voiture
	 */
	public void goMenuVoiture() {
		this.mdj.menuVoiture();
	}
	
	/** Lancer le menu de gestion des pilotes
	 */
	public void goMenuPilotes() {
		this.mdj.menuPilotes();
	}
	
	/** Lancer la course
	 */
	public void goMenuCourse() {
		Circuit c1 = Circuit.creerCircuitBahrein();
		MoteurDeCourse m = new MoteurDeCourse(c1, this.mdj.getMesEcuries());
		
		m.lancerCourse();
		Classement c = new Classement(m);
		this.mdj.menuCourse(c, c1);
	}
	
	/** Retour au menu de Lancement*/
	public void retourMenuLancement() {
		this.mdj.setNumSave(-1);
		this.mdj.save();
		this.mdj.menuLancement();
	}

}
