package main;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameWonException extends Exception {
	public GameWonException () {
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(1024, 768));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.pack();
		JOptionPane.showMessageDialog(frame, "You won the game!");
	}
}
