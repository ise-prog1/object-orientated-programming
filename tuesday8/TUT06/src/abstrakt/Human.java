package abstrakt;

/**
 * This class represents a human.
 * In this model a human is also an animal.
 */
public class Human extends Animal {

	/**
	 * Constructor for Human
	 * @param name - The name for the human.
	 */
	public Human(String name) {
		super(name);
	}

	/**
	 * A human introduces himself as its sound.
	 * Overrides the method in the base class Animal
	 * 
	 * @Override Enforces the behaviour of overriding. 
	 * If this method should not exist an error will be thrown.
	 */
	@Override
	public void makeSound() {
		System.out.println("Hallo, ich bin " + name + "!");

	}

}
