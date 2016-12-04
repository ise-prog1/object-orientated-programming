
/**
* This class represents a fraction.
*/
public class Bruchzahl {
	
	// 0 is the default value for all primitve number types
	int zaehler;
	int nenner;
	/**
	* This constructor does not set any values.
	* The bottom part can be 0 which would be no valid fraction.
	*/
	public Bruchzahl() {
	}

	/**
	* zaehler - the top part of a fraction
	* nenner - the bottom part of a fraction. Can be 0!
	*/
	public Bruchzahl(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	/**
	* Example of a getter
	*/
	public int getZaehler() {
		return this.zaehler;
	}
	
	/**
	* Shortens a given Bruchzahl by their greatest common divisor
	* @@return a new Bruchzahl object that is shorten
	*/
	public Bruchzahl kuerzen() {
		int ggt = ggt(this.zaehler, this.nenner);
		// make a copy of the values so that we do not modify the original
		int zaehler = this.zaehler;
		int nenner = this.nenner;

		// if they are both negative, remove the negativity. :)
		if (zaehler < 0 && nenner < 0) {
			zaehler *= -1;
			nenner *= -1;
		}
		return new Bruchzahl(zaehler / ggt, nenner/ ggt);
	}

	/**
	* Greatest common divisor helper method
	*/
	private static int ggt(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		int x = Math.abs(a);
		int y = (b > 0) ? b : -1 * b;

		while (x != y) {
			if (x > y) {
				x -= y;
			} else {
				y -= x;
			}
		}
		return x;
	}
}
