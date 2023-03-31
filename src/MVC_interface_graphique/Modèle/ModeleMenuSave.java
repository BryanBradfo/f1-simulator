package MVC_interface_graphique.Modèle;

import MVC_interface_graphique.MdJ;
import exceptions.NumSaveInconnuException;
import exceptions.SauvegardeVideException;


/** Cette classe est un modèle pour le Menu de sauvegarde, c'est avec cette classe que les différents éléments visuels interagiront.
 * 
 * @version 1.3
 */
public class ModeleMenuSave {
	
	private MdJ mdj;									// Moteur de jeu
	private boolean estDelMode = false;					// Définit si on est dans le mode de suppression
	
	public ModeleMenuSave(MdJ mdj) {
		this.mdj = mdj;
	}
	
	/** Savoir si une sauvegarde est vide ou non.
	 * 
	 * @param numBouton Le numéro du Bouton (entre 0 et 2)
	 * @return si elle est vide.
	 */
	public boolean isEmpty(int numBouton) {
		if ((numBouton < 0) || (numBouton > MdJ.NB_SAVE)) {
			throw new NumSaveInconnuException();
		}
		return (this.mdj.getEcuries()[numBouton][0] == null);
	}
	
	/** @return si on est en mode de suppresion ou non */
	public boolean isDelMode() {
		return estDelMode;
	}
	
	/** Active/désactive le mode de supression */
	public void changeDelMode () {
		if (this.estDelMode) {
			this.estDelMode = false;
		} else {
			this.estDelMode = true;
		}
	}
	
	/** Récupérer le nom de l'écurie associée à un bouton.
	 * 
	 * @param numBouton Le numéro du bouton (entre 0 et 2)
	 * @return le nom de l'écurie
	 * @throws SauvegardeVideException s'il n'y a pas de sauvegarde associée au bouton
	 */
	public String getNomEcurie(int numBouton) throws SauvegardeVideException {
		if ((numBouton < 0) || (numBouton > MdJ.NB_SAVE)) {
			throw new NumSaveInconnuException();
		}
		if (!isEmpty(numBouton)) {
			return this.mdj.getEcuries()[numBouton][0].getNom();
		}
		throw new SauvegardeVideException();
	}
	
	/** Récupérer le budget de l'écurie associée à un bouton.
	 * 
	 * @param NumBouton Le numéro du bouton (entre 0 et 2)
	 * @return le budget de l'écurie
	 * @throws SauvegardeVideException s'il n'y a pas de sauvegarde associée au bouton
	 */
	public int getBudget(int numBouton) throws SauvegardeVideException {
		if ((numBouton < 0) || (numBouton > MdJ.NB_SAVE)) {
			throw new NumSaveInconnuException();
		}
		if (!isEmpty(numBouton)) {
			return this.mdj.getEcuries()[numBouton][0].getBudget();
		}
		throw new SauvegardeVideException();
	}
	
	/** Récupérer le niveau de l'écurie associée à un bouton.
	 * 
	 * @param numBouton Le numéro du bouton (entre 0 et 2)
	 * @return le niveau de l'écurie
	 * @throws SauvegardeVideException s'il n'y a pas de sauvegarde associée au bouton
	 */
	public int getNiveau(int numBouton) throws SauvegardeVideException {
		if ((numBouton < 0) || (numBouton > MdJ.NB_SAVE)) {
			throw new NumSaveInconnuException();
		}
		if (!isEmpty(numBouton)) {
			return this.mdj.getEcuries()[numBouton][0].getExp().getNiveau();
		}
		throw new SauvegardeVideException();
	}
	
	/** Créer une sauvegarde à l'emplacement d'un bouton.
	 * @param numBouton le numéro du bouton  (entre 0 et 2)
	 */
	public void creerSauvegarde(int numBouton) {
		if ((numBouton < 0) || (numBouton > MdJ.NB_SAVE)) {
			throw new NumSaveInconnuException();
		}
		this.mdj.setNumSave(numBouton);
		this.mdj.menuChoixecurie();
	}
	
	/** Supprimer la sauvegarde associée à un bouton
	 * @param numBouton le numéro du bouton  (entre 0 et 2)
	 */
	public void delSauvegarde(int numBouton) {
		if ((numBouton < 0) || (numBouton > MdJ.NB_SAVE)) {
			throw new NumSaveInconnuException();
		}
		this.mdj.getEcuries()[numBouton][0] = null;
		this.mdj.save();
	}
	
	/** Retourner au menu principal
	 */
	public void goMenuLancement() {
		this.mdj.menuLancement();
	}
	
	/** Aller au Menu Principal
	 */
	public void goMenuPrincipal(int numBouton) {
		this.mdj.setNumSave(numBouton);
		this.mdj.menuPrincipal();
	}
	
}
