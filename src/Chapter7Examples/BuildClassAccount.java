package Chapter7Examples;

/*
 * Alanna Botscharow
 * 12/18
 */
public class BuildClassAccount {

	public static void main(String[] args) {
		ClassExample myacc = new ClassExample("Alanna Botscharow",5,"93 West Apple",0, "884-6999","123", null); 
		ClassExample youracc = new ClassExample(); 
		
		//myacc.setName("Alanna Botscharow");
	//	youracc.setName("Desmond Adams");
		myacc.setAddress("31 Rose lane");
		youracc.setAddress("Ponderosa forest");
		myacc.setBalance(5, "123"); 
		youracc.setBalance(2500000, "346");
		myacc.setPhone("834-3299");
		youracc.setPhone("756-2975");
		
		
		
		myacc.display();
		youracc.display();
		myacc.intcal(); 
		
		
		
	}

}
