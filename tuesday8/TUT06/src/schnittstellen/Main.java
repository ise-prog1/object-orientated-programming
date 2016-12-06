package schnittstellen;

public class Main {

	public static void main(String[] args) {
		
		Human human = new Human("Rudolf");
		Racecar racecar = new Racecar();
		
		testSound(human); // introduction + useful default sound
		testSound(racecar); // VROOM + no default sound
	}
	
	/**
	 * Makes a sound with any ISoundMaker compatible object
	 * @param source
	 */
	public static void testSound(ISoundMaker source) {
		// As every single ISourceMaker compatible object
		// must override this method, we can call it.
		source.makeSound();
		
		System.out.println("Default sound: " + source.getDefaultSound());
	}

}
