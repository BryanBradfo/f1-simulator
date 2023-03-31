package modele;

import java.util.*;

public class MoteurDeCourse {


	private Circuit circuit;
	private Ecurie[] ecuries;
	private Pilote[] pilotes;
	
	
	private SortedMap<String, Double> tempsCourse;

	public MoteurDeCourse(Circuit circuit, Ecurie[] ecuries) {
		this.circuit = circuit;
		this.ecuries = ecuries;
		this.initPilote();
		this.tempsCourse = new TreeMap<>();
		this.initTempsCourse();
	}
	
	
	public Circuit getCircuit() {
		return circuit;
	}

	public Ecurie[] getEcuries() {
		return ecuries;
	}


	public Map<String, Double> getTempsCourse() {
		return tempsCourse;
	}

    
	public void lancerCourseJoueur() {
		for (int j = 1; j <= this.circuit.getNbTours(); j++) {
			double res = circuit.lancerTourCircuit(pilotes[0]);
			tempsCourse.replace(pilotes[0].getNom(), res);
			res = circuit.lancerTourCircuit(pilotes[1]);
			tempsCourse.replace(pilotes[1].getNom(), res);
		}
	}
	
	
	public void lancerTour(){
		for(int i = 0; i < this.pilotes.length; i++) {
			double res = circuit.lancerTourCircuit(pilotes[i]);
			tempsCourse.replace(pilotes[i].getNom(), tempsCourse.get(pilotes[i].getNom())+res);
		}
			
	}	
	
	
	public void lancerCourse(){
		for (int j = 1; j <= this.circuit.getNbTours(); j++) {
			lancerTour();
			/*
			// évènement pilote1 (peut être vide)
			int temps = Evenement.evenement(pilotes[0]);
			tempsCourse.replace(pilotes[0].getNom(), tempsCourse.get(pilotes[0].getNom())+temps);
			// évènement pilote2 (peut être vide)
			temps = Evenement.evenement(pilotes[1]);
			tempsCourse.replace(pilotes[1].getNom(), tempsCourse.get(pilotes[1].getNom())+temps);
			*/
			
		}	
	}
	
	
	private void initPilote() {
		this.pilotes = new Pilote[this.ecuries.length*2];
		for (int i = 0; i < this.ecuries.length; i++) {
			this.pilotes[2*i] = this.ecuries[i].getPilote1();
			this.pilotes[2*i+1] = this.ecuries[i].getPilote2();
		}
	}
	
	private void initTempsCourse() {
		for (int i = 0; i < this.pilotes.length; i++) {
			this.tempsCourse.put(this.pilotes[i].getNom(), 0.0);
		}
	}
	
	public String afficher() {
		Set<String> keys = this.tempsCourse.keySet();
		String affiche = "";
        for (String key : keys) {
            affiche = affiche + key + " --> " + convertTime(this.tempsCourse.get(key));
        }
        
        return affiche;
	}
	
	public String convertTime(double time) {
		if ((int)(time / 3600) > 0) {
			return (int) time/3600 + ":" + (int)time/60%60 + ":" + (int)time%60 + ":" + (int)(time%60%1*1000)+"\n";
		}
		return (int)time/60 + ":" + (int)time%60 + ":" + (int)(time%60%1*1000)+"\n";
	}
	
	
	
}
