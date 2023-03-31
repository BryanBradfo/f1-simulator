package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import MVC_interface_graphique.MdJ;
import modele.Ecurie;

/** Gére la sauvegarde des écuries du jeu.
 *
 * @version 1.1
 */
public class Sauvegarde {
	
	/** Sauvegarder les écuries du jeu
	 * @param ecuries
	 */
	public static void Sauvegarder(Ecurie[][] ecuries) {
		ObjectOutputStream oos = null;
	
		try {
			final FileOutputStream fichier = new FileOutputStream("save.ser");
			oos = new ObjectOutputStream(fichier);
			oos.writeObject(ecuries);
			oos.flush();
		} catch (final java.io.IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.flush();
					oos.close();
				}
			} catch (final IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	/** @return les écuries du jeu qui avaient été sauvegardées. */
	public static Ecurie [][] RecupSauvegarde() {
		ObjectInputStream ois = null;
		Ecurie[][] ecuries = new Ecurie[MdJ.NB_SAVE][Ecurie.NB_ECURIES];
		
		try {
			final FileInputStream fichier = new FileInputStream("save.ser");
			ois = new ObjectInputStream(fichier);
			ecuries = (Ecurie[][]) ois.readObject();
		} catch (final FileNotFoundException e) {
			return ecuries;
		} catch (final java.io.IOException e) {
			e.printStackTrace();
		} catch (final ClassNotFoundException e) {
		      e.printStackTrace();
	    } finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (final IOException ex) {
				ex.printStackTrace();
			}
		}
		return ecuries;
	}

}
