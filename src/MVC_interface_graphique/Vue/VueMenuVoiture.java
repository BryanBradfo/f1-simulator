package MVC_interface_graphique.Vue;

import javax.imageio.ImageIO;
import javax.swing.*;
import MVC_interface_graphique.Modèle.ModeleMenuVoiture;
import utils.BoutonPerso;
import utils.JpanelImg;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


/** Cette classe créée un JPanel contenant les informations principales sur le jeu.
 *
 * @version 1.0
 */
public class VueMenuVoiture extends JpanelImg {
	
	private static final long serialVersionUID = 944094346607446622L;		// Numéro de Série (utile si besoin de serialiser la classe)
	private ModeleMenuVoiture modele;		// Modèle du menu
	
	private JLabel lBudget;					// JLabel affichant le budget disponible
	private JLabel lPrixAmelioration;		// JLabel affichant le prix d'amélioration de la voiture
	private JLabel lMessage;				// Jlabel affichant un message de retour
	
	
	// Caractéristiques de la voiture
	private JLabel lPoids;
	private JLabel lPerformance;
	private JLabel lChassis;
	private JLabel lFrein;
	private JLabel lAero;
	private JLabel lMoteur;
	private JLabel lRoue;
	private JLabel lChassisV;
	private JLabel lFreinV;
	private JLabel lAeroV;
	private JLabel lMoteurV;
	private JLabel lRoueV;
	
	private JButton bRetour;
	private JButton bAmeliorerAero;
	private JButton bAmeliorerChassis;
	private JButton bAmeliorerFrein;
	private JButton bAmeliorerMoteur;
	private JButton bAmeliorerRoue;
	
