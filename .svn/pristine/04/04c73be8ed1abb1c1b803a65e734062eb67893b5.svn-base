package modele;
import java.util.*;
import java.util.Map.Entry;

public class Classement {

		private static final Object[] String = null;
		/////////////////////////////////////////////////////////
		///// 				 AVEC DES MAP					/////
		/////////////////////////////////////////////////////////
	
	private MoteurDeCourse mdc; 
	
	public Classement(MoteurDeCourse m) {
		this.mdc = m;
	}
		
	public MoteurDeCourse getMdc() {
		return mdc;
	}

	public SortedSet<Map.Entry<String,Double>> entriesSortedByValues(Map<String,Double> map) {
	    SortedSet<Map.Entry<String,Double>> sortedEntries = new TreeSet<Map.Entry<String,Double>>(
	        new Comparator<Map.Entry<String,Double>>() {
	            @Override public int compare(Map.Entry<String,Double> e1, Map.Entry<String,Double> e2) {
	                int res = e1.getValue().compareTo(e2.getValue());
	                return res != 0 ? res : 1;
	            }
	        }
	    );
	    sortedEntries.addAll(map.entrySet());
	    return sortedEntries;
	}
	
	public void sort() {
		int i = 0;
		for (Entry<String, Double> entry  : entriesSortedByValues(this.mdc.getTempsCourse())) {
			i = i + 1;
			if (i < 10) {
				System.out.println("[" + i + "]  "+ entry.getKey()+" : "+ this.mdc.convertTime(entry.getValue()));
			} else {
				System.out.println("[" + i + "] " + entry.getKey()+" : "+ this.mdc.convertTime(entry.getValue()));
			}
		}
	}
	
	public String sortString() {
		String classement = "";
		int i = 0;
		for (Entry<String, Double> entry  : entriesSortedByValues(this.mdc.getTempsCourse())) {
			i = i + 1;
			classement = classement + '[' + i + ']' + ' ';
			if (i < 10) {
				classement = classement + ' ';
			}
			classement = classement + entry.getKey()+" : "+ this.mdc.convertTime(entry.getValue());
			classement = classement + "\n";
		}
		return classement;
	}
	
	public String getPremierString() {
		String premier = "";
		int i = 0;
		for (Entry<String, Double> entry  : entriesSortedByValues(this.mdc.getTempsCourse())) {
			i = i + 1;
			if (i == 1) {
				premier = premier + entry.getKey() +" : " + this.mdc.convertTime(entry.getValue());
			} 
		}
		return premier;
	}
	
	public String getSecondString() {
		String second = "";
		int i = 0;
		for (Entry<String, Double> entry  : entriesSortedByValues(this.mdc.getTempsCourse())) {
			i = i + 1;
			if (i == 2) {
				second = second + entry.getKey() +" : " + this.mdc.convertTime(entry.getValue());
			} 
		}
		return second;
	}
	
	public String getThirdString() {
		String third = "";
		int i = 0;
		for (Entry<String, Double> entry  : entriesSortedByValues(this.mdc.getTempsCourse())) {
			i = i + 1;
			if (i == 3) {
				third = third + entry.getKey() +" : " + this.mdc.convertTime(entry.getValue());
			} 
		}
		return third;
	}
	
	public String getRestString() {
		String rest = "";
		int i = 0;
		for (Entry<String, Double> entry  : entriesSortedByValues(this.mdc.getTempsCourse())) {
			i = i + 1;
			if (i > 3) {
				rest = rest + entry.getKey() +" : " + this.mdc.convertTime(entry.getValue());
				rest = rest + "\n";
			} 
		}
		return rest;
	}
	
	public int getTaille () {
		int i = 0;
		for (Entry<String, Double> entry  : entriesSortedByValues(this.mdc.getTempsCourse())) {
			i = i + 1;
		}
		return i;
	}
	
