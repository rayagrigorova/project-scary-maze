package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import resources.ResourceLoader;

public class ScaryFrame extends JFrame{

	ScaryFrame(){
		this.add(new JLabel(new ImageIcon(ResourceLoader.loadImage("possessed.jpg"))));
	}
}
