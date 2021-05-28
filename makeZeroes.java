package Project2;

public class makeZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 50 ; i++){
			System.out.println();
			for(int j = 0; j < 50; j++){
				if(wall(i,j))
				System.out.print("0");
				else 
					System.out.print("1");
			}
		}
	}
	//The start position for all levels will be 
	// i = 30, j = 15
	//Level 1 
//	public static boolean wall(int i, int j){
//		if (i >= 25 && i <= 35 && j >= 10 && j <= 40 ) return false;
//		else if(i >= 10 && i <= 25 && j >= 30 && j <= 40)return false;
//		return true;
//	}
	//Level 2
	//The labyrinth will be 6 pixels wide 
	public static boolean wall(int i, int j){
		if(i >= 28 && i <= 33 && j >= 10 && j <= 40) return false;
		else if(i >= 23 && i <= 28 && j >= 35 && j <= 40) return false;
		else if(i >= 18 && i <= 23 && j >= 10 && j <= 40) return false;
		else if (i >= 13 && i <= 18 && j >= 10 && j <= 20) return false;
		return true;
	} 

}
