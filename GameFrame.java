package main;

import java.awt.Dimension;
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
	JLabel howToPlay; 
	int levelNumber; 
	
	GameFrame(){
		levelNumber = 1;
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridBagLayout());
		mainPanel.setPreferredSize(new Dimension(300, 300));
		c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(20, 10, 10, 10);
		
		loadLevel();
		
		this.setName("The Maze");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(mainPanel);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.pack();
	}
	
	public void loadLevel(){
		InputStream level = null;
		try{
		switch(levelNumber){
		case 1: level = ResourceLoader.loadFileAsInputStream("level1.txt"); break;
		case 2: level = ResourceLoader.loadFileAsInputStream("level2.txt"); break;
		case 3: level = ResourceLoader.loadFileAsInputStream("level3.txt"); break;
		case 4: level = ResourceLoader.loadFileAsInputStream("level4.txt"); break;
		case 5: level = ResourceLoader.loadFileAsInputStream("level5.txt"); break;
		}
		levelNumber++;
		int arr [][] = new int [50][50];
		int i = 0, j = 0;
		while(true){
			int val = level.read() - '0'; 
//			System.out.println(val);
			if(val >= 0 ){
				arr[i][j] = val;
				if(j == 49){
					i++;
				}
				j = (j + 1) % 50; 
			}
			if(val == -49) break;
		}
		
		printArray(arr);
		
		level.close();
		}
		catch(Exception e){
			System.out.println("oopsie"); 
		}
		
	}
	
	public void printArray(int arr[][]){
		for(int i = 0; i < 50; i++){
			for(int j = 0; j < 50; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
