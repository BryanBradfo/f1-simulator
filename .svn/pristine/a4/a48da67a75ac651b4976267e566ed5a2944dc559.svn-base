package utils;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MouseListenerPerso implements MouseListener{
	
	private JButton bouton;
	private ImageIcon img, img_touche, img_presse;
	
	public MouseListenerPerso(JButton bouton, ImageIcon img, ImageIcon img_touche, ImageIcon img_presse) {
		this.img = img;
		this.img_presse = img_presse;
		this.img_touche = img_touche;
		this.bouton = bouton;
	}
	
	 /**
     * Invoked when the mouse button has been clicked (pressed
     */
    public void mouseClicked(MouseEvent e){
    	this.bouton.setIcon(img_presse);
    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     */
    public void mousePressed(MouseEvent e){
    	this.bouton.setIcon(img_presse);
    }

    /**
     * Invoked when a mouse button has been released on a component.
     */
    public void mouseReleased(MouseEvent e){
    	if (e.getComponent() == this.bouton) {
    		this.bouton.setIcon(img_touche);
    	} else {
    		this.bouton.setIcon(img);
    	}
    	
    }

    /**
     * Invoked when the mouse enters a component.
     */
    public void mouseEntered(MouseEvent e){
    	this.bouton.setIcon(img_touche);
    }

    /**
     * Invoked when the mouse exits a component.
     */
    public void mouseExited(MouseEvent e)
    {
         this.bouton.setIcon(img);
    }

}
