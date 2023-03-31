package modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoueTest {
	Roue r;
	public static double EPSILON = 0.00001;

	@BeforeEach
	void setUp() throws Exception {
		r = new Roue("Labest");
	}

	@Test
	void testAdherence() {
		assertEquals(r.getAdherence(), r.getAdherenceMax(), EPSILON);
		assertEquals(r.getAdherence(), 50, EPSILON);
		assertEquals(r.getAdherenceMax(), 50, EPSILON);
		r.perteAdherence(30);
		assertNotEquals(r.getAdherence(), r.getAdherenceMax(), EPSILON);
		assertEquals(r.getAdherence(), 20, EPSILON);
		r.perteAdherence(12.3);
		assertEquals(r.getAdherence(), 7.7, EPSILON);
		r.perteAdherence(-5);
		assertEquals(r.getAdherence(), 7.7, EPSILON);
		r.perteAdherence(7.7);
		assertEquals(r.getAdherence(), 0.0, EPSILON);
		r.perteAdherence(35);
		assertEquals(r.getAdherence(), 0.0, EPSILON);		
	}

	@Test
	void testReparer() {
		r.perteAdherence(30);
		r.perteDeVie();
		r.reparer();
		assertEquals(r.getAdherence(), r.getAdherenceMax(), EPSILON);
		assertEquals(r.getAdherence(), 50, EPSILON);		
		assertEquals(r.getDureeDeVie(), 100, EPSILON);		
	}

	@Test
	void testAmeliorer() {
		r.perteAdherence(30);
		r.perteDeVie();
		r.ameliorer();
		assertEquals(r.getAdherenceMax(), 60, EPSILON); 
		assertEquals(r.getAdherence(), 30, EPSILON);	// 20% restant + 10% de l'amélioration	
		assertEquals(r.getDureeDeVie(), 76, EPSILON); // 100 - (30 - 3*ancienne_adherence/10) = 100 + 6 - 30 = 76
	}

	@Test
	void testEquals() {
		Roue r1 = new Roue("Labest");
		Roue r2 = new Roue("Laworst");
		assertTrue(r.equals(r1));
		assertFalse(r.equals(r2));
		assertFalse(r.equals(null));
		Frein f = new Frein();
		assertFalse(r.equals(f));
		r.perteAdherence(0.3);
		assertFalse(r.equals(r1));
		r.reparer();
		r.perteDeVie();
		assertFalse(r.equals(r1));
		r.reparer();
		r.ameliorer();
		assertFalse(r.equals(r1));
	}
	
	@Test
	void testToString() {
		System.out.println("Départ : " + r.toString());
		r.perteAdherence(30);
		System.out.println("Perte 30% d'adhérence : " + r.toString());
		r.perteAdherence(10);
		r.perteDeVie();
		System.out.println("Perte 10% adhérence, perte de vie : " + r.toString());
		r.ameliorer();
		System.out.println("Amélioration : " + r.toString());
		r.reparer();
		System.out.println("Réparation" + r.toString());
	}
	
	
}
