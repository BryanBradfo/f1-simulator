package modele;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PiloteTest {
	
	// précision
	 	public final static double EPSILON = 0.001;
	
	// Creer les variables
		Pilote Timothee, Bryan;
		
		@Before public void setUp() {
			
			// Creer les pilotes
			Timothee = new Pilote("Blanchy", "Timothee", "Français", 3, 36, "homme", 1.90, 74, new Experience());
			Bryan = Pilote.creerPilotebasique();
		}
		
		@Test public void testerPilote() {
			assert(Timothee.getNom() == "Blanchy");
			assert(Timothee.getPrenom() == "Timothee");
			assert(Timothee.getNationalite() == "Français");
			assert(Timothee.getNumero() == 3);
			assert(Timothee.getAge() == 36);
			assert(Timothee.getSexe() == "homme");
			assert(Timothee.getTaille() == 1.90);
			assert(Timothee.getPoids() == 74);
			assert(Timothee.getExp().getNiveau() == 1);
			assert(Timothee.getExp().getBoost() == 0.0);
			assert(Timothee.getExp().getProgression() == 0.0);
		}
		
		@Test public void testerPilotebasique() {
			assert(Bryan.getNom() == "Chen");
			assert(Bryan.getPrenom() == "Bryan");
			assert(Bryan.getNationalite() == "Chinois");
			assert(Bryan.getNumero() == 1);
			assert(Bryan.getAge() == 20);
			assert(Bryan.getSexe() == "homme");
			assert(Bryan.getTaille() == 1.85);
			assert(Bryan.getPoids() == 71.5);
			assert(Bryan.getExp().getNiveau() == 1);
			assert(Bryan.getExp().getBoost() == 0.0);
			assert(Bryan.getExp().getProgression() == 0.0);
		}

		@Test public void testergagnerExperience() {
			Timothee.getExp().setBoost(0.8);
			Timothee.gagnerExperience(20.0);
			assertEquals(Timothee.getExp().getProgression(), 16.0, EPSILON);
			Bryan.getExp().setBoost(0.8);
			Bryan.gagnerExperience(150);
			assertEquals(Bryan.getExp().getProgression(), 20.0, EPSILON);
		}
		
		@Test public void testervieillir() {
			Bryan.vieillir();
			Timothee.vieillir();
			assert(Bryan.getAge() == 21);
			assert(Timothee.getAge() == 37);
		}
		
		@Test public void testertoString() {
			System.out.println(Timothee.toString());
			System.out.println(Bryan.toString());
		}
		
		@Test public void testercopierPilote() {
			Pilote Timothee_copie = Timothee.copierPilote();
			
			/* Pouvoir faire progresser la copie sans impacter le pilote de base. */
			Timothee_copie.getExp().setBoost(0.6);
			Timothee_copie.gagnerExperience(20);
			assertEquals(Timothee_copie.getExp().getProgression(), 12.0, EPSILON);
			assertEquals(Timothee.getExp().getProgression(), 0.0, EPSILON);
			
			/* Pouvoir vieillir la copie sans toucher au pilote de base. */
			Timothee_copie.vieillir();
			assert(Timothee.getAge() == 36);
			assert(Timothee_copie.getAge() == 37);
		}
		
		@Test public void testerequals() {
			Pilote Bryan_sosie = new Pilote("Chen", "Bryan", "Chinois", 1, 20, "homme", 1.85, 71, new Experience());
			Bryan.equals(Bryan_sosie);
		}

}
