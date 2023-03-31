package modele;

import java.util.Random;

/** Un circuit est localisé dans un pays et à un nom.
* Il a un nombre de tours établis, une longueur et donc une distance de course totale.
* Il y a aussi un nombre de virages, plus ou moins rapides.
* Des records sont déjà établis pour le circuit et servent de référence.
*
* @author  Hautesserres Simon
* @version 1.0
*/

public class Circuit {
	
	private final static int MAX_NB_SECTEURS = 3;
	
	/** Nom du circuit */
	private String nom;
	/** Pays où se situe le circuit */
	private String pays;
	/** Nombre de Tours du circuit pendant une course */
	private int nbTours;
	/** Longueur du circuit en Kilomètres */
	private double longueur; // Longueur du circuit (donc 1 seul tour) en km
	/** Distance en kilomètres de la Course */
	private double distanceCourse; // Distance totale de la course : nbTours * longueur en km
	/** Nombre de virages total du circuit */
	private int nbVirages;
	/** Liste des trois secteurs composés de virages */
	private Secteurs [] secteurs;
	/** Nombre de zones DRS sur un tour */
	private int zonesDRS;
	/** Zones des stands associés au circuit */
	private Stands stand;
	/** Pilote associé au meilleur tour réalisé en course */
	private Pilote meilleurPilote;
	/** Temps en minutes, secondes, millisecondes du record du tour effectué en course */
	private String recordTour;
	/** Etat du circuit */
	private EtatCircuit etat;
	
	/** Construire le circuit à partir de son nom, son pays, son nombre de tours, sa longueur
	 * le nombre de virages et la liste de ceux ci, le meilleur tour avec le pilote et l'etat du circuit
	 * @param nom la nom du circuit
	 * @param pays le nom pays où est le circuit
	 * @param longueur la longueur du circuit
	 * @param nbVirages le nombre de virages
	 * @param zonesDRS le nombre de zones DRS
	 * @param secteurs  les 3 secteurs du circuit avec leurs éléments respectifs
	 * @param stand le stands associé au circuit
	 * @param pilote le pilote associé au meilleur tour
	 * @param recordTour le record du tour 
	 */
	public Circuit (String nom, String pays, int nbTours, double longueur, int nbVirages, 
					int zonesDRS, Secteurs [] secteurs, Stands stand, Pilote pilote, String recordTour ) {
		this.nom = nom;
		this.pays = pays;
		this.nbTours = nbTours;
		this.longueur = longueur;
		this.distanceCourse = longueur*nbTours;
		this.nbVirages = nbVirages;
		this.secteurs = secteurs;
		this.zonesDRS = zonesDRS;
		this.stand = Stands.creerStands(stand.getNombrePlaces(), stand.getLongueur(),
				stand.getVitesseMoyenne(), stand.getTempsArretMoyen());
		this.meilleurPilote = Pilote.creerPilote(pilote.getNom(), pilote.getPrenom(), pilote.getNationalite(),
				pilote.getNumero(), pilote.getAge(), pilote.getSexe(), pilote.getTaille(), pilote.getPoids(), pilote.getExp());
		this.recordTour = recordTour;
		this.etat = new EtatCircuit();
		
	}
	
	/** Retourne l'état du circuit
	 * @return etat
	 */
	public EtatCircuit getEtat() {
		return this.etat;
	}

	/** Retourne le nom du circuit
	 * @return nom
	 */
	public String getNom() {
		return this.nom;
	}

	/** Retourne le pays où se situe le circuit
	 * @return pays
	 */
	public String getPays() {
		return this.pays;
	}

	/** Retourne le nombre de tours d'une course sur ce circuit
	 * @return nbTours
	 */
	public int getNbTours() {
		return this.nbTours;
	}

	/** Retourne la longueur d'un tour de cirucit
	 * @return longueur
	 */
	public double getLongueur() {
		return this.longueur;
	}

	/** Retourne la voie des stands
	 * @return stand
	 */
	public Stands getStand() {
		return stand;
	}


	/** Retourne la distance de la Course
	 * @return distanceCourse
	 */
	public double getDistanceCourse() {
		return this.distanceCourse;
	}

	/** Retourne le nombre de virages du circuit
	 * @return nbVirages
	 */
	public int getNbVirages() {
		return this.nbVirages;
	}
	
	/** Retourne le nombre de zones de DRS
	 * @return zonesDRS
	 */
	public int getZonesDRS() {
		return this.zonesDRS;
	}
	
	/** Retourne le pilote détenant le record du tour
	 * @return meilleurPilote
	 */
	public Pilote getMeilleurPilote() {
		return this.meilleurPilote;
	}

	/** Retourne le record du Tour du Circuit
	 * @return recordTour
	 */
	public String getRecordTour() {
		return this.recordTour;
	}

