package main;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameWonException extends Exception {
	public GameWonException () {
	    JFrame frame = new JFrame();  
	    JPanel panel = new JPanel();
	    
	    panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(20, 10, 10, 10);
		
		Font font = new Font("SansSerif", Font.BOLD, 20);
		
	    JLabel wonGame = new JLabel("Congratulations! You won the game!");
	    wonGame.setFont(font);
	    
	    JButton okButton = new JButton("OK");
	    okButton.setFont(font);
	    okButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f = new ScaryFrame();
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				f.setLocation(dim.width/2 - f.getSize().width/2, dim.height/2 - f.getSize().height/2);
				
			}
	    	
	    });
	    panel.add(wonGame, c);
	    c.gridy = 1;
	    panel.add(okButton, c);
	    panel.setPreferredSize(new Dimension(400, 200));
	    frame.setVisible(true);
	    frame.add(panel);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2 - frame.getSize().width/2, dim.height/2 - frame.getSize().height/2);
		frame.pack();
	}
}