package modele;

import java.util.*;

public class Marche {

	public final static int NB_ECURIES = 10;
	private Pilote[] pilotes;
	private Ecurie[] ecuries;
	private SortedMap<String, Integer> prix;

	/* Construction du marché des transferts */
	public Marche(Ecurie[] ecuries) {
		this.ecuries = ecuries;
		this.initPilote();
		this.initPrix();
	}

	/* Retourner la map avec le prix associé à chaque pilote */
	public Map<String, Integer> getPrix() {
		return prix;
	}
	
	/* Initialiser les pilotes dans chaque écurie */
	private void initPilote() {
		this.pilotes = new Pilote[this.ecuries.length*2];
		for (int i = 0; i < this.ecuries.length; i++) {
			this.pilotes[2*i] = this.ecuries[i].getPilote1();
			this.pilotes[2*i+1] = this.ecuries[i].getPilote2();
		}
	}

	/* Initialiser le prix de chaque pilote */
	private void initPrix() {
		this.prix = new TreeMap<>();
		for (int i = 0; i < this.pilotes.length; i++) {
			this.prix.put(this.pilotes[i].getNom(), 0);
		}
	}

	/* Afficher le marché des transferts */
	public String afficher() {
		Set<String> keys = this.prix.keySet();
		String affiche = "Marché des transferts\n\n";
		affiche = affiche + "Pilotes    :    Prix\n\n";
        for (String key : keys) {
            affiche = affiche + key;
            for (int i = 0; i < 10 - key.length(); i++) {
            	affiche = affiche + " ";
            }
            affiche = affiche + " :    " + this.prix.get(key) + "\n";
        }

        return affiche;
	}

	/* Changer le prix d'un pilote */
	public void setPrix(Integer nprix, String pilote) {
		Set<String> keys = this.prix.keySet();
		if (keys.contains(pilote)) {
			this.prix.put(pilote, nprix);
		}
	}
	
	/* Créer le marché des transferts */
	public static Marche creerMarcher() {
		Ecurie [] e = Ecurie.creerEcuries();
		Marche marche = new Marche(e);
		marche.setPrix(600000, "Hamilton");
		marche.setPrix(600000, "Verstappen");
		marche.setPrix(450000, "Leclerc");
		marche.setPrix(450000, "Perez");
		marche.setPrix(450000, "Bottas");
		marche.setPrix(380000, "Sainz Jr");
		marche.setPrix(350000, "Norris");
		marche.setPrix(250000, "Russell");
		marche.setPrix(200000, "Ricciardo");
		marche.setPrix(200000, "Gasly");
		marche.setPrix(180000, "Magnussen");
		marche.setPrix(150000, "Ocon");
		marche.setPrix(150000, "Vettel");
		marche.setPrix(120000, "Alonso");
		marche.setPrix(90000, "Tsunoda");
		marche.setPrix(90000, "Stroll");
		marche.setPrix(60000, "Albon");
		marche.setPrix(60000, "Schumi");
		marche.setPrix(60000, "Zhou");
		marche.setPrix(60000, "Latifi");
		return marche;
	}
	 
}

