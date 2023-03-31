package MVC_interface_graphique.Contrôle;

import java.awt.FlowLayout;

import javax.swing.*;

import MVC_interface_graphique.Modèle.ModeleMenuVoiture;
import MVC_interface_graphique.Vue.VueMenuVoiture;
import utils.BoutonPerso;

/** Cette classe s'occupe des boutons du menu de gestion de la voiture
 * 
 * @version 1.0 
 */
public class ControleMenuVoiture extends JPanel {
	
	private static final long serialVersionUID = -7838063749832914630L;			// Numéro de Série (utile si besoin de serialiser la classe)
	
	private ModeleMenuVoiture modele;
	private JButton bRetour;
	private JButton bAmeliorerAero;
	private JButton bAmeliorerChassis;
	private JButton bAmeliorerFrein;
	private JButton bAmeliorerMoteur;
	private JButton bAmeliorerRoue;
	
	public ControleMenuVoiture(ModeleMenuVoiture modele, VueMenuVoiture vue) {
		this.modele = modele;
		
		bRetour = new BoutonPerso("Retour au menu");
		bAmeliorerAero = new BoutonPerso("Améliorer (1000 Dc)");
		bAmeliorerChassis = new BoutonPerso("Améliorer (1000 Dc)");
		bAmeliorerFrein = new BoutonPerso("Améliorer (1000 Dc)");
		bAmeliorerMoteur = new BoutonPerso("Améliorer (1000 Dc)");
		bAmeliorerRoue = new BoutonPerso("Améliorer (1000 Dc)");
		
		
		bRetour.addActionListener(ev -> modele.goMenuPrincipal());
		  
		bAmeliorerAero.addActionListener(ev -> {
			modele.ameliorerElementVoiture("Aerodynamique"); vue.mettreAJour(); this.update(); });
		 
		bAmeliorerChassis.addActionListener(ev -> {
			modele.ameliorerElementVoiture("Chassis"); vue.mettreAJour(); this.update(); });
		 
		bAmeliorerFrein.addActionListener(ev -> {
			modele.ameliorerElementVoiture("Frein"); vue.mettreAJour(); this.update(); });
		  
		bAmeliorerMoteur.addActionListener(ev -> {
			modele.ameliorerElementVoiture("Moteur"); vue.mettreAJour(); this.update(); });
		  
		bAmeliorerRoue.addActionListener(ev -> {
			modele.ameliorerElementVoiture("Roue"); vue.mettreAJour(); this.update(); });
		
		this.update();
	}
	
	public void update() {
		bAmeliorerAero.setText("Améliorer (" + modele.getPrixElementVoiture("Aerodynamique") + " Dc)");
		bAmeliorerChassis.setText("Améliorer (" + modele.getPrixElementVoiture("Chassis") + " Dc)");
		bAmeliorerFrein.setText("Améliorer (" + modele.getPrixElementVoiture("Frein") + " Dc)");
		bAmeliorerMoteur.setText("Améliorer (" + modele.getPrixElementVoiture("Moteur") + " Dc)");
		bAmeliorerRoue.setText("Améliorer (" + modele.getPrixElementVoiture("Roue") + " Dc)");
	}

}
