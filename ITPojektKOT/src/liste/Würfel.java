package liste;

import java.util.Random;

public class Würfel {

	private int faceValue;
	static int[] zahlen = new int[6];

	public Würfel() {
		
	}

	Random rand = new Random();

	
	//würfeln
	public int roll() {
		faceValue = (int) rand.nextInt(6) + 1;

		return faceValue;
	}

	//6 Würfeln mit Array
	public void rollAll() {


		for (int i = 0; i < zahlen.length; i++) {

			zahlen[i] = roll();

			System.out.println(zahlen[i]);
		}
	}


}
