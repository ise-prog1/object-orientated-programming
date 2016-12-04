
public class Sound {
	private String raum;
	private int laut;
	private int bass;
	private int hoch;
	
	/**
	* Creates a new Sound object based on the given Values
	* @param raum - the room label
	* @param laut - the volume level
	* @param bass - the bass level
	* @param hoch - the high level
	*/
	public Sound(String raum, int laut, int bass, int hoch) {
		this.raum = raum;
		this.laut = laut;
		this.bass = bass;
		this.hoch = hoch;
	}
	
	/**
	* Getter for volume
	*/
	public int getLautstaerke() {
		return laut;
	}
	
	/**
	* Increases the value of the given setting
	* @param regler - the setting to be increased
	* @param wert - the additional value that is to be added. 
	*/
	public void verstaerke(String regler, int wert) {
		switch (regler) {
		case "baesse":
			this.bass += wert;
			break;
		case "hoehen":
			this.hoch += wert;
			break;
		case "lautstaerke": // fällt durch; l und lautstaerke ändern this.laut
		case "l":
			this.laut += wert;
			break;
		default:
			break;
		}
	}

	/**
	* Generated toString method.
	*/
	@Override
	public String toString() {
		return "Sound [raum=" + raum + ", laut=" + laut + ", bass=" + bass + ", hoch=" + hoch + "]";
	}
	
	
}
