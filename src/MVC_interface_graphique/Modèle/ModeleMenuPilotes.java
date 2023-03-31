package MVC_interface_graphique.Modèle;

import MVC_interface_graphique.MdJ;

/** Cette classe gère le modèle du menu des pilotes
 * 
 * @version 1.0
 */
public class ModeleMenuPilotes {
	
	private MdJ mdj;		// Moteur de jeu
	
	public ModeleMenuPilotes(MdJ mdj) {
		this.mdj = mdj;
	}
	
	/** Retourner les infos sur le pilote 1
	 * @return les infos
	 */
	public String[] getInfosPilote1() {
		String[] Infos = new String[7];
		Infos[0] = "Prénom : " + mdj.getMonEcurie().getPilote1().getPrenom() + "\n";
		Infos[1] = "Nom : " + mdj.getMonEcurie().getPilote1().getNom() + "\n";
		Infos[2] = "Nationalité : " + mdj.getMonEcurie().getPilote1().getNationalite() + "\n";
		Infos[3] = "Age : " + Integer.toString(mdj.getMonEcurie().getPilote1().getAge()) + " ans\n";
		Infos[4] = "Sexe : " + mdj.getMonEcurie().getPilote1().getSexe() + "\n";
		Infos[5] = "Taille : " + Double.toString(mdj.getMonEcurie().getPilote1().getTaille()) + "m\n";
		Infos[6] = "Poids : " + Double.toString(mdj.getMonEcurie().getPilote1().getPoids()) + "kg\n";
		return Infos;
	}
	
	/** Retourner les infos sur le pilote 2
	 * @return les infos
	 */
	public String[] getInfosPilote2() {
		String[] Infos = new String[7];
		Infos[0] = "Prénom : " + mdj.getMonEcurie().getPilote2().getPrenom() + "\n";
		Infos[1] = "Nom : " + mdj.getMonEcurie().getPilote2().getNom() + "\n";
		Infos[2] = "Nationalité : " + mdj.getMonEcurie().getPilote2().getNationalite() + "\n";
		Infos[3] = "Age : " + Integer.toString(mdj.getMonEcurie().getPilote2().getAge()) + " ans\n";
		Infos[4] = "Sexe : " + mdj.getMonEcurie().getPilote2().getSexe() + "\n";
		Infos[5] = "Taille : " + Double.toString(mdj.getMonEcurie().getPilote2().getTaille()) + "m\n";
		Infos[6] = "Poids : " + Double.toString(mdj.getMonEcurie().getPilote2().getPoids()) + "kg\n";
		return Infos;
	}
	
	/** Retour au menu principal */
	public void goMenuPrincipal() {
		this.mdj.menuPrincipal();
	}
	
}
