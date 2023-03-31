package MVC_interface_graphique.Vue;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import MVC_interface_graphique.Modèle.ModeleMenuCourse;

public class VueMenuCourse extends JPanel {
	
	private static final long serialVersionUID = 6186398357323434628L;		// Numéro de Série (utile si besoin de serialiser la classe)
	private ModeleMenuCourse modele;	// Modèle du menu
	private JPanel phaut;						// JPanel en haut
	private JPanel imgCircuit;
	private JScrollPane pbas;						// JPanel en bas
	
	private JTextArea Premier;
	private JTextArea Deuxieme;
	private JTextArea Troisieme;
	private JTextArea Reste;
	
	public VueMenuCourse(ModeleMenuCourse modele) {
		this.modele = modele;
		this.setLayout(new BorderLayout());
		
//		JTextPane textPane = new JTextPane();
// 
//		StyledDocument documentStyle = textPane.getStyledDocument();
//		SimpleAttributeSet centerAttribute = new SimpleAttributeSet();
//		StyleConstants.setAlignment(centerAttribute, StyleConstants.ALIGN_CENTER);
//		documentStyle.setParagraphAttributes(0, documentStyle.getLength(), centerAttribute, false);
		
		this.phaut = new JPanel();
		this.imgCircuit = new JPanel();
		
		this.phaut.setLayout(new BorderLayout());
		this.imgCircuit.setLayout(new BorderLayout());

		 
		this.Premier = new JTextArea();
		Premier.setEditable(false);
		Premier.setOpaque(false);
		//this.Premier.setHorizontalAlignment(JTextArea.CENTER_ALIGNMENT);
		this.Premier.setFont(Premier.getFont().deriveFont(35f));
		this.phaut.add(this.Premier, BorderLayout.NORTH);
		
		this.Deuxieme = new JTextArea();
		Deuxieme.setEditable(false);
		Deuxieme.setOpaque(false);
		//this.Deuxieme.setHorizontalAlignment(JTextArea.CENTER_ALIGNMENT);
		this.Deuxieme.setFont(Deuxieme.getFont().deriveFont(30f));
		this.phaut.add(this.Deuxieme, BorderLayout.WEST);
		
		this.Troisieme = new JTextArea();
		Troisieme.setEditable(false);
		Troisieme.setOpaque(false);
		//this.Troisieme.setHorizontalAlignment(JTextArea.CENTER_ALIGNMENT);
		this.Troisieme.setFont(Troisieme.getFont().deriveFont(25f));
		this.phaut.add(this.Troisieme, BorderLayout.EAST);
		
		this.Reste = new JTextArea();
		Reste.setEditable(false);
		Reste.setOpaque(false);
		//this.Reste.setHorizontalAlignment(JTextArea.LEFT_ALIGNMENT);
		this.Reste.setFont(Reste.getFont().deriveFont(18f));
		this.pbas = new JScrollPane(this.Reste);
		this.pbas.setLayout(new ScrollPaneLayout());
		
		ImageIcon circuit =  new ImageIcon("img/Circuit_Bahrain.png");
		JLabel label = new JLabel();
		label.setIcon(circuit);
		this.imgCircuit.add(label);
		
		
		this.add(phaut, BorderLayout.EAST);
		this.add(imgCircuit, BorderLayout.CENTER);
		this.add(pbas, BorderLayout.EAST);
		
		for (int i = 1; i <= modele.getNbTours(); i++){
			mettreAJour();
		}
	 
	}
	
	public void mettreAJour() {
		this.Reste.setText(Integer.toString(1)+".	"+  modele.getPremier()[0] + "     	" + modele.getPremier()[1]+ "\n");
		this.Reste.append(Integer.toString(2)+".	"+  modele.getSecond()[0] + "     	" + modele.getSecond()[1]+ "\n");
		this.Reste.append(Integer.toString(3)+".	"+  modele.getThird()[0] + "     	" + modele.getThird()[1]+ "\n");
		String[][] leReste = modele.getReste();
		String listePilotes = "";
		for (int i = 0; i < leReste.length; i++) {
			listePilotes = listePilotes + Integer.toString(i+4) + ".	" + leReste[i][0] + "     	" + leReste[i][1] + "\n";
		}		
		this.Reste.append( listePilotes);
	}

}
