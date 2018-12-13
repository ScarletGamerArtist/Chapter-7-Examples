package Chapter7Examples;
/*
 * Alanna Botscharow
 * 12/18
 * Multi-dimensional arrays
 */
public class TwoDimentions {

	public static void main(String[] args) {
		//int table [] [] = new int [10] [20]; 
		//add square brackets for more dimentions.
	/*	int t,i;
		int table[] [] = new int [10] [20];
		for (t = 0; t < 3; ++t) {
			for (i = 0; i < 4;  ++i) {
				table [t] [i] = (t*4) + i + 1;
				System.out.print(table [t][i] + " ");
			}
			System.out.println();
		}
		int list[] [] = new int [3] []; 
		list [0] = new int [42]; 
		list [1] = new int [10]; 
		list [2] = new int [49]; 
		list [0] [0] = 12; 
		
		
	*/	
		//String sequels [] [] = new String [5][18]; 
		
		String game [] [] = new String [3] [];
		game[0] = new String [5];
		game[1] = new String [8];
		game[2] = new String [5];
		
		//row 1
		game[0][0] = "Mario and Luigi Superstar Saga.";
		game[0][1] = "Mario and Luigi Partners in time.";
		game[0][2] = "Mario and Luigi Bowser's Inside Story.";
		game[0][3] = "Mario and Luigi Dream Team.";
		game[0][4] = "Mario and Luigi Paper Jam.";
		
		//row 2
		game[1][0] = "Fallout";
		game[1][1] = "Fallout II";
		game[1][2] = "Fallout III";
		game[1][3] = "Fallout IIII";
		game[1][4] = "Fallout New Vegas";
		game[1][5] = "Fallout Shelter";
		game[1][6] = "Fallout Pinball";
		game[1][7] = "Fallout 76";
		
		//row 3
		game[2][0] = "Elder Scrolls: Arena";
		game[2][1] = "Elder Scrolls: Dagger Fall";
		game[2][2] = "Elder Scrolls: Morrowind";
		game[2][3] = "Elder Scrolls: Oblivion";
		game[2][4] = "Elder Scrolls: Skyrim";
		
		//polymorphism: allows routines to use variables of different types of different times.
		// incapsulism: Something contained within something
		//inheritance: Containing all methods or procedures
		
	}
}
