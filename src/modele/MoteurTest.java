package modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoteurTest {
	Moteur m;
	public static double EPSILON = 0.00001;

	@BeforeEach
	void setUp() throws Exception {
		m = new Moteur();
	}

	@Test
	void testAdherence() {
		assertEquals(m.getPuissance(), m.getPuissanceMax(), EPSILON);
		assertEquals(m.getPuissance(), 50, EPSILON);
		assertEquals(m.getPuissanceMax(), 50, EPSILON);
		m.pertePuissance(30);
		assertNotEquals(m.getPuissance(), m.getPuissanceMax(), EPSILON);
		assertEquals(m.getPuissance(), 20, EPSILON);
		m.pertePuissance(10);
		assertEquals(m.getPuissance(), 10, EPSILON);
		m.pertePuissance(-5);
		assertEquals(m.getPuissance(), 10, EPSILON);
		m.pertePuissance(26.5);
		assertEquals(m.getPuissance(), 0.0, EPSILON);
		m.pertePuissance(52.3);
		assertEquals(m.getPuissance(), 0.0, EPSILON);		
	}

	@Test
	void testReparer() {
		m.pertePuissance(30);
		m.perteDeVie();
		m.reparer();
		assertEquals(m.getPuissance(), m.getPuissanceMax(), EPSILON);
		assertEquals(m.getPuissance(), 50, EPSILON);		
		assertEquals(m.getDureeDeVie(), 100, EPSILON);		
	}

	@Test
	void testAmeliorer() {
		m.pertePuissance(30);
		m.perteDeVie();
		m.ameliorer();
		assertEquals(m.getPuissanceMax(), 60, EPSILON);
		assertEquals(m.getPuissance(), 30, EPSILON);		
		assertEquals(m.getDureeDeVie(), 76, EPSILON); // 100 - (30 - 3*ancienne_puissance/10) = 100 + 6 - 30 = 76
	}

	@Test
	void testEquals() {
		Moteur m1 = new Moteur();
		assertTrue(m.equals(m1));
		assertFalse(m.equals(null));
		Roue r = new Roue("Labest");
		assertFalse(m.equals(r));
		m.pertePuissance(30);
		assertFalse(m.equals(m1));
		m.reparer();
		m.perteDeVie();
		assertFalse(r.equals(m1));
		m.reparer();
		m.ameliorer();
		assertFalse(m.equals(m1));
	}
	
	@Test
	void testToString() {
		System.out.println("Départ : " + m.toString());
		m.pertePuissance(30);
		System.out.println("Perte 30% de puissance : " + m.toString());
		m.pertePuissance(10);
		m.perteDeVie();
		System.out.println("Perte 10% de puissance, perte de vie : " + m.toString());
		m.ameliorer();
		System.out.println("Amélioration : " + m.toString());
		m.reparer();
		System.out.println("Réparation" + m.toString());
	}

}
