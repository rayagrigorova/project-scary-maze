package main;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartFrame frame1 = new StartFrame();
		frame1.setResizable(false);
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame1.setLocation(dim.width/2-frame1.getSize().width/2, dim.height/2-frame1.getSize().height/2);
		
	}

}
