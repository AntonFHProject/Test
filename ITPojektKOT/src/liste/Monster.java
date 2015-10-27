package liste;

public class Monster {

	// instanzvariabel
	private int ruhm = 0, leben = 10, energie = 0;
	boolean tokyo = false;
	String name;

	// konstruktor
	public Monster() {
	}

	// getter und setter für instanzvariabel
	public int getRuhm() {
		return ruhm;
	}

	public void setRuhm(int ruhm) {
		this.ruhm = ruhm;
	}

	public int getLeben() {
		return leben;
	}

	public void setLeben(int leben) {
		this.leben = leben;
	}

	public boolean isTokyo() {
		return tokyo;
	}

	public void setTokyo(boolean tokyo) {
		this.tokyo = tokyo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void RuhmRechnen() {
		this.ruhm += RuhmRegeln.RuhmMachen();
	}

	public void LebenRechnen() {
		if (this.leben > 9) {

		} else {
			this.leben += HeilenRegeln.lebenMachen();
		}
	}
	
	public void AngriffRechnen() {
		this.leben -= AngriffRegeln.angriffCounter;
	}

	// tostring methode
	public String toString() {
		return "Name: " + name + "\nRuhm: " + ruhm + "\nLeben: " + leben
				+ "\nEnergie: " + energie;
	}

}
