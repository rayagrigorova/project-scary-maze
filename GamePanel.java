package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import resources.ResourceLoader;

public class GamePanel extends JPanel {
	//Number of the current level
	int levelNumber; 
	//An array containing the maze of the current level 
	int[][] currentLevel; 
	//side of square 
	int a;
	//The place where the user starts - [39][9]
	int iStart;
	int jStart;
	//After the start square is clicked,
	//we need to save the last position and color it in dark blue  
	int lastI, lastJ;
	
	boolean mousePressed; 
	
	
	GamePanel(){
		this.setSize(new Dimension(400,400));
		levelNumber = 1; 
		//side of a square 
		a = this.getWidth() / 50; 
		iStart = 39;
		jStart = 9;
		lastI = 39;
		lastJ = 9; 
		mousePressed = false;
		this.setVisible(true);
		initLevel(); 
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			//If the mouse is pressed, we must follow the coordinates of the cursor. If they hit a red square, a scary image must appear 
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				mousePressed = true; 
				//Clicked on the begin square 
				if(currentLevel[e.getY() / a][e.getX() / a] == 3) {
					addMouseMotionListener(new MouseMotionListener(){

						@Override
						public void mouseDragged(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void mouseMoved(MouseEvent arg0) {
							if(!mousePressed) return; 
							//Delete last position 
							currentLevel[lastI][lastJ] = 1; 
							//Coordinates in the array of square to which mouse is moved 
							int iMoved = arg0.getY() / a;
							int jMoved = arg0.getX() / a;
							//Change coordinates of last square so that it can be turned cyan 
							//when the user moves elsewhere 
							lastI = iMoved;
							lastJ = jMoved;
							//Wall, make scary image appear 
							if(currentLevel[iMoved][jMoved] == 0){
								JFrame scaryFrame = new ScaryFrame();
								Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
								scaryFrame.setLocation(dim.width/2-scaryFrame.getSize().width/2, dim.height/2-scaryFrame.getSize().height/2);
								return;
							}
							//Goal, proceed to next level 
							else if (currentLevel[iMoved][jMoved] == 2){
								if(levelNumber <= 5){ 
									levelNumber++;
									iStart = 39;
									jStart = 9;
									lastI = 39;
									lastJ = 9; 
									initLevel();
									repaint();
									mousePressed = false; 
									return; 
								}
							}						
							currentLevel[iMoved][jMoved] = 3;
							repaint();
							
						}
						
					});
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
			//Start, will be marked as 3 
			currentLevel[iStart][jStart] = 3;
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
