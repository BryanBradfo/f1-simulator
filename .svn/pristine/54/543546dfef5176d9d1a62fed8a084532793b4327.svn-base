package MVC_interface_graphique.Modèle;

import MVC_interface_graphique.MdJ;
import exceptions.NumEcurieInconnueException;
import modele.Ecurie;

/** Cette classe est le modèle du menu du choix des écuries
 * 
 * @version 1.3
 */
public class ModeleMenuChoixEcurie {
	
	private MdJ mdj;				// Le moteur de jeu
	private Ecurie [] ecuries;		// Les écuries parmi lesquelles choisir
	
	public ModeleMenuChoixEcurie(MdJ mdj) {
		this.mdj = mdj;
		this.ecuries = Ecurie.creerEcuries();
	}
	
	/** @return un tableau des noms d'écurie
	 */
	public String [] getNomsEcuries() {
		String [] str = new String[Ecurie.NB_ECURIES];
		for (int i = 0; i < 10; i++) {
			str[i] = this.ecuries[i].getNom();
		}
		return str;
	}
	
	/** Choisir une écurie parmi la sélection proposée.
	 * @param indice le numéro de l'écurie choisie.
	 */
	public void choisirEcurie(int indice) {
		if (indice < 0 || indice > Ecurie.NB_ECURIES) {
			throw new NumEcurieInconnueException();
		}
		this.mdj.getEcuries()[this.mdj.getNumSave()] = Ecurie.selectionerOpposants(this.ecuries[indice], this.ecuries);
		this.mdj.menuPrincipal();
	}
	
	public void creerEcurie() {
		System.out.println("Pas implémenté");
		// this.mdj.menuCreerEcurie();
	}
	
	/** Retourner au menu de sauvegardes */
	public void goMenuSave() {
		this.mdj.setNumSave(-1);
		this.mdj.menuSauvegarde();
	}

}
