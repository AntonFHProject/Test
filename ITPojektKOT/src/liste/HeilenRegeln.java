package liste;

public class HeilenRegeln {


	static int heilerCounter=0;
	
	public static int lebenMachen() {
	
	for (int i = 0; i<Würfel.zahlen.length; i++) {
		if (Würfel.zahlen[i] == 5) {
			heilerCounter++;
		}
	}
		
		return heilerCounter;
	}
	
}
