package modele;

import java.io.Serializable;
import java.util.Arrays;

import exceptions.BudgetInsuffisantException;
import exceptions.NomInvalideException;

public class Ecurie implements Serializable {
	public final static int NB_ECURIES = 10;
	private static final long serialVersionUID = 4661189986917112194L;		// Numéro de Série (permet d'éviter des erreurs de sérialisation de la classe)
	private String nom;
	private String description;
	private String[] sponsors;
	private int budget;
	private int classement;
	private Experience exp; // a changer pour la classe
	
	/** Deux pilotes propres à chaque écurie
	 */
	private Pilote[] pilotes;
	
	/** L'écurie a un modèle améliorable de voiture, les pilotes commencent chaque course avec une voiture ayant ces mêmes caractéristiques.
	 */
	private Voiture voiture;
	
	
	public static Ecurie CreerEcurieSimple(){
		String[] defaultsp = {"Nestle", "Adidas", "Ada", null};
		return new Ecurie("Roger", "Gerard", defaultsp, 10000, 1, Pilote.creerPilotebasique(), Pilote.creerPilotebasique2(), Voiture.creerVoitureBasique());
	} 
	
	public static Ecurie[] creerEcuries() {
		Ecurie [] e = new Ecurie[NB_ECURIES];
		Pilote [] p = new Pilote[2*NB_ECURIES];
		String [] s1 = new String[1];
		s1[0] = "Petronas";
		String [] s2 = new String[1];
		s2[0] = "Vodafone";
		String [] s3 = new String[1];
		s3[0] = "E-Tech";
		/* PILOTES FERRARI */
		p[0] = new Pilote("Leclerc", "Charles", "Monégasque", 16, 25, "M", 1.80, 70, new Experience());
		p[1] = new Pilote("Sainz Jr", "Carlos", "Espagnol", 55, 27, "M", 1.78, 66, new Experience());
		/* PILOTES ALPINE */
		p[2] = new Pilote("Alonso", "Fernando", "Espagnol", 14, 40, "M", 1.71, 69, new Experience());
		p[3] = new Pilote("Ocon", "Esteban", "Français", 31, 25, "M", 1.86, 66, new Experience());
		/* PILOTES MERCEDES */
		p[4] = new Pilote("Hamilton", "Lewis", "Anglais", 44, 37, "M", 1.75, 73, new Experience());
		p[5] = new Pilote("Russell", "George", "Anglais", 63, 24, "M", 1.85, 70, new Experience());
		/* PILOTES MCLAREN */
		p[6] = new Pilote("Norris", "Lando", "Anglais", 4, 22, "M", 1.70, 68, new Experience());
		p[7] = new Pilote("Ricciardo", "Daniel", "Australien", 3, 32, "M", 1.75, 64, new Experience());
		/* PILOTES REDBULL */
		p[8] = new Pilote("Verstappen", "Max", "Néerlandais", 1, 24, "M", 1.80, 67, new Experience());
		p[9] = new Pilote("Perez", "Sergio", "Mexicain", 11, 32, "M", 1.73, 63, new Experience());
		/* PILOTES ALPHA ROMEO */
		p[10] = new Pilote("Bottas", "Valtteri", "Finlandais", 77, 32, "M", 1.73, 69, new Experience());
		p[11] = new Pilote("Zhou", "Guanyu", "Chinois", 24, 22, "M", 1.80, 65, new Experience());
		/* PILOTES ALPHA TAURI */
		p[12] = new Pilote("Gasly", "Pierre", "Français", 10, 40, "M", 1.77, 70, new Experience());
		p[13] = new Pilote("Tsunoda", "Yuki", "Japonais", 21, 22, "M", 1.59, 54, new Experience());
		/* PILOTES ASTON MARTIN */
		p[14] = new Pilote("Vettel", "Sebastian", "Allemand", 5, 34, "M", 1.75, 62, new Experience());
		p[15] = new Pilote("Stroll", "Lance", "Canadien", 18, 23, "M", 1.80, 70, new Experience());
		/* PILOTES WILLIAMS */
		p[16] = new Pilote("Albon", "Alexander", "Thaïlandais", 23, 26, "M", 1.85, 78, new Experience());
		p[17] = new Pilote("Latifi", "Nicolas", "Canadien", 31, 27, "M", 1.85, 65, new Experience());
		/* PILOTES HAAS */
		p[18] = new Pilote("Magnussen", "Kévin", "Danois", 20, 29, "M", 1.74, 68, new Experience());
		p[19] = new Pilote("Schumi", "Mick", "Allemand", 47, 25, "M", 1.75, 74, new Experience());
		/* ECURIES */
		e[0] = new Ecurie("Ferrari", "Ecurie myhtique des tifosi", s1, 10000, 2, p[0], p[1], new Voiture("Ferrari", 750, 90, false));
		e[1] = new Ecurie("Mercedes", "Champion Constructeur", s1, 10000, 1, p[4], p[5], new Voiture("Mercedes", 750, 80, false));
		e[2] = new Ecurie("RedBull", "Champion Pilote", s1, 10000, 1, p[8], p[9], new Voiture("RedBull", 750, 75, false));
		e[3] = new Ecurie("McLaren", "Eternel troisième", s1, 10000, 1, p[6], p[7], new Voiture("McLaren", 750, 65, false));
		e[4] = new Ecurie("Alpha Romeo", "Ferrari en moins bien", s1, 10000, 1, p[10], p[11], new Voiture("Alpha Romeo", 750, 60, false));
		e[5] = new Ecurie("Alpha Tauri", "Redbull en moins bien", s1, 10000, 1, p[12], p[13], new Voiture("Alpha Tauri", 750, 50, false));
		e[6] = new Ecurie("Williams", "Ecurie mythique", s1, 10000, 1, p[16], p[17], new Voiture("Williams", 750, 30, false));
		e[7] = new Ecurie("Aston Martin", "NUL", s1, 10000, 1, p[14], p[15], new Voiture("Aston Martin", 750, 10, false));
		e[8] = new Ecurie("Alpine", "LA FRAANCE", s1, 10000, 1, p[2], p[3], new Voiture("Alpine", 750, 60, false));
		e[9] = new Ecurie("Haas", "CHAMPION", s1, 10000, 1, p[18], p[19], new Voiture("Haas", 750, 20, false));
		return e;
	}
	
