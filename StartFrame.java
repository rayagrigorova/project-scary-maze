package main;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class StartFrame extends JFrame {
	JLabel theMaze; 
	JLabel explanation;
	JButton playButton;
	JPanel mainPanel;
	
	GridBagConstraints c = new GridBagConstraints();
	
	StartFrame(){
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridBagLayout());
		mainPanel.setPreferredSize(new Dimension(300, 300));
		c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(20, 10, 10, 10);
		
		theMaze = new JLabel("The Maze");
		theMaze.setHorizontalAlignment(JLabel.CENTER);
		
		explanation = new JLabel("Try to reach the goal"
				+ " without touching the walls!");
		playButton = new JButton("Play");
		playButton.setBounds(0, 0, 10, 10);
		
		mainPanel.add(theMaze, c);
		c.gridy = 1;
		mainPanel.add(explanation, c);
		c.gridy = 2; 
		mainPanel.add(playButton, c);
		
		playButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
				GameFrame game = new GameFrame();
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				game.setLocation(dim.width/2-game.getSize().width/2, dim.height/2-game.getSize().height/2);
			}

			
		});
		
		this.setName("The Maze");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(mainPanel);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.pack();

	}
}