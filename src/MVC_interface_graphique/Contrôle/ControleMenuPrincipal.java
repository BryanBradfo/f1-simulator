package MVC_interface_graphique.Contrôle;

import java.awt.BorderLayout;
import utils.JpanelImg;

import javax.swing.*;
import MVC_interface_graphique.Modèle.ModeleMenuPrincipal;
import utils.BoutonPerso;

/** Cette classe définit les actions du menu principal
 * 
 * @version 1.0
 */
public class ControleMenuPrincipal extends JpanelImg {
	
	private static final long serialVersionUID = -5546772851189822949L;			// Numéro de Série (utile si besoin de serialiser la classe)
	
	public ControleMenuPrincipal(ModeleMenuPrincipal modele) {
		super("./img/image_de_jeu2_agrandi.png");
		this.setLayout(new BorderLayout());
		JButton bVoiture = new JButton("<<< Gestion de la voiture");
		JButton bLancer = new JButton("Lancer une course");
		JButton bPilotes = new JButton("Gestion des pilotes >>>");
		JButton bQuitter = new JButton("Sauvegarder et quitter");
		
		this.add(bVoiture, BorderLayout.WEST);
		this.add(bLancer, BorderLayout.NORTH);
		this.add(bQuitter, BorderLayout.CENTER);
		this.add(bPilotes, BorderLayout.EAST);
		
		bVoiture.addActionListener(ev -> modele.goMenuVoiture());
		bLancer.addActionListener(ev -> modele.goMenuCourse());
		bPilotes.addActionListener(ev -> modele.goMenuPilotes());
		bQuitter.addActionListener(ev -> modele.retourMenuLancement());
		
	}
	
}
