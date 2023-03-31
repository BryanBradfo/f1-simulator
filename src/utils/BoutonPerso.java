package utils;

import javax.swing.*;

public class BoutonPerso extends JButton {
	
	private ImageIcon img, img_t, img_p;
	
	public BoutonPerso(String desc) {
		super(desc);
		
		if (desc.length() <= 20) {
			img = new ImageIcon("img/bouton.png");
			img_t = new ImageIcon("img/bouton-touché.png");
			img_p = new ImageIcon("img/bouton-pressé.png");
		} else {
			img = new ImageIcon("img/bouton-long.png");
			img_t = new ImageIcon("img/bouton-touché-long.png");
			img_p = new ImageIcon("img/bouton-pressé-long.png");
		}
		
		init();
	}
	
	public BoutonPerso(String desc, String style) {
		this(desc);
		
		if (style.equals("grand")) {
			img = new ImageIcon("img/bouton-grand.png");
			img_t = new ImageIcon("img/bouton-touché-grand.png");
			img_p = new ImageIcon("img/bouton-pressé-grand.png");
			this.setFont(this.getFont().deriveFont(38f));
		}
		
		init();
	}
	
	

	
	private void init() {
		this.setOpaque(false);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
		this.setIcon(this.img);
		this.addMouseListener(new MouseListenerPerso(this, img, img_t, img_p));
		this.setHorizontalTextPosition(JButton.CENTER);
		this.setVerticalTextPosition(JButton.CENTER);
		
	}

}
