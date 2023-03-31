package modele;
import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class EcurieTest {
	
	// Creer les variables
	Ecurie e1, e2;
	Pilote p1;
	Pilote p2;
	String []sponsors;
	Voiture v;
	Experience exp;
	
	@Before public void setUp() {
		p1 = new Pilote("Dupont", "Gerard", "Suisse", 1, 40, "homme", 1.60, 94, new Experience());
		p2 = new Pilote("Rata", "Touille", "Italien", 2, 24, "rat", 0.15, 3, new Experience());
		sponsors = new String[]{"sp1", "sp2", "sp3", null};
		v = new Voiture("Ravioli", (float)759.4, 1, false);
			
		// Creer une Ecurie associée
		e1 = new Ecurie("MonEcurie", "Ecurie de test personnalisee", sponsors, 100, 5, p1, p2, v);
		
		// Creer une Ecurie basique
		e2 = Ecurie.CreerEcurieSimple();
	}
	
	@Test public void testerEcurie() {
		// Test attributs type de base
		assertEquals(e1.getBudget(), 100);
		assertEquals(e1.getClassement(), 5);
		assertTrue(e1.getNom().equals("MonEcurie"));
		assertTrue(e1.getDescription().equals("Ecurie de test personnalisee"));
		assertTrue(e1.getSponsors()[0].equals("sp1"));
		assertTrue(e1.getSponsors()[1].equals("sp2"));
		assertTrue(e1.getSponsors()[2].equals("sp3"));
		e1.getPilotes();
	
		// Test attributs classes
		
		assertTrue(e1.getPilotes()[0].toString().equals((new Pilote("Dupont", "Gerard", "Suisse", 1, 40, "homme", 1.60, 94, new Experience())).toString()));
		assertTrue(e1.getPilotes()[1].toString().equals((new Pilote("Rata", "Touille", "Italien", 2, 24, "rat", 0.15, 3, new Experience())).toString()));
		
		//assertTrue(e1.getPilotes()[0].equals(new Pilote("Dupont", "Gerard", "Suisse", 40, "homme", 1.60, 94, new Experience()))); EN ATTENTE de la classe de test Pilote
		//assertTrue(e1.getPilotes()[1].equals(new Pilote("Rata", "Touille", "Italien", 24, "rat", 0.15, 3, new Experience())));
		assertTrue(e1.getVoiture().equals(new Voiture("Ravioli", (float)759.4, 1, false)));		
	}
	
	@Test public void testerEcurieBasique() {
		// Test attributs type de base
		assertEquals(e2.getBudget(), 10000);
		assertEquals(e2.getClassement(), 1);
		assertTrue(e2.getNom().equals("Roger"));
		assertTrue(e2.getDescription().equals("Gerard"));
		assertTrue(e2.getSponsors()[0].equals("Nestle"));
		assertTrue(e2.getSponsors()[1].equals("Adidas"));
		assertTrue(e2.getSponsors()[2].equals("Ada"));

		// Test attributs classes
		
		assertTrue(e2.getPilotes()[0].toString().equals((new Pilote("Chen", "Bryan", "Chinois", 1, 20, "homme", 1.85, 71.5, new Experience())).toString()));
		assertTrue(e2.getPilotes()[1].toString().equals((new Pilote("Lee", "Yu-Chi", "Française", 2, 21, "femme", 1.60, 52.5, new Experience())).toString()));
		//assertTrue(e2.getPilotes()[0].equals(new Pilote("Chen", "Bryan", "Chinois", 20, "homme", 1.85, 71.5, new Experience()))); EN ATTENTE de la classe de test de Pilote
		//assertTrue(e2.getPilotes()[1].equals(new Pilote("Lee", "Yu-Chi", "Française", 21, "femme", 1.60, 52.5, new Experience())));
		assertTrue(e2.getVoiture().equals(new Voiture("Mercedes", (float)752, 70, false)));
	}
	
	
	
	@Test public void testerToString() {
		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}
}
