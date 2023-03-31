package modele;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClassementTest {
		
	private MoteurDeCourse m;
	private Classement c;
	
		@BeforeEach
		void setUp(){
			Ecurie [] e = new Ecurie[5];
			Pilote [] p = new Pilote[22];
			String [] s1 = new String[1];
			s1[0] = "Petronas";
			String [] s2 = new String[1];
			s2[0] = "Vodafone";
			String [] s3 = new String[1];
			s3[0] = "E-Tech";
			/* PILOTES BASIQUES */
			p[0] = Pilote.creerPilotebasique();
			p[1] = Pilote.creerPilotebasique2();
			/* PILOTES FERRARI */
			p[2] = new Pilote("Leclerc", "Charles", "Monégasque", 16, 25, "M", 1.80, 70, new Experience());
			p[3] = new Pilote("Sainz Jr", "Carlos", "Espagnol", 55, 27, "M", 1.78, 66, new Experience());
			/* PILOTES ALPINE */
			p[4] = new Pilote("Alonso", "Fernando", "Espagnol", 14, 40, "M", 1.71, 69, new Experience());
			p[5] = new Pilote("Ocon", "Esteban", "Français", 31, 25, "M", 1.86, 66, new Experience());
			/* PILOTES MERCEDES */
			p[6] = new Pilote("Hamilton", "Lewis", "Anglais", 44, 37, "M", 1.75, 73, new Experience());
			p[7] = new Pilote("Russell", "George", "Anglais", 63, 24, "M", 1.85, 70, new Experience());
			/* PILOTES MCLAREN */
			p[8] = new Pilote("Norris", "Lando", "Anglais", 4, 22, "M", 1.70, 68, new Experience());
			p[9] = new Pilote("Ricciardo", "Daniel", "Australien", 3, 32, "M", 1.75, 64, new Experience());
			/* PILOTES REDBULL */
			p[10] = new Pilote("Verstappen", "Max", "Néerlandais", 1, 24, "M", 1.80, 67, new Experience());
			p[11] = new Pilote("Perez", "Sergio", "Mexicain", 11, 32, "M", 1.73, 63, new Experience());
			/* PILOTES ALPHA ROMEO */
			p[12] = new Pilote("Bottas", "Valtteri", "Finlandais", 77, 32, "M", 1.73, 69, new Experience());
			p[13] = new Pilote("Zhou", "Guanyu", "Chinois", 24, 22, "M", 1.80, 65, new Experience());
			/* PILOTES ALPHA TAURI */
			p[14] = new Pilote("Gasly", "Pierre", "Français", 10, 40, "M", 1.77, 70, new Experience());
			p[15] = new Pilote("Tsunoda", "Yuki", "Japonais", 21, 22, "M", 1.59, 54, new Experience());
			/* PILOTES ASTON MARTIN */
			p[16] = new Pilote("Vettel", "Sebastian", "Allemand", 5, 34, "M", 1.75, 62, new Experience());
			p[17] = new Pilote("Stroll", "Lance", "Canadien", 18, 23, "M", 1.80, 70, new Experience());
			/* PILOTES WILLIAMS */
			p[18] = new Pilote("Albon", "Alexander", "Thaïlandais", 23, 26, "M", 1.85, 78, new Experience());
			p[19] = new Pilote("Latifi", "Nicolas", "Canadien", 31, 27, "M", 1.85, 65, new Experience());
			/* PILOTES HAAS */
			p[20] = new Pilote("Magnussen", "Kévin", "Danois", 20, 29, "M", 1.74, 68, new Experience());
			p[21] = new Pilote("Schumacher", "Mick", "Allemand", 47, 25, "M", 1.75, 74, new Experience());
			/* ECURIES */
			e[0] = new Ecurie("Mercedes", "CHAMPION", s1, 20000, 1, p[0], p[1], new Voiture("Mercedes", 750, 100, false));
			e[1] = new Ecurie("Ferrari", "Rouge", s1, 10000, 2, p[2], p[3], new Voiture("Ferrari", 750, 50, false));
			e[2] = new Ecurie("Alpine", "NUL", s1, 5000, 1, p[4], p[5], new Voiture("Alpine", 750, 10, false));
			e[3] = new Ecurie("ENSEEIHT", "FORT", s1, 5000, 1, p[6], p[7], new Voiture("ENSEEIHT", 750, 100, false));
			e[4] = new Ecurie("ENSIACET", "PAS OUF", s1, 5000, 1, p[8], p[9], new Voiture("ENSIACET", 750, 20, false));
			m = new MoteurDeCourse(Circuit.creerCircuitBahrein(), e);
			c = new Classement(m);
		}

		@Test
		void testTrie() {
			System.out.println("TESTER TRIE");
			m.lancerCourse();
			System.out.println("Temps de base (voir ci-dessous)");
			System.out.println("------------------------------");
			System.out.println(m.afficher());
			System.out.println("Temps triés");
			System.out.println("------------------------------");
			c.sort();
		}
		
		@Test
		void testTrieString() {
			System.out.println("TESTER TRIESTRING");
			m.lancerCourse();
			System.out.println("Temps de base (voir ci-dessous)");
			System.out.println("------------------------------");
			System.out.println(m.afficher());
			System.out.println("Temps triés");
			System.out.println("------------------------------");
			String classement = c.sortString();
			System.out.println(classement);
		}
		
		@Test
		void testPremierString() {
			System.out.println("TESTER PREMIERSTRING");
			m.lancerCourse();
			System.out.println("Temps de base (voir ci-dessous)");
			System.out.println("------------------------------");
			System.out.println(m.afficher());
			System.out.print("Le premier de la course est : ");
			String premier = c.getPremierString();
			System.out.println(premier);
		}
		
		@Test
		void testPremier() {
			System.out.println("TESTER PREMIER");
			m.lancerCourse();
			System.out.println("Temps de base (voir ci-dessous)");
			System.out.println("------------------------------");
			System.out.println(m.afficher());
			System.out.print("Le nom du premier est : ");
			String[] premier = c.getPremier();
			System.out.print(premier[0]);
			System.out.print(" avec un temps de : ");
			System.out.println(premier[1]);
		}
		
		@Test
		void testTout() {
			System.out.println("TESTER TOUT");
			m.lancerCourse();
			System.out.println("Temps de base (voir ci-dessous)");
			System.out.println("------------------------------");
			System.out.println(m.afficher());
			System.out.print("Le nom du premier est : ");
			String[] premier = c.getPremier();
			System.out.print(premier[0]);
			System.out.print(" avec un temps de : ");
			System.out.println(premier[1]);
			
			System.out.println();
			System.out.print("Le nom du second est : ");
			String[] second = c.getSecond();
			System.out.print(second[0]);
			System.out.print(" avec un temps de : ");
			System.out.println(second[1]);
			
			System.out.println();
			System.out.print("Le nom du troisième est : ");
			String[] third = c.getThird();
			System.out.print(third[0]);
			System.out.print(" avec un temps de : ");
			System.out.println(third[1]);
			
			System.out.println();
			c.afficherRest();
			
			System.out.println("Vérifions que c'est cohérent avec le tri suivant");
			System.out.println("");
			c.sort();
		}
}
