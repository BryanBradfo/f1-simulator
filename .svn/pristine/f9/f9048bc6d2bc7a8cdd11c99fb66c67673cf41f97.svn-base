package MVC_interface_graphique.Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import utils.JpanelImg;

import javax.swing.*;

import MVC_interface_graphique.Modèle.ModeleMenuPrincipal;

/** Classe définissant la vue du menu principal
 * 
 * @version 1.0
 */
public class VueMenuPrincipal extends JpanelImg {
	
	private static final long serialVersionUID = -1651791507448680492L;			// Numéro de Série (utile si besoin de serialiser la classe)
	private ModeleMenuPrincipal modele;		// Modèle du menu
	//private JLabel lGauche;					// Afficheur gauche
	private JLabel lGaucheIcone;					// Afficheur gauche icone
	private JLabel lMilieu;					// Afficheur Milieu
	private JLabel lDroit;					// Afficheur droit
	private JLabel monLabel;
	private ImageIcon monIcone;
	private ImageIcon icone = new ImageIcon("img/money_dogecoin-removebg-preview.png");
	
	/** Constructeur de la vue de menu principal;
	 * @param modele le modèle du menu principal
	 */
	public VueMenuPrincipal(ModeleMenuPrincipal modele) {
		super("./img/banniere.png");
		this.modele = modele;
		this.setLayout(new BorderLayout());
		//this.lGauche = new JLabel();
		this.lMilieu = new JLabel();
		this.lDroit = new JLabel();
		this.lGaucheIcone = new JLabel("Budget : " + this.modele.getBudjetEcurie() + " DOGECOINS", icone, JLabel.CENTER);
		this.lGaucheIcone.setForeground(Color.white);
		this.lGaucheIcone.setFont(new Font ("Serif", Font.BOLD,20));

		monIcone = imagesEcuries(this.modele.getEcurieNom());
		this.lMilieu = new JLabel(monIcone, JLabel.CENTER);
		this.lMilieu.setForeground(Color.white);
		this.lMilieu.setFont(new Font ("Serif", Font.BOLD,20));

		//lGauche.setHorizontalAlignment(JLabel.CENTER);
		//lMilieu.setHorizontalAlignment(JLabel.CENTER);
		lDroit.setHorizontalAlignment(JLabel.CENTER);
		//lGauche.setFont(lGauche.getFont().deriveFont(18f));
		//lMilieu.setFont(lMilieu.getFont().deriveFont(28f));
		lDroit.setFont(lDroit.getFont().deriveFont(18f));

		this.add(this.lGaucheIcone, BorderLayout.WEST);
		this.add(this.lMilieu, BorderLayout.CENTER);
		this.add(this.lDroit, BorderLayout.EAST);
		//this.add(this.monLabel);
		
		this.mettreAJour();
	}
	
	/** Mettre à jour la vue du menu principal */
	public void mettreAJour() {
		
		//this.lGauche.setText("Budget : " + this.modele.getBudjetEcurie() + " DOGECOINS");
		this.lMilieu.setText(this.modele.getEcurieNom());
		this.lDroit.setText("<html><body><font color = 'white'><b> Niveau : " + this.modele.getNiveauEcurie() + "</b></body></html>");
	}
	
	public ImageIcon imagesEcuries(String nom) {
		switch (nom) {
		case "Ferrari" :
			return new ImageIcon("img/logo_Ferrari-removebg-preview.png");
		case "Mercedes" :
			return new ImageIcon("img/logo_mercedes.png");
		case "RedBull" :
			return new ImageIcon("img/logo_redbull.png");
		case "McLaren" :
			return new ImageIcon("img/logo_McLarren.png");
		case "Alpha Romeo" :
			return new ImageIcon("img/logo_alfaromeo-removebg-preview.png");
		case "Alpha Tauri" :
			return new ImageIcon("img/logo_Alphatauri.png");
		case "Williams" :
			return new ImageIcon("img/logo_williamsracing.png");
		case "Aston Martin" :
			return new ImageIcon("img/logo_AstonMartin.png");
		case "Alpine" :
			return new ImageIcon("img/logo_Alpin-removebg-preview.png");
		case "Haas" :
			return new ImageIcon("img/logo_haas-removebg-preview.png");
		default:
			return new ImageIcon("img/logo_Ferrari-removebg-preview.png");
		}
	}

}
