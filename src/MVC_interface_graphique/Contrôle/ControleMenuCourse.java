package MVC_interface_graphique.Contrôle;

import javax.swing.JButton;
import javax.swing.JPanel;

import MVC_interface_graphique.Modèle.ModeleMenuCourse;
import MVC_interface_graphique.Vue.VueMenuCourse;

public class ControleMenuCourse extends JPanel {

	private static final long serialVersionUID = 3677524542962174316L;		// Numéro de Série (utile si besoin de serialiser la classe)
	
	public ControleMenuCourse(ModeleMenuCourse modele, VueMenuCourse vue) {
		
		JButton bvalider = new JButton("Valider");
		this.add(bvalider);
		bvalider.addActionListener(ev -> {
			modele.goResultatsCourse();
		});
	}

}
