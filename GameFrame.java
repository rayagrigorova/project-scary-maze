package main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import resources.ResourceLoader;

public class GameFrame extends JFrame {
	JPanel mainPanel;
	GridBagConstraints c = new GridBagConstraints();
	
	GameFrame() throws GameWonException{
		mainPanel = new GamePanel();
		mainPanel.setLayout(new GridBagLayout());
		mainPanel.setPreferredSize(new Dimension(400, 400));
		c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(20, 10, 10, 10);
		
		this.setName("Game frame");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.add(mainPanel);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.pack();
	}
}