package MVC_interface_graphique.Vue;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import MVC_interface_graphique.Modèle.ModeleMenuPilotes;


/** Cette classe définit la vue du menu de gestion des pilotes
 * 
 * @version 1.1
 */
public class VueMenuPilotes extends JPanel {
	
	private static final long serialVersionUID = -6237750584255982391L;			// Numéro de Série (utile si besoin de serialiser la classe)
	private ModeleMenuPilotes modele;		// Modèle du menu de gestion des pilotes
	private JTextArea pil1;					// Infos du pilote 1
	private JTextArea pil2;					// Infos du pilote 2
	
	public VueMenuPilotes(ModeleMenuPilotes modele) {
		this.modele = modele;
		
		this.setLayout(new GridLayout(0,2));
		pil1 = new JTextArea(7,1);
		//pil1.setHorizontalAlignment(JTextArea.LEFT);
		pil1.setFont(pil1.getFont().deriveFont(18f));
		pil2 = new JTextArea(7,1);
		//pil2.setHorizontalAlignment(JLabel.LEFT);
		pil2.setFont(pil2.getFont().deriveFont(18f));
		
		this.add(pil1);
		this.add(pil2);
		
		this.MettreAJour();
	}
	
	/** Met à jour l'affichage des pilotes*/
	public void MettreAJour() {
		String[] Infos1 = modele.getInfosPilote1();
		String[] Infos2 = modele.getInfosPilote2();
		for (int i=0; i<7; i++) {
			pil1.append(Infos1[i]);
			pil2.append(Infos2[i]);
		}		
	}
	
	
	
	
}
