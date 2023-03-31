package modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FreinTest {
	Frein f;
	public static double EPSILON = 0.00001;

	@BeforeEach
	void setUp() throws Exception {
		f = new Frein();
	}

	@Test
	void testAdherence() {
		assertEquals(f.getEfficacite(), f.getEfficaciteMax(), EPSILON);
		assertEquals(f.getEfficacite(), 50, EPSILON);
		assertEquals(f.getEfficaciteMax(), 50, EPSILON);
		f.perteEfficacite(30);
		assertNotEquals(f.getEfficacite(), f.getEfficaciteMax(), EPSILON);
		assertEquals(f.getEfficacite(), 20, EPSILON);
		f.perteEfficacite(10);
		assertEquals(f.getEfficacite(), 10, EPSILON);
		f.perteEfficacite(-5);
		assertEquals(f.getEfficacite(), 10, EPSILON);
		f.perteEfficacite(23.6);
		assertEquals(f.getEfficacite(), 0.0, EPSILON);
		f.perteEfficacite(45.152);
		assertEquals(f.getEfficacite(), 0.0, EPSILON);		
	}

	@Test
	void testReparer() {
		f.perteEfficacite(30);
		f.perteDeVie();
		f.reparer();
		assertEquals(f.getEfficacite(), f.getEfficaciteMax(), EPSILON);
		assertEquals(f.getEfficacite(), 50, EPSILON);		
		assertEquals(f.getDureeDeVie(), 100, EPSILON);		
	}

	@Test
	void testAmeliorer() {
		f.perteEfficacite(30);
		f.perteDeVie();
		f.ameliorer();
		assertEquals(f.getEfficaciteMax(), 60, EPSILON);
		assertEquals(f.getEfficacite(), 30, EPSILON);		
		assertEquals(f.getDureeDeVie(), 76, EPSILON); // 100 - (30 - 3*ancienne_efficacite/10) = 100 + 6 - 30 = 76
	}

	@Test
	void testEquals() {
		Frein f1 = new Frein();
		assertTrue(f.equals(f1));
		assertFalse(f.equals(null));
		Roue r = new Roue("Labest");
		assertFalse(f.equals(r));
		f.perteEfficacite(30);
		assertFalse(f.equals(f1));
		f.reparer();
		f.perteDeVie();
		assertFalse(r.equals(f1));
		f.reparer();
		f.ameliorer();
		assertFalse(f.equals(f1));
	}
	
	@Test
	void testToString() {
		System.out.println("Départ : " + f.toString());
		f.perteEfficacite(30);
		System.out.println("Perte 30% d'efficacité : " + f.toString());
		f.perteEfficacite(10);
		f.perteDeVie();
		System.out.println("Perte 10% d'efficacité, perte de vie : " + f.toString());
		f.ameliorer();
		System.out.println("Amélioration : " + f.toString());
		f.reparer();
		System.out.println("Réparation" + f.toString());
	}

	
}
