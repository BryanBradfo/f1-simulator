package MVC_interface_graphique.Vue;

import javax.swing.*;
import utils.JpanelImg;

import MVC_interface_graphique.Modèle.ModeleMenuSave;
import utils.BoutonPerso;

/** Cette classe permet de gérer l'ensemble des vus du menu de sauvegarde
 * 
 * @author Timothée Blanchy
 * @version 1.0
 */
public class VueMenuSave {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ModeleMenuSave modele;	// Modele de sauvegarde
	private VueBoutonMenuSave boutons[] = new VueBoutonMenuSave[3];	// Les 3 boutons de sauvegarde
	private JButton bSup;			// Bouton de suppression
	
	/** Constructeur de la vue du menu de sauvegarde
	 * @param modele Le modèle du menu de sauvegarde
	 */
	public VueMenuSave(ModeleMenuSave modele) {
		this.modele = modele;
		for (int i = 0; i <= 2; i++) {
			this.boutons[i] = new VueBoutonMenuSave(modele, i);
		}
		bSup = new BoutonPerso("Supprimer une sauvegarde");
		
		
		this.mettreAJour();
	}
	
	/** Mettre à jour toute la vue.
	 */
	public void mettreAJour() {
		for (int i = 0; i <= 2; i++) {
			this.boutons[i].mettreAJour();
		}
		if (modele.isDelMode()) {
			this.bSup.setText("Annuler");
		} else {
			this.bSup.setText("Supprimer une sauvegarde");
		}
	}
	
	/** Récupérer la vue des boutons.
	 * @return un tableau des 3 boutons
	 */
	public VueBoutonMenuSave[] getBoutonVue() {
		return this.boutons;
	}
	
	/** Récupérer le bouton de suppression.
	 * @return le bouton
	 */
	public JButton getBoutonDel() {
		return this.bSup;
	}
}