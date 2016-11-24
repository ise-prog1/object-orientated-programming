
/**
* This class represents a fraction.
*
* Diese Klasse stellt eine Bruchzahl dar.
*/
public class Bruchzahl {
	
	// 0 is the default value for all primitve number types
	// 0 ist der default Wert für den primitiven int Typen
	int zaehler;
	int nenner;
	

	/**
	* This constructor does not set any values.
	* The bottom part can be 0 which would be no valid fraction.
	*
	* Dieser Konstruktor setzt keine Werte!
	* Der Nenner kann also 0 sein! Das wäre dann kein valider Bruch
	*/
	public Bruchzahl() {
	}

	/**
	* zaehler - the top part of a fraction
	* nenner - the bottom part of a fraction. Can be 0!
	*
	* zaehler - der obere Teil des Bruches
	* nenner - der untere Teil des Bruches. Kann 0 sein!
	*/
	public Bruchzahl(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	/**
	* Example of a getter
	* 
	* Beispiel für einen Getter
	*/
	public int getZaehler() {
		return this.zaehler;
	}

}
