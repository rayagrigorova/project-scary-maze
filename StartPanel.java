package main;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class StartPanel extends JPanel {
	JLabel theMaze; 
	JLabel explanation;
	JButton playButton;
	
	GridBagConstraints c = new GridBagConstraints();
	
	StartPanel(){
		this.setLayout(new GridBagLayout());
		this.setPreferredSize(new Dimension(300, 300));
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
		
		this.add(theMaze, c);
		c.gridy = 1;
		this.add(explanation, c);
		c.gridy = 2; 
		this.add(playButton, c);
		
		playButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("The current panel is " + ((JButton)e.getSource()).getParent());
				
			}

			
		});

	}
}
