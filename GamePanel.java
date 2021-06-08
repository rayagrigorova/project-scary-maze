package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.InputStream;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import resources.ResourceLoader;

public class GamePanel extends JPanel {
	int levelNumber; 
	int[][] currentLevel; 
	boolean mousePressed;
	//side of square 
	int a;
	//The place where the user starts - [39][9]
	int iStart;
	int jStart;
	
	GamePanel(){
		this.setSize(new Dimension(400,400));
		levelNumber = 1; 
		//side of a square 
		a = this.getWidth() / 50; 
		System.out.println("a =" + a );
		System.out.println("width " + this.getWidth() );
		mousePressed = false;
		iStart = 39;
		jStart = 9;
		this.setVisible(true);
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			//If the mouse is pressed, we must follow the coordinates of the cursor. If they hit a red square, a scary image must appear 
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				//Clicked on the begin square 
				if(currentLevel[e.getY() / a][e.getX() / a] == 3) {
					mousePressed = true; 
					currentLevel[39][9] = 1; 
					
					while(true) {
						//Follow the mouse coordinates and repaint
						//Wall, show scary picture and make frame disappear 
						if(currentLevel[e.getY() / a][e.getX() / a] == 0 ) {
							getTopLevelAncestor().setVisible(false);
						}
					}
				}
			}
			


			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	public void initLevel() {
		if(levelNumber <= 5) {
			InputStream level = null;
			try{
			switch(levelNumber){
			case 1: level = ResourceLoader.loadFileAsInputStream("level1.txt"); break;
			case 2: level = ResourceLoader.loadFileAsInputStream("level2.txt"); break;
			case 3: level = ResourceLoader.loadFileAsInputStream("level3.txt"); break;
			case 4: level = ResourceLoader.loadFileAsInputStream("level4.txt"); break;
			case 5: level = ResourceLoader.loadFileAsInputStream("level5.txt"); break;
			}
			currentLevel = new int [50][50];
			int i = 0, j = 0;
			
			//Start, will be marked as 3 
			currentLevel[iStart][jStart] = 3;
			while(true){
				int val = level.read() - '0'; 
				if(val >= 0 ){
					currentLevel[i][j] = val;
					//When we reach the end of a row, i must be increased by 1 
					if(j == 49){
						i++;
					}
					//j is increased each time, % 50 so that when the end of a row is reached, j starts from 0 
					j = (j + 1) % 50; 
				}
				//Reached the end of the file, val is null 
				if(val == -49) break;
			}
			printArray(currentLevel);
			level.close();
			}
			
			catch(Exception e){
				e.printStackTrace();
				System.out.println("oopsie"); 
			}
		}
		
	}
	@Override 
	public void paintComponent(Graphics g) {
		initLevel(); 
		for(int i = 0; i < 50; i++) {
			for(int j = 0; j < 50; j++) {
				if(currentLevel[i][j] >= 0 ) {
					switch(currentLevel[i][j]) {
						//Wall, color in black
						case 0: g.setColor(Color.BLACK); g.fillRect(a * j , a * i, a, a); break;
						//Path, color in light blue
						case 1: g.setColor(Color.CYAN); g.fillRect(a * j , a * i, a, a); break;
						//Goal, color in red 
						case 2: g.setColor(Color.RED); g.fillRect(a * j , a * i, a, a); break;
						//Start position, color in darker blue 
						case 3: g.setColor(Color.BLUE); g.fillRect(a * j , a * i, a, a); break;
						}
				}
			}
		}
		printArray(currentLevel);	
	}
	
	public void printArray(int arr[][]){
		System.out.println();
		System.out.println();
		for(int i = 0; i < 50; i++){
			for(int j = 0; j < 50; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
