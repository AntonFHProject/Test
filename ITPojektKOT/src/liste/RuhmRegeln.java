package liste;

public class RuhmRegeln {

	
	static int counter1 = 0, counter2 = 0, counter3 = 0;

	static int RuhmPlus=0, RuhmPlus1=0, RuhmPlus2=0;

	static int FinalRuhmPlus=0;
	
	public static int RuhmMachen() {
		
		for (int i = 0; i<Würfel.zahlen.length; i++) {
			if (Würfel.zahlen[i] == 1) {
				counter1++;
			}
			if (Würfel.zahlen[i] == 2) {
				counter2++;
			}
			if (Würfel.zahlen[i] == 3) {
				counter3++;
			}
			
			
		}
		
		
		switch (counter1) {
		case 3:
			RuhmPlus = 1;
			break;

		case 4:
			RuhmPlus = 2;
			break;

		case 5:
			RuhmPlus = 3;
			break;

		case 6:
			RuhmPlus = 4;
			break;
		}

		switch (counter2) {
		case 3:
			RuhmPlus1 = 2;
			break;

		case 4:
			RuhmPlus1 = 3;
			break;

		case 5:
			RuhmPlus1 = 4;
			break;

		case 6:
			RuhmPlus1 = 5;
			break;
		}

		switch (counter3) {
		case 3:
			RuhmPlus2 = 3;
			break;

		case 4:
			RuhmPlus2 = 4;
			break;

		case 5:
			RuhmPlus2 = 5;
			break;

		case 6:
			RuhmPlus2 = 6;
			break;
		}
		
		FinalRuhmPlus = RuhmPlus + RuhmPlus1 + RuhmPlus2;
	
		System.out.println("RuhmPLus = "+FinalRuhmPlus);
		return FinalRuhmPlus;
	}
	
	
}
