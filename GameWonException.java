package main;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameWonException extends Exception {
	public GameWonException () {
	    JFrame f = new JFrame();  
	    JOptionPane.showMessageDialog(f,"You won the game!");  
	}
}