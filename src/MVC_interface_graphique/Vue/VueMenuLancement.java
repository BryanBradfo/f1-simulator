package MVC_interface_graphique.Vue;
import javax.swing.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import utils.JpanelImg;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import MVC_interface_graphique.Contrôle.ControleMenuLancement;
import MVC_interface_graphique.Modèle.ModeleMenuLancement;


/** Cette classe créée un JPanel contenant les informations principales sur le jeu.
 * 
 * @version 1.1
 */
public class VueMenuLancement extends JpanelImg {
	
	private static final long serialVersionUID = 2549329519207475662L;		// Numéro de Série (utile si besoin de serialiser la classe)
	private JLabel afficheur1;
	private JLabel afficheur2;
	//private JLabel afficheur3;
	private ImageIcon icone1 = new ImageIcon("img/logo_jeu-removebg-preview.png");
	//private ImageIcon icone2 = new ImageIcon("img/image_mercedes_encourse.png");
	
	public VueMenuLancement(ModeleMenuLancement modele) {
		super("./img/banniere.png");
		this.setLayout(new BorderLayout());		
		this.afficheur1 = new JLabel(ModeleMenuLancement.NOM, icone1, JLabel.CENTER);
		this.afficheur1.setForeground(Color.white);
		
		this.afficheur2 = new JLabel();
		afficheur1.setHorizontalAlignment(JLabel.CENTER);
		afficheur2.setHorizontalAlignment(JLabel.CENTER);
		afficheur1.setFont(afficheur1.getFont().deriveFont(48f));
		afficheur2.setFont(afficheur2.getFont().deriveFont(18f));
		//afficheur3 = new JLabel(icone2, JLabel.CENTER);
		//modele.setContentPane(new JLabel(new ImageIcon("img/image_de_jeu.png")));

		this.add(afficheur1, BorderLayout.NORTH);
		this.add(afficheur2, BorderLayout.SOUTH);
		//this.add(afficheur3, BorderLayout.EAST);

		mettreAJour();
	} 
	
	public void addControle(ControleMenuLancement controle) {
		this.add(controle, BorderLayout.CENTER);
		this.setAlignmentY(CENTER_ALIGNMENT);
	}
	
	/** Mets à jour la vue */
	public void mettreAJour() {		
		afficheur2.setText("<html><body><font color = 'white'> Version " + ModeleMenuLancement.VERSION + "</body></html>");

		
		
	}
}
