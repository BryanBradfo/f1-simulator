package MVC_interface_graphique.Vue;
import javax.swing.*;
import MVC_interface_graphique.Modèle.ModeleMenuSave;
import exceptions.SauvegardeVideException;

import java.awt.*;

/** Cette classe gère la vue d'un des boutons du menu de sauvegarde
 * 
 * @version 1.2
 */
public class VueBoutonMenuSave extends JPanel {
	private static final long serialVersionUID = 7286116289155124195L;		// Numéro de Série (utile si besoin de serialiser la classe)
	private ModeleMenuSave modele;		// Modèle du menu
	private int NumBouton;				// Numéro du bouton à gérer
	private JLabel afficheur1;
	private JLabel afficheur2;
	private JLabel afficheur3;
	
	public VueBoutonMenuSave(ModeleMenuSave modele, int numBouton) {
		this.modele = modele;
		this.NumBouton = numBouton;
		this.setLayout(new BorderLayout());		
		this.afficheur1 = new JLabel();
		this.afficheur2 = new JLabel();
		this.afficheur3 = new JLabel();
		afficheur1.setHorizontalAlignment(JLabel.LEFT);
		afficheur2.setHorizontalAlignment(JLabel.CENTER);
		afficheur3.setHorizontalAlignment(JLabel.LEFT);
		afficheur1.setFont(afficheur1.getFont().deriveFont(20f));
		afficheur2.setFont(afficheur2.getFont().deriveFont(18f));
		afficheur3.setFont(afficheur3.getFont().deriveFont(18f));
		this.add(afficheur1, BorderLayout.NORTH);
		this.add(afficheur2, BorderLayout.CENTER);
		this.add(afficheur3, BorderLayout.SOUTH);
		
		mettreAJour();
	}
	
	/** Mets à jour la vue du vouton */
	public void mettreAJour() {
		if (!modele.isDelMode()) {
			try {
				afficheur1.setText("Budget : " + modele.getBudget(this.NumBouton) + " DOGECOINS");
				afficheur2.setText("Nom écurie : " + modele.getNomEcurie(this.NumBouton));
				afficheur3.setText("Niveau : " + modele.getNiveau(this.NumBouton));
			} catch (SauvegardeVideException e) {
				afficheur1.setText("");
				afficheur2.setText("Nouvelle partie");
				afficheur3.setText("");
			}
		} else {
			if (modele.isEmpty(this.NumBouton)) {
				afficheur1.setText("");
				afficheur2.setText("Pas de partie sur cette sauvegarde");
				afficheur3.setText("");
			} else {
				afficheur1.setText("");
				afficheur2.setText("Cliquez pour supprimer cette sauvegarde");
				afficheur3.setText("");
			}
		}
		
	}
}