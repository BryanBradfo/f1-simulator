package modele;
import org.junit.*;

public class ChassisTest {
	
	Chassis chassis;
	
	@Before public void setUp() {
		chassis = new Chassis();
	}
	
	@Test public void testerEfficacite() {
		assert(chassis.getEfficacite() == chassis.getEfficaciteMax());
		assert(chassis.getEfficacite() == 50);
		assert(chassis.getEfficaciteMax() == 50);
		chassis.perteEfficacite(40);
		assert(chassis.getEfficacite() != chassis.getEfficaciteMax());
		assert(chassis.getEfficacite() == 10);
		assert(chassis.getEfficaciteMax() == 50);
		chassis.perteEfficacite(40);
		assert(chassis.getEfficacite() != chassis.getEfficaciteMax());
		assert(chassis.getEfficacite() == 0);
		assert(chassis.getEfficaciteMax() == 50);
	}
	
	@Test public void testerAmeliorer() {
		chassis.perteDeVie();
		assert(chassis.dureeDeVie == 80);
		assert(chassis.getEfficaciteMax() == 50);
		chassis.ameliorer();
		chassis.perteDeVie();
		assert(chassis.getDureeDeVie() == 70);
		assert(chassis.getEfficaciteMax() == 60);
	}
	
	@Test public void testerReparer() {
		assert(chassis.getEfficacite() == 50);
		assert(chassis.getDureeDeVie() == 100);
		assert(chassis.getEfficaciteMax() == 50);
		chassis.perteDeVie();
		chassis.perteEfficacite(20);
		assert(chassis.getEfficacite() == 30);
		assert(chassis.getDureeDeVie() == 80);
		assert(chassis.getEfficaciteMax() == 50);
		chassis.reparer();
		assert(chassis.getEfficacite() == 50);
		assert(chassis.getDureeDeVie() == 100);
		assert(chassis.getEfficaciteMax() == 50);
	}
	
	@Test public void testerToString() {
		System.out.println("Chassis basique : " + chassis.toString());
		chassis.perteDeVie();
		chassis.perteEfficacite(20);
		System.out.println("pertes effectuées : " + chassis.toString());
		chassis.reparer();
		System.out.println("Chassis réparé : " + chassis.toString());
	}
}