	public static Ecurie [] selectionerOpposants (Ecurie monEcurie, Ecurie[] ecuries) {
		Ecurie [] e = new Ecurie[NB_ECURIES];
		int indices_ecuries = 1;
		e[0] = monEcurie;
		for (int i = 0; i < NB_ECURIES && indices_ecuries < NB_ECURIES; i ++) {
			if (!monEcurie.getNom().contentEquals(ecuries[i].getNom())) {
				e[indices_ecuries] = ecuries[i];
				indices_ecuries ++;
			}
			
		}

		return e;
	}

	public Ecurie(String nom, String description, String[] sponsors, int budget, int classement,Pilote p1, Pilote p2, Voiture v) {
		this.nom = nom;
		this.description = description;
		this.sponsors = sponsors;
		this.budget = budget;
		this.classement = classement;
		this.exp = new Experience();
		this.pilotes = new Pilote[2];
		this.pilotes[0] = new Pilote(p1.getNom(), p1.getPrenom(), p1.getNationalite(), p1.getNumero(), p1.getAge(), p1.getSexe(), p1.getTaille(), p1.getPoids(), p1.getExp());
		this.pilotes[1] = new Pilote(p2.getNom(), p2.getPrenom(), p2.getNationalite(), p2.getNumero(), p2.getAge(), p2.getSexe(), p2.getTaille(), p2.getPoids(), p2.getExp());
		this.voiture = v.copierVoiture();
		this.pilotes[0].setVoiture(this.voiture);
		this.pilotes[1].setVoiture(this.voiture);
	}
	
	// Getters
	/** Renvoie le nom de l'écurie choisi par le programmeur
	 * @return nom de l'écurie
	 */
	public String getNom() {
		return this.nom;
	}

	/** Renvoie l'expérience de l'écurie
	 * @return expérience de l'écurie
	 */
	public Experience getExp() {
		return exp.copierExperience();
	}

	/** Renvoie des informations historique de l'écurie :
	 * La date de création, etc...
	 * @return description de l'écurie
	 */
	public String getDescription() {
		return this.description;
	}
	
	/** Renvoie le tableau des sponsors de l'écurie
	 * @return tableau de sponsors
	 */
	public String[] getSponsors() {
		int i;
		for(i = 0; this.sponsors[i] != null; ++i);
		String[] res = new String[i];
		for (int j = 0; j < i; j++) {
			res[j] = this.sponsors[j];
		}
		
		return this.sponsors;
	}
	
