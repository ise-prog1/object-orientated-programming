package schnittstellen;

/**
 * This class represents a racecar as the source of the sound.
 */
public class Racecar implements ISoundMaker {

	public Racecar() {
		// no-op
	}

	/**
	 * A racecar makes VROOM
	 */
	@Override
	public void makeSound() {
		System.out.println("VROOM");
	}

}
