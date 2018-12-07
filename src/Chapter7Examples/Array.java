package Chapter7Examples;
/*
 * Alanna Botscharow
 * 12/18
 */
public class Array {

	public static void main(String[] args) {
		String [] gamelist = {"Mario and Luigi: Bowser's Inside Story","Mario and Luigi: Dream Team", 
				"Mario and Luigi: Superstar Saga","Mario and Luigi: Paper Jam",
				"Mario and Luigi: Partners in Time","Super mario","Grand Theft Auto Five","Minecraft",
				"The Sims 4","Skyrim","Fallout","The Legend of Zelda: a Link to the Past",
				"Sonic","Creatures","True Crime","GUN","Zoo Tycoon","Undertale","League of Legends",
				"snake"};
		
		//top three
		System.out.println("Top three games: ");
		System.out.println("------------------------");
		for(int i = 0; i<2; i ++) {
			
		
		double [] nums;
		nums = new double [100];
		System.out.println(nums[1]);
		char[] charlist = new char [10];
		System.out.println(charlist[0]);
			
			
	
		System.out.println(gamelist[i]);
				
		}	
				
		System.out.println();
		System.out.println();
		System.out.println();
				
		//bottom three
		System.out.println("Bottom three games: ");
		System.out.println("------------------------");
		for(int i = 17; i < 20; i++) {
			
			
		System.out.println(gamelist[i]);	
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//middle 5
		//8 - 12
		
		System.out.println("Middle 5 games: ");
		System.out.println("------------------------");
		for(int i = 8; i < 13; i++) {
			
			
		System.out.println(gamelist[i]);	
		}
		
		
		
		
		
		
		
		

	}

}