	/** Renvoie le budget de l'écurie
	 * @return budget
	 */
	public int getBudget() {
		return this.budget;
	}
	
	/**Renvoie le classement de l'écurie 
	 * @return classement
	 */
	public int getClassement() {
		return this.classement;
	}
	
	/**Renvoie les deux pilotes associés à l'écurie
	 * @return tableau de pilote
	 */
	public Pilote[] getPilotes() {
		Pilote[] p = new Pilote[2];
		p[0] = this.pilotes[0].copierPilote();
		p[1] = this.pilotes[1].copierPilote();
		return p;
	}
	
	public Pilote getPilote1() {
		return this.pilotes[0].copierPilote();
	}

	public Pilote getPilote2() {
		return this.pilotes[1].copierPilote();
	}

	/**Renvoie la voiture associée à l'écurie
	 * @return voiture
	 */
	public Voiture getVoiture() {
		 return this.voiture.copierVoiture();
	}
	
	public Experience getExperience() {
		return this.exp.copierExperience();
	}
	
	public void calculerExperience(Classement classement) {
		if (classement.getPremier()[0].equals(this.pilotes[0].getNom()) || classement.getPremier()[0].equals(this.pilotes[1].getNom())){
			this.gagnerExperience(90.0);
		}

		if (classement.getSecond()[0].equals(this.pilotes[0].getNom()) || classement.getSecond()[0].equals(this.pilotes[1].getNom())){
			this.gagnerExperience(95.0);
		}

		if (classement.getThird()[0].equals(this.pilotes[0].getNom()) || classement.getThird()[0].equals(this.pilotes[1].getNom())){
			this.gagnerExperience(95.0);
		}

		String [][] rest = classement.getRest();
		for (int k = 0; k < rest.length; k++) {
			if (rest[k][0].equals(this.pilotes[0].getNom()) || rest[k][0].equals(this.pilotes[1].getNom())){
				this.gagnerExperience(90.0);
			}
		}
	}
	
	// Méthodes
	/**Calcul le budget disponible de l'écurie à partir de son budget actuel et son classement
	 * 
	 * @return le nouveau budget
	 */
	public void calculerBudget(Classement classement) {
		int budget = 2000;
		if (classement.getPremier()[0].equals(this.pilotes[0].getNom()) || classement.getPremier()[0].equals(this.pilotes[1].getNom())){
			this.budget += budget;
		}
		budget-=50;
		if (classement.getSecond()[0].equals(this.pilotes[0].getNom()) || classement.getSecond()[0].equals(this.pilotes[1].getNom())){
			this.budget += budget;
		}
		budget-=50;
		if (classement.getThird()[0].equals(this.pilotes[0].getNom()) || classement.getThird()[0].equals(this.pilotes[1].getNom())){
			this.budget += budget;
		}
		budget-=50;
		String [][] rest = classement.getRest();
		for (int k = 0; k < rest.length; k++) {
			if (rest[k][0].equals(this.pilotes[0].getNom()) || rest[k][0].equals(this.pilotes[1].getNom())){
				this.budget += budget;
			}
			budget-=50;
		}
	}
	
	/**Calcul le gain d'expérience de l'écurie après la course
	 * @param exp
	 */
	public void gagnerExperience(double exp) {
		this.exp.augmenterProgression(exp);
	}
	
	/** Calcul le boost d'expérience de l'écurie en fonction de son niveau actuel et de son classement
	 * Utilisé par gagnerExperience
	 * @return boost
	 */
	private double calculerBoost() {
		return 1.0;//return this.classement + this.exp;//.getNiveau()/10;
	}
	
	/** Calcule le cout d'amélioration de la voiture
	 * @return le cout d'amélioration de la voiture
	 */
	public int coutAmeliorerVoiture() {
		return 100*this.voiture.getIndicesPerformances();
	}
	
	
	public int coutAmeliorerAerodynamique() {
		return (int) (20*this.voiture.getAero().getAerodynamismeMax());
	}
	
	public int coutAmeliorerChassis() {
		return (int) (20*this.voiture.getChassis().getEfficaciteMax());
	}
	
	public int coutAmeliorerFrein() {
		return (int) (20*this.voiture.getFrein().getEfficaciteMax());
	}
	
