package modele;
import org.junit.*;

public class VoitureTest {
	
	// Creer les variables
	Voiture v1, v2;
	Experience exp;
	
	@Before public void setUp() {
		// Creer une voiture associée
		v1 = new Voiture("Audible", 752, 1, false);
		
		// Creer une voiture basique
		v2 = Voiture.creerVoitureBasique();
	}
	
	@Test public void testerVoiture() {
		assert(v1.getMarque().equals("Audible"));
		assert(v1.getPoids() == 752);
		assert(v1.getIndicesPerformances() == 1);
		assert(v1.isEstEnCourse() == false);
	}
	
	@Test public void testerVoitureBasique() {
		assert(v2.getMarque().equals("Mercedes"));
		assert(v2.getPoids() == 752);
		assert(v2.getIndicesPerformances() == 70);
		assert(v2.isEstEnCourse() == false);
	}
	
	@Test public void testerToString() {
		System.out.println(v1.toString());
		System.out.println(v2.toString());
	}
}