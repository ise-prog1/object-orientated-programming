package schnittstellen;

/**
 * This class represents a human sound machine.
 */
public class Human implements ISoundMaker {

	private String name;
	
	public Human(String name) {
		this.name = name;
	}

	/**
	 * The sound of a human is its introduction
	 */
	@Override
	public void makeSound() {
		System.out.println("Hallo, ich bin " + name + "!");
	}
	
	/**
	 * Override a default method
	 * 
	 * You do not have to override this method
	 */
	@Override
	public String getDefaultSound() {
		return name;
	}
}
