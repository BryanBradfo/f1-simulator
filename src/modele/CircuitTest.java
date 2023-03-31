package modele;
import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CircuitTest {
	
	// Creer les variables
    Circuit c1;
	Pilote p;
	double tempsTheorique;
	
	@Before public void setUp() {
		c1 = Circuit.creerCircuitBahrein();
		p = Pilote.creerPilotebasique();
		p.setVoiture(Voiture.creerVoitureBasique());
		tempsTheorique = c1.calculerTempsMinimal();
	}
	
	@Test public void testerCircuitBasique() {
		// Test attributs type de bas
		assertTrue(c1.getNom().equals("International de Sahkir"));
		assertTrue(c1.getPays().equals("Bahreïn"));
		assertEquals(c1.getNbTours(), 57);
		assertEquals(c1.getLongueur(), 5.412);
		assertEquals(c1.getNbVirages(), 15);
		assertTrue(c1.getRecordTour().equals("1:27:264"));
	
		// Test attributs classes
		assertTrue(c1.getStand().toString().equals(new Stands(20, 600, 80, 30).toString()));
		assertTrue(c1.getMeilleurPilote().toString().equals(new Pilote("Hamilton", "Lewis", "Anglais", 44, 37, "M", 50.0, 50.0, new Experience(50, 33, 100)).toString()));
		
	}
	
	@Test public void testerTourVoitureBasique() {
		// Vérifier que les temps au tour d'une voiture basique sont toujours supérieurs ou égal à celui théorique
		for(int i = 0; i < 10000; i++) {
			assertTrue(tempsTheorique <= c1.lancerTourCircuit(p));
			assertTrue(c1.lancerTourCircuit(p) != c1.lancerTourCircuit(p));
		}
	}
	
	// Vérifier que les temps au tour d'une voiture basique sont toujours supérieurs à celui théorique et jamais identiques
	@Test public void testerTourVoitureParfaite() {
		p.setVoiture(new Voiture("Fusee", 753, 100, false));
		for(int i = 0; i < 10000; i++) {
			assertTrue(tempsTheorique <= c1.lancerTourCircuit(p));
		}
	}
}