	public VueMenuVoiture(ModeleMenuVoiture modele) {
		super("./img/voiture.png");
		this.modele = modele;
		this.setLayout(null);
		
		////////////////////////////// INFOS VOITURE //////////////////////////////
		
		this.lBudget = new JLabel();
		this.lBudget.setHorizontalAlignment(JLabel.LEFT);
		this.lBudget.setFont(lBudget.getFont().deriveFont(18f));
		this.add(this.lBudget);
		this.lBudget.setBounds(200, 10, 300, 20);
		this.lBudget.repaint();
		
		this.lPoids = new JLabel();
		this.lPoids.setHorizontalAlignment(JLabel.LEFT);
		this.lPoids.setFont(lPoids.getFont().deriveFont(18f));
		this.add(this.lPoids);
		this.lPoids.setBounds(600, 10, 200, 20);
		this.lPoids.repaint();
		
		this.lPerformance= new JLabel();
		this.lPerformance.setHorizontalAlignment(JLabel.LEFT);
		this.lPerformance.setFont(lPerformance.getFont().deriveFont(18f));
		this.add(this.lPerformance);
		this.lPerformance.setBounds(800, 10, 200, 20);
		this.lPerformance.repaint();
		
		
		////////////////////////////// caractéristiques de la voiture //////////////////////////////
		
		this.lAero = new JLabel();
		this.lAero.setHorizontalAlignment(JLabel.LEFT);
		this.lAero.setFont(lAero.getFont().deriveFont(18f));
		this.add(this.lAero);
		this.lAero.setBounds(872, 413, 200, 20);
		this.lAero.repaint();
		
		this.lAeroV = new JLabel();
		this.lAeroV.setHorizontalAlignment(JLabel.LEFT);
		this.lAeroV.setFont(lAeroV.getFont().deriveFont(18f));
		this.add(this.lAeroV);
		this.lAeroV.setBounds(901, 437, 200, 20);
		this.lAeroV.repaint();
		
		
		this.lChassis = new JLabel();
		this.lChassis.setHorizontalAlignment(JLabel.LEFT);
		this.lChassis.setFont(lAero.getFont().deriveFont(18f));
		this.add(this.lChassis);
		this.lChassis.setBounds(138, 48, 200, 20);
		this.lChassis.repaint();
		
		this.lChassisV = new JLabel();
		this.lChassisV.setHorizontalAlignment(JLabel.LEFT);
		this.lChassisV.setFont(lAero.getFont().deriveFont(18f));
		this.add(this.lChassisV);
		this.lChassisV.setBounds(167, 73, 200, 20);
		this.lChassisV.repaint();
		
		
		this.lFrein = new JLabel();
		this.lFrein.setHorizontalAlignment(JLabel.LEFT);
		this.lFrein.setFont(lFrein.getFont().deriveFont(18f));
		this.add(this.lFrein);
		this.lFrein.setBounds(130, 328, 200, 20);
		this.lFrein.repaint();
		
		this.lFreinV = new JLabel();
		this.lFreinV.setHorizontalAlignment(JLabel.LEFT);
		this.lFreinV.setFont(lFreinV.getFont().deriveFont(18f));
		this.add(this.lFreinV);
		this.lFreinV.setBounds(158, 352, 200, 20);
		this.lFreinV.repaint();
		
		
		this.lMoteur = new JLabel();
		this.lMoteur.setHorizontalAlignment(JLabel.LEFT);
		this.lMoteur.setFont(lMoteur.getFont().deriveFont(18f));
		this.add(this.lMoteur);
		this.lMoteur.setBounds(772, 105, 200, 20);
		this.lMoteur.repaint();
		
		this.lMoteurV = new JLabel();
		this.lMoteurV.setHorizontalAlignment(JLabel.LEFT);
		this.lMoteurV.setFont(lMoteur.getFont().deriveFont(18f));
		this.add(this.lMoteurV);
		this.lMoteurV.setBounds(799, 129, 200, 20);
		this.lMoteurV.repaint();
		
		
		this.lRoue = new JLabel();
		this.lRoue.setHorizontalAlignment(JLabel.LEFT);
		this.lRoue.setFont(lRoue.getFont().deriveFont(18f));
		this.add(this.lRoue);
		this.lRoue.setBounds(316, 433, 200, 20);
		this.lRoue.repaint();
		
		this.lRoueV = new JLabel();
		this.lRoueV.setHorizontalAlignment(JLabel.LEFT);
		this.lRoueV.setFont(lRoue.getFont().deriveFont(18f));
		this.add(this.lRoueV);
		this.lRoueV.setBounds(332, 457, 200, 20);
		this.lRoueV.repaint();
		
		
		// Autre 
		
		this.lMessage = new JLabel();
		this.lMessage.setText("TESSTTTSTS");
		this.lMessage.setHorizontalAlignment(JLabel.LEFT);
		this.lMessage.setFont(lMessage.getFont().deriveFont(23f));
		this.add(this.lMessage);
		this.lMessage.setBounds(100, 520, 500, 50);
		this.lMessage.repaint();
		
		
		//////////////////////////////  BOUTONS  /////////////////////////////////////
		
		
		bRetour = new BoutonPerso("Retour au menu");
		this.add(this.bRetour);
		this.bRetour.setBounds(820, 524, 170, 30);
		this.bRetour.repaint();
		
		bAmeliorerAero = new BoutonPerso("Améliorer (1000 Dc)");
		this.add(this.bAmeliorerAero);
		this.bAmeliorerAero.setBounds(761, 471, 170, 30);
		this.bAmeliorerAero.repaint();
		
		bAmeliorerChassis = new BoutonPerso("Améliorer (1000 Dc)");
		this.add(this.bAmeliorerChassis);
		this.bAmeliorerChassis.setBounds(25, 108, 170, 30);
		this.bAmeliorerChassis.repaint();
		
		bAmeliorerFrein = new BoutonPerso("Améliorer (1000 Dc)");
		this.add(this.bAmeliorerFrein);
		this.bAmeliorerFrein.setBounds(18, 384, 170, 30);
		this.bAmeliorerFrein.repaint();
		
		bAmeliorerMoteur = new BoutonPerso("Améliorer (1000 Dc)");
		this.add(this.bAmeliorerMoteur);
		this.bAmeliorerMoteur.setBounds(660, 165, 170, 30);
		this.bAmeliorerMoteur.repaint();
		
		bAmeliorerRoue = new BoutonPerso("Améliorer (1000 Dc)");
		this.add(this.bAmeliorerRoue);
		this.bAmeliorerRoue.setBounds(193, 491, 170, 30);
		this.bAmeliorerRoue.repaint();
		
		
		bRetour.addActionListener(ev -> modele.goMenuPrincipal());
		  
		bAmeliorerAero.addActionListener(ev -> {
			modele.ameliorerElementVoiture("Aerodynamique"); this.mettreAJour(); });
		 
		bAmeliorerChassis.addActionListener(ev -> {
			modele.ameliorerElementVoiture("Chassis"); this.mettreAJour(); });
		 
		bAmeliorerFrein.addActionListener(ev -> {
			modele.ameliorerElementVoiture("Frein"); this.mettreAJour(); });
		  
		bAmeliorerMoteur.addActionListener(ev -> {
			modele.ameliorerElementVoiture("Moteur"); this.mettreAJour(); });
		  
		bAmeliorerRoue.addActionListener(ev -> {
			modele.ameliorerElementVoiture("Roue"); this.mettreAJour(); });
		
		
		this.mettreAJour();
		
		
		
	}
	
	/** mets à jour la vue du menu */
	public void mettreAJour() {
		lBudget.setText("Budget : " + modele.getBudget() + " DogeCoins");
		lPoids.setText("Poids : " + modele.getPoids() + " Kg");
		lPerformance.setText("Performance : " + modele.getPerformance() + " %");
		lChassis.setText("" + modele.getChassis());
		lChassisV.setText("" + modele.getChassisV());
		lAero.setText("" + modele.getAerodynamique());
		lAeroV.setText("" + modele.getAerodynamiqueV());
		lFrein.setText("" + modele.getFrein());
		lFreinV.setText("" + modele.getFreinV());
		lMoteur.setText("" + modele.getMoteur());
		lMoteurV.setText("" + modele.getMoteurV());
		lRoue.setText("" + modele.getRoue());
		lRoueV.setText("" + modele.getRoueV());
		lMessage.setText(modele.getMessage());
		
		bAmeliorerAero.setText("Améliorer (" + modele.getPrixElementVoiture("Aerodynamique") + " Dc)");
		bAmeliorerChassis.setText("Améliorer (" + modele.getPrixElementVoiture("Chassis") + " Dc)");
		bAmeliorerFrein.setText("Améliorer (" + modele.getPrixElementVoiture("Frein") + " Dc)");
		bAmeliorerMoteur.setText("Améliorer (" + modele.getPrixElementVoiture("Moteur") + " Dc)");
		bAmeliorerRoue.setText("Améliorer (" + modele.getPrixElementVoiture("Roue") + " Dc)");
	}

	
	
}