	public int coutAmeliorerMoteur() {
		return (int) (20*this.voiture.getMoteur().getPuissanceMax());
	}
	
	public int coutAmeliorerRoue() {
		return (int) (20*this.voiture.getRoue().getAdherenceMax());
	}
	
	
	/** Améliore la voiture de l'écurie que les pilotes utilisent
	 * @throws BudgetInsuffisantException 
	 */
	public void ameliorerVoiture() throws BudgetInsuffisantException {
		int coutlevelup = 100 * this.voiture.getIndicesPerformances();
		if (this.budget < coutlevelup) {
			throw new BudgetInsuffisantException();
		}
		this.voiture.ameliorerPerformances();
		this.pilotes[0].setVoiture(this.voiture);
		this.pilotes[1].setVoiture(this.voiture);
		this.budget -= coutlevelup;
		
	}

	/** Améliore un élément particulier de la voiture
	 * @param nomElement Aérodynamique | Chassis | Frein | Moteur | Roue
	 * @throws BudgetInsuffisantException
	 */
	public void ameliorerElementVoiture(String nomElement) throws BudgetInsuffisantException, NomInvalideException {
		int coutlevelup = -1;
		switch(nomElement) {
		case "Aerodynamique":
			coutlevelup = this.coutAmeliorerAerodynamique();
			break;
		case "Chassis":
			coutlevelup = this.coutAmeliorerChassis();
			break;
		case "Frein":
			coutlevelup = this.coutAmeliorerFrein();
			break;
		case "Moteur":
			coutlevelup = this.coutAmeliorerMoteur();
			break;
		case "Roue":
			coutlevelup = this.coutAmeliorerRoue();
			break;
		default:
			throw new NomInvalideException();
		}
		if (coutlevelup > -1) {
			if (this.budget < coutlevelup){
				throw new BudgetInsuffisantException();
			}
			boolean reussite = this.voiture.ameliorerElementVoiture(nomElement);
			if (reussite) {
				this.pilotes[0].setVoiture(this.voiture);
				this.pilotes[1].setVoiture(this.voiture);
				this.budget -= coutlevelup;
			}
		}
	}
	
	/** Renvoie le prix de l'amélioration d'un élément particulier de la voiture
	 * @param nomElement Aérodynamique | Chassis | Frein | Moteur | Roue
	 * @throws NomInvalideException
	 */
	public int getPrixElementVoiture(String nomElement) throws NomInvalideException {
		int coutlevelup = -1;
		switch(nomElement) {
		case "Aerodynamique":
			coutlevelup = this.coutAmeliorerAerodynamique();
			break;
		case "Chassis":
			coutlevelup = this.coutAmeliorerChassis();
			break;
		case "Frein":
			coutlevelup = this.coutAmeliorerFrein();
			break;
		case "Moteur":
			coutlevelup = this.coutAmeliorerMoteur();
			break;
		case "Roue":
			coutlevelup = this.coutAmeliorerRoue();
			break;
		default:
			throw new NomInvalideException();
		}
		return coutlevelup;
	}
	
	public void reparervoiture() {
		this.voiture.reparerVoiture();
	}
	

	// equals et toString
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ecurie other = (Ecurie) obj;
		if (budget != other.budget)
			return false;
		if (classement != other.classement)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (exp == null) {
			if (other.exp != null)
				return false;
		} else if (!exp.equals(other.exp))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (!Arrays.equals(pilotes, other.pilotes))
			return false;
		if (!Arrays.equals(sponsors, other.sponsors))
			return false;
		if (voiture == null) {
			if (other.voiture != null)
				return false;
		} else if (!voiture.equals(other.voiture))
			return false;
		return true;
	}

	@Override
	public String toString(){
		String sp = "";
		for (int i = 0; this.sponsors[i] != null; i++){
			sp = sp + this.sponsors[i] + ", ";	
		}
		return "Ecurie : " + this.nom + " \n" + this.description +"\nSponsors: "+ sp + "budget: " + this.budget + " DOGE coins, classement: " + 
		this.classement + "\n" + this.exp.toString() + "\nPilote 1 : " + this.pilotes[0].toString() + "\nPilote 2 : " + this.pilotes[1].toString() + 
		"\n" + this.voiture.toString() + "\n";

	}

	
	
}