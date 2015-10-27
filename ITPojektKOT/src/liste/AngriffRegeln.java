package liste;

public class AngriffRegeln {


	static int angriffCounter=0;
	
	public static int angriffMachen() {
	
	for (int i = 0; i<Würfel.zahlen.length; i++) {
		if (Würfel.zahlen[i] == 4) {
			angriffCounter++;
		}
	}
		
		return angriffCounter;
	}
	

	
}
