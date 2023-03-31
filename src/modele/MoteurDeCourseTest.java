package modele;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoteurDeCourseTest {
	
	
	private MoteurDeCourse m;

	@BeforeEach
	void setUp(){
		Ecurie [] e = Ecurie.creerEcuries();
		e = Ecurie.selectionerOpposants(e[0], e);
		
		/*for (int i = 0; i < 9; i++) {
			System.out.println(e[i].getNom());
		}*/
		
		m = new MoteurDeCourse(Circuit.creerCircuitBahrein(), e);  
	}

	@Test
	void testLancerCourse() {
		m.lancerCourse();
		System.out.println(m.afficher());
	}

}
