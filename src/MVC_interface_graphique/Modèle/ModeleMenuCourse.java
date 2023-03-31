package MVC_interface_graphique.Modèle;

import MVC_interface_graphique.MdJ;
import modele.Classement;
import modele.Ecurie;
import modele.Circuit;

/** Cette classe est le modèle du menu lors d'une course
 * 
 * @version 1.3
 */

public class ModeleMenuCourse {
	private MdJ mdj;				// Le moteur de jeu
	private Ecurie [] ecuries;		// Les écuries parmi lesquelles choisir
	private Classement classement; // Le classement en temps réel dans la course
	private Circuit circuit; // Le circuit où se déroule la course
	
	public ModeleMenuCourse(MdJ mdj, Ecurie [] ecuries, Classement classement, Circuit circuit) {
		this.mdj = mdj;
		this.ecuries = ecuries;
		this.classement = classement;
		this.circuit = circuit;
	}
	
	/** @return les infos du premier de la course */
	public String[] getPremier() {
		return this.classement.getPremier();
	}
	
	/** @return les infos du second de la course */
	public String[] getSecond() {
		return this.classement.getSecond();
	}
	
	/** @return les infos du troisièmre de la course */
	public String[] getThird() {
		return this.classement.getThird();
	}
	
	/** @return les infos du reste des participants */
	public String[][] getReste() {
		return this.classement.getRest();
	}
	
	/** Revenir au Menu principal */
	public void goResultatsCourse() {
		this.mdj.menuResultat(classement);
	}
	
	public int getNbTours() {
		return this.circuit.getNbTours();
	}
	
}
