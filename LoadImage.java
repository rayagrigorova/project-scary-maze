package main;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import resources.ResourceLoader;

public class LoadImage extends JPanel {
	Image img = ResourceLoader.loadImage("possessed.jpg");
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		repaint();
	}

}