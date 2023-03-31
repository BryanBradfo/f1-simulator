package utils;

import org.junit.Before;
import org.junit.Test;

import exceptions.BudgetInsuffisantException;
import modele.Ecurie;

public class SauvegardeTest {
	
	private Ecurie[][] ecuries = new Ecurie[3][10];
	@SuppressWarnings("unused")
	private Ecurie[][] ecuries2 = new Ecurie[3][10];

	@Before public void setUp() {
		ecuries[0] = Ecurie.creerEcuries();
		ecuries[1] = Ecurie.creerEcuries();
		ecuries[2] = Ecurie.creerEcuries();
		try {
			ecuries[0][1].ameliorerVoiture();
		} catch (BudgetInsuffisantException e1) {
			e1.printStackTrace();
		}
	}
	
	@Test public void saveTest() {
		Sauvegarde.Sauvegarder(ecuries);
		System.out.println("Sauvegardé");
		ecuries2 = Sauvegarde.RecupSauvegarde();
		System.out.println("Récupéré");
		System.out.println("Budget : " + ecuries[0][1].getBudget());
	}

}
