import Prog1Tools.IOTools;

public class Rechnen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int number1 = IOTools.readInt("Bitte Zahl 1 eingeben: ");
		//int number2 = IOTools.readInt("Bitte Zahl 2 eingeben: ");
		//int ggt = ggt(number1, number2);
		//System.out.println(ggt);
		Bruchzahl b = new Bruchzahl();
		einlesen(b);
		kuerzen(b);
		ausgeben(b);
		System.out.println("Reeller Näherungswert: " + wert(b));
		
		Bruchzahl neu = einlesenKonstruktor();
		kuerzen(neu);
		ausgeben(neu);
		System.out.println("Reeller Näherungswert: " + wert(neu));
	}

	/**
	* Aufgabe 1 - Berechnet den größten gemeinsamen Teiler zweier Zahlen a und b
	*/
	public static int ggt(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		// Zwei Wege die absolute Zahl zu bekommen
		// Math.abs
		int x = Math.abs(a);
		// Ternary-Operator. Equivalent zu der folgenden If-Else Abfrage 
		/*
		int y;
		if (b > 0) {
			y = b;
		} else {
			y = -1 * b;
		}
		*/
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

	/**
	* Reads two numbers a and b from the keyboard and fills the given Bruchzahl object with the given values.
	* b cannot be 0.
	*
	* Liest die Werte für den Zähler und Nenner des übergebenen Bruch ein.
	*/
	public static void einlesen(Bruchzahl bruchzahl) {
		int zaehler = IOTools.readInt("Zähler:");
		int nenner = 0;
		while(nenner == 0) {
			nenner = IOTools.readInt("Nenner (nicht 0!):");
		}

		bruchzahl.zaehler = zaehler;
		bruchzahl.nenner = nenner;
	}

	/**
	* Reads two numbers a and b from the keyboard and constructs a Bruchzahl from the given values.
	* b cannot be 0.
	* @returns the new Bruchzahl object
	*
	* Liest Zähler und Nenner von der Tastatur ein und erstellt davon ein Bruchzahl-Objekt
	* Nenner darf nicht 0 sein.
	*/
	public static Bruchzahl einlesenKonstruktor() {
		int zaehler = IOTools.readInt("Zähler:");
		int nenner = 0;
		while(nenner == 0) {
			nenner = IOTools.readInt("Nenner (nicht 0!):");
		}
		Bruchzahl ergebnis = new Bruchzahl(zaehler, nenner);
		return ergebnis;
	}

	/**
	* Prints a given Bruchzahl to console by printing the saved values seperated by a slash.
	* 
	* Gibt einen gegebenes Gruchzahl-Objekt auf der Konsole auf 
	* indem die gespeicherten Werte von einen Schrägstrich getrennt werden.
	*/
	public static void ausgeben(Bruchzahl bruchzahl) {
		System.out.print(bruchzahl.zaehler);
		System.out.print("/");
		System.out.println(bruchzahl.nenner);
	}
	
	/**
	* Calculates a real approximation of the given Bruchzahl object
	* 
	* Berechnet einen reellen Näherungswert für die gegebene Bruchzahl
	*/
	public static double wert(Bruchzahl bruchzahl) {
		return ((double)bruchzahl.zaehler / bruchzahl.nenner);
	}
	
	/**
	* Returns a new Bruchzahl that represents the inverse of the given Bruchzahl
	* @param bz - the original Bruchzahl
	* @returns a new Bruchzahl object that is the inverse of bz 
	*
	* Gibt eine neue Bruchzahl zurück, die den Kehrwert des Originals darstellt.
	*/
	public static Bruchzahl kehrwert(Bruchzahl bz) {
		return new Bruchzahl(bz.nenner, bz.zaehler);
	}
	
	/**
	* Returns a negated version of the original Bruchzahl object

	* Gibt eine neue negierte Version des übergebenen Bruchzahl Objektes zurück
	*/
	public static Bruchzahl neg(Bruchzahl bz) {
		return new Bruchzahl(bz.zaehler * -1, bz.nenner);
	}
	
	/**
	* Shortens a given Bruchzahl by their greatest common divisor
	*/
	public static void kuerzen(Bruchzahl bz) {
		int ggt = ggt(bz.zaehler, bz.nenner);
		// If both are negative remove the minus from both
		if (bz.zaehler < 0 && bz.nenner < 0) {
			bz.zaehler *= -1;
			bz.nenner *= -1;
		}
		bz.zaehler /= ggt;
		bz.nenner /= ggt;
	}
	
	/**
	* Returns a new Bruchzahl object that is the product of the two given Bruchzahl objects
	*/
	public static Bruchzahl mul(Bruchzahl a, Bruchzahl b) {
		return new Bruchzahl(a.zaehler * b.zaehler, a.nenner * b.nenner);
	}
	
	/*
	* Returns a new Bruchzahl object that is the result of a division between Bruchzahl objects a and b.
	*/
	public static Bruchzahl div(Bruchzahl a, Bruchzahl b) {
		Bruchzahl bNeg = kehrwert(b);
		return mul(a, bNeg);
	}
}
