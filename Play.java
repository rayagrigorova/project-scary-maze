package main;

import javax.swing.JFrame;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("The Maze");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StartPanel start = new StartPanel();
		start.setVisible(true);
		frame.add(start);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.pack();
	}

}