	public String[] getPremier() {		/////////////////////////////////////////////////////////
		///// 				 AVEC DES MAP					/////
		/////////////////////////////////////////////////////////
		String[] premier = new String[2];
		premier[0] = ""; 
		premier[1] = "";
		int i = 0;
		for (Entry<String, Double> entry  : entriesSortedByValues(this.mdc.getTempsCourse())) {
			i = i + 1;
			if (i == 1) {
				premier[0] = entry.getKey(); 
				premier[1] = this.mdc.convertTime(entry.getValue());
			} 
			
		}
		return premier;
	}
	
	public String[] getSecond() {
		String[] second = new String[2];
		second[0] = ""; 
		second[1] = "";
		int i = 0;
		for (Entry<String, Double> entry  : entriesSortedByValues(this.mdc.getTempsCourse())) {
			i = i + 1;
			if (i == 2) {
				second[0] = entry.getKey(); 
				second[1] = this.mdc.convertTime(entry.getValue());
			} 
			
		}
		return second;
	}

	public String[] getThird() {
		String[] third = new String[2];
		third[0] = ""; 
		third[1] = "";
		int i = 0;
		for (Entry<String, Double> entry  : entriesSortedByValues(this.mdc.getTempsCourse())) {
			i = i + 1;
			if (i == 3) {
				third[0] = entry.getKey(); 
				third[1] = this.mdc.convertTime(entry.getValue());
			} 
			
		}
		return third;
	}
	

	public String[][] getRest() {
		int taille = this.getTaille() - 3;		/////////////////////////////////////////////////////////
		///// 				 AVEC DES MAP					/////
		/////////////////////////////////////////////////////////
		String[][] rest = new String[taille][2];
		for (int i = 0; i < taille; i++) {
			rest[i][0] = "";
			rest[i][1] = "";
		}
		int i = 0;
		for (Entry<String, Double> entry  : entriesSortedByValues(this.mdc.getTempsCourse())) {
			i = i + 1;		/////////////////////////////////////////////////////////
			///// 				 AVEC DES MAP					/////
			/////////////////////////////////////////////////////////
			if (i > 3) {
				rest[i-4][0] = entry.getKey(); 
				rest[i-4][1] = this.mdc.convertTime(entry.getValue());
			} 
			
		}
		return rest;
	}
	
	public void afficherRest() {
		String[][] Reste = this.getRest();
		for (int i = 0; i < this.getTaille() - 3; i++) {
			int k = i + 4;
			System.out.println("Le " + k + "-ème " + "est " + Reste[i][0] + " avec un temps de : " + Reste[i][1]);
		}
	}
		/////////////////////////////////////////////////////////
		///// 				AVEC DES TABLEAUX               /////
		/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////
	///// 				 AVEC DES MAP					/////
	/////////////////////////////////////////////////////////
	//Problème avec l'initialisation..

//		/** Taille maximum du nombre d'objets */
//    	private final static int TAILLE_MAX = 11;
//
//		/** Liste des objets qu'on classe (à modifier)*/
//		private Pilote[] pilotes;
//		
//		///** Liste des rangs des objets  */
//		//private int[] rangs;
//
//		/** Constructeur par défaut lorsqu'il n'y a pas de pilote et on ajoutera*/
//		public Classement() {
//			this.pilotes = new Pilote[TAILLE_MAX];
//			//this.rangs = new int[TAILLE_MAX];
//		}
//	
//		public Classement(Pilote[] mesPilotes) {
//			this.pilotes = mesPilotes;
//			//this.rangs = mesRangs;
//		}
//		
//		void ajouterPilote(Pilote lePilote) {
//			this.pilotes = this.pilotes.
//		}
//		
//		void supprimerPilote(Pilote lePilote) {
//			
//		}
//		
//		void afficherRangPilote(Pilote lePilote) {
//			
//		}
//		
//		
//		void afficherClassement() {
//			
//		}

}
