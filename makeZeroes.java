package main;

public class makeZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Starting position: i = 39, j = 9 Cell J40 
		//Last cell - AX50
		//We will keep the start cell value in a variable 
		
		// 0 - white, 1 - blue, 2 - red 
//		levelOne();
//		levelTwo();
//		levelThree();
//		levelFour();
		levelFive();
	}
	
	public static void levelOne() {
		int arr[][] = new int[50][50];
		for(int i = 35; i <= 42; i++) {
			for(int j = 5; j <= 38; j++) {
				arr[i][j] = 1;
			}
		}
		
		for(int i = 14; i <= 34; i++) {
			for(int j = 33; j <= 38; j++) {
				arr[i][j] = 1;
			}
		}
		
		for(int j = 33; j <= 38; j++) {
			arr[13][j] = 2;
		}
		print(arr);
		
	}
	public static void levelTwo() {
		int arr[][] = new int[50][50];
		for(int i = 35; i <= 42; i ++) {
			for(int j = 4; j <= 40; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 17; i <= 34; i ++) {
			for(int j = 35; j <= 40; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 17; i <= 22; i ++) {
			for(int j = 35; j <= 40; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 17; i <= 22; i ++) {
			for(int j = 15; j <= 40; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 8; i <= 16; i ++) {
			for(int j = 15; j <= 20; j++) {
				arr[i][j] = 1;
			}
		}
		for(int j = 15; j <= 20; j++)arr[7][j] = 2;
		print(arr);
	}
	public static void levelThree() {
		int arr[][] = new int[50][50];
		
		for(int i = 36; i <= 42; i ++) {
			for(int j = 4; j <= 43; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 27; i <= 35; i ++) {
			for(int j = 41; j <= 43; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 27; i <= 29; i ++) {
			for(int j = 6; j <= 43; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 19; i <= 26; i ++) {
			for(int j = 6; j <= 8; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 19; i <= 21; i ++) {
			for(int j = 6; j <= 43; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 11; i <= 18; i ++) {
			for(int j = 41; j <= 43; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 11; i <= 13; i ++) {
			for(int j = 11; j <= 43; j++) {
				arr[i][j] = 1;
			}
		}
		
		for (int i = 11; i <= 13; i ++) arr[i][10] = 2;
		
		print(arr);
	}
	public static void levelFour() {
		int arr[][] = new int[50][50];
		for(int i = 36; i <= 42; i ++) {
			for(int j = 4; j <= 44; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 14; i <= 35; i ++) {
			for(int j = 43; j <= 44; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 14; i <= 15; i ++) {
			for(int j = 38; j <= 44; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 14; i <= 29; i ++) {
			for(int j = 38; j <= 39; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 30; i <= 33; i ++) {
			for(int j = 4; j <= 39; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 12; i <= 29; i ++) {
			for(int j = 4; j <= 5; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 12; i <= 13; i ++) {
			for(int j = 4; j <= 32; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 14; i <= 22; i ++) {
			for(int j = 28; j <= 32; j++) {
				arr[i][j] = 1;
			}
		}
		for(int j = 28; j <= 32; j++) arr[23][j] = 2; 
		print(arr);
	}
	public static void levelFive() {
		int arr[][] = new int[50][50];
		for(int i = 36; i <= 42; i ++) {
			for(int j = 6; j <= 42; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 27; i <= 35; i ++) {
			for(int j = 36; j <= 42; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 27; i <= 32; i ++) {
			for(int j = 6; j <= 42; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 18; i <= 26; i ++) {
			for(int j = 6; j <= 12; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 18; i <= 21; i ++) {
			for(int j = 6; j <= 41; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 13; i <= 17; i ++) {
			for(int j = 40; j <= 41; j++) {
				arr[i][j] = 1;
			}
		}
		
		for(int i = 13; i <= 14; i ++) {
			for(int j = 34; j <= 41; j++) {
				arr[i][j] = 1;
			}
		}
		for(int i = 9; i <= 12; i ++) {
			for(int j = 34; j <= 35; j++) {
				arr[i][j] = 1;
			}
		}
		for(int j = 34; j <= 39; j++)arr[9][j] = 1; 
		for(int i = 6; i <= 8; i++) arr[i][39] = 1;
		for(int j = 36; j <= 39; j++)arr[6][j] = 1;
		for(int i = 4; i <= 6; i++) arr[i][36] = 1;
		arr[3][36] = 2;
		print(arr);
	}
	public static void print(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
