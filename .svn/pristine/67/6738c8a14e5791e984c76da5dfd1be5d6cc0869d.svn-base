package modele;
import org.junit.*;

public class AerodynamiqueTest {
	Aerodynamique aero;
	
	@Before public void setUp() {
		aero = new Aerodynamique();
	}
	
	@Test public void testerAerodynamique() {
		assert(aero.getAerodynamisme() == aero.getAerodynamismeMax());
		assert(aero.getAerodynamisme() == 50);
		assert(aero.getAerodynamismeMax() == 50);
		aero.perteAerodynamisme(10);
		assert(aero.getAerodynamisme() != aero.getAerodynamismeMax());
		assert(aero.getAerodynamisme() == 40);
		assert(aero.getAerodynamismeMax() == 50);
		aero.perteAerodynamisme(50);
		assert(aero.getAerodynamisme() != aero.getAerodynamismeMax());
		assert(aero.getAerodynamisme() == 0);
		assert(aero.getAerodynamismeMax() == 50);
	}
	
	@Test public void testerAmeliorer() {
		aero.perteDeVie();
		assert(aero.dureeDeVie == 95);
		assert(aero.getAerodynamismeMax() == 50);
		aero.ameliorer();
		aero.perteDeVie();
		assert(aero.getDureeDeVie() == 90);
		assert(aero.getAerodynamismeMax() == 60);
	}
	
	@Test public void testerReparer() {
		assert(aero.getAerodynamisme() == 50);
		assert(aero.getDureeDeVie() == 100);
		assert(aero.getAerodynamismeMax() == 50);
		aero.perteDeVie();
		aero.perteAerodynamisme(20);
		assert(aero.getAerodynamisme() == 30);
		assert(aero.getDureeDeVie() == 95);
		assert(aero.getAerodynamismeMax() == 50);
		aero.reparer();
		assert(aero.getAerodynamisme() == 50);
		assert(aero.getDureeDeVie() == 100);
		assert(aero.getAerodynamismeMax() == 50);
	}
	
	@Test public void testerToString() {
		System.out.println("Aerodynamique basique : " + aero.toString());
		aero.perteDeVie();
		aero.perteAerodynamisme(20);
		System.out.println("Pertes effectuées : " + aero.toString());
		aero.reparer();
		System.out.println("Aerodynamique réparé : " + aero.toString());
	}
}