	/** Calcul du temps du temps minimal possible sur le circuit sans prendre en compte les performances 
	 * @return temps minimal du circuit 
	 */
	public double calculerTempsMinimal() {
		return this.secteurs[0].tempsPassage() + this.secteurs[1].tempsPassage() + this.secteurs[2].tempsPassage() ;
	}
	
	/** Calcul du temps du circuit en prenant en compte des performances de la voiture, du Pilote,
	 * de l'état du circuit (drapeau jaune, météo, adhérence du bitume) et du temps minimum potentiel
	 * @param voiture la voiture et ses performances ont une grande influence sur le temps pouvant être réalise en course
	 * @param etat etat du circuit qui influence le temps sur un tour
	 */
	public double lancerTourCircuit(Pilote pilote) {
		Random random = new Random();
		return calculerTempsMinimal() + 0.5*(100-pilote.getVoiture().getIndicesPerformances())/100 + 0.5*(100-pilote.getExp().getBoost())/100 +
				0.5*(100-this.etat.getBitumePerformances())/100 +1*(double)random.nextInt(1001)/1000;
	}
	
	
	/** Créer et retourne une modélisation du circuit de bahrein avec des distances et des vitesse réalistes
	 * @return circuit de bahrein
	 */
	public static Circuit creerCircuitBahrein() {
		/* Creation du tableau de secteurs */
		Secteurs [] secteurs = new Secteurs[MAX_NB_SECTEURS];
		/* SECTEUR 1 */
		ElementCircuit [] elementS1 = new ElementCircuit[9];
		elementS1[0] = new LigneDroites(733,290,true);
		elementS1[1] = new ViragesLents(1,51,90);
		elementS1[2] = new LigneDroites(50,135,false);
		elementS1[3] = new ViragesMoyens(2,50,160);
		elementS1[4] = new LigneDroites(60,215,false);
		elementS1[5] = new ViragesRapides(3,70,220);
		elementS1[6] = new LigneDroites(540,275,true);
		elementS1[7] = new ViragesLents(4,90,125);
		elementS1[8] = new LigneDroites(200,210,false);
		secteurs[0] = new Secteurs(1, elementS1);
		
		/* SECTEUR 2 */
		ElementCircuit [] elementS2 = new ElementCircuit[14];
		elementS2[0]= new ViragesRapides(5, 60, 250);
		elementS2[1]= new ViragesMoyens(6, 80, 210);
		elementS2[2]= new ViragesMoyens(7, 110, 205);
		elementS2[3] = new LigneDroites(180,240,false);
		elementS2[4]= new ViragesLents(8, 75, 80);
		elementS2[5] = new LigneDroites(290,230,false);
		elementS2[6]= new ViragesMoyens(9, 80, 210);
		elementS2[7] = new LigneDroites(50,120,false);
		elementS2[8]= new ViragesLents(10, 70, 80);
		elementS2[9] = new LigneDroites(700,285,true);
		elementS2[10]= new ViragesMoyens(11, 250, 180);
		elementS2[11] = new LigneDroites(75,250,false);
		elementS2[12]= new ViragesRapides(12, 175, 275);
		elementS2[13] = new LigneDroites(75,280,false);
		secteurs[1] = new Secteurs(2, elementS2);
		
		/* SECTEUR 3 */
		ElementCircuit [] elementS3 = new ElementCircuit[7];
		elementS3[0]= new ViragesMoyens(13, 120, 150);
		elementS3[1]= new ViragesMoyens(14, 60, 140);
		elementS3[2]= new ViragesMoyens(15,60, 180);
		elementS3[3] = new LigneDroites(50,250,false);
		elementS3[4] = new LigneDroites(750,280,false);
		elementS3[5] = new LigneDroites(50,170,false);
		elementS3[6] = new LigneDroites(350,280,true);
		secteurs[2] = new Secteurs(3, elementS3);
		
		return new Circuit("International de Sahkir", "Bahreïn",57, 5.412, 15, 3, secteurs, new Stands(20, 600, 80, 30), 
				new Pilote("Hamilton", "Lewis", "Anglais",44, 37, "M", 50.0, 50.0, new Experience(50, 33, 100)), "1:27:264");
	}
	
	/** Retourner le secteur dans lequel se situe la voiture
	 * 
	 */
	
	@Override
	public String toString() {
		return "== Grand Prix de "+ this.pays + " ==\nCircuit " + nom + "\nNombre Tours : " + nbTours + "\nLongueur : " + longueur
				+ "\nDistance Course : " + this.distanceCourse + "\nNombre Virages :" + nbVirages + "\nZones DRS : " + zonesDRS
				+ "\nMeilleur Tour : " + this.recordTour + " realisé par " + this.meilleurPilote.getPrenom() + 
				this.meilleurPilote.getPrenom()+"\n" + etat;
	}
	
	
	
	
	

}
