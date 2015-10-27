package liste;

public class Testing {

	public static void main(String[] args) {

		int i=2;
		
		Monster gog = new Monster();
		gog.setName("sefa");
	
		
		Würfel w1 = new Würfel();
		
		w1.rollAll();
		
	
		
		
		gog.RuhmRechnen();
		
		gog.AngriffRechnen();
	
		gog.LebenRechnen();
		
		System.out.println(gog);
		
		
		
		
	}

}
