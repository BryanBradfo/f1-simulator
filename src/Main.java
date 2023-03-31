import javax.swing.SwingUtilities;

import MVC_interface_graphique.MdJ;

/** Cette classe sert à lancer le jeu !
 * 
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {
		
		// Sert à être pour mettre l'apllication graphique dans le thread de Swing
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MdJ mdj = new MdJ();
				mdj.menuLancement();
			}
		});
	}

}
	