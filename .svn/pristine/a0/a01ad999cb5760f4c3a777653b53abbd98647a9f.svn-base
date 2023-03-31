package utils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class JpanelImg extends JPanel {

	private BufferedImage image;
	
	public JpanelImg(String chemin) {
		try {
			image = ImageIO.read(new File(chemin));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("L'image n'a pas pu être chargée");
			System.exit(ERROR);
		}
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
		
        width = this.getWidth();
        height = this.getHeight();
		
		g.drawImage(image, x, y, width, height, this);
	}
	
}
	

