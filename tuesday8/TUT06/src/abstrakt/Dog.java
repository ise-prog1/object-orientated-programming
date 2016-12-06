package abstrakt;

/**
 * This class represents a dog.
 */
public class Dog extends Animal {

	/**
	 * Constructor for Dog
	 * @param name - The name for the dog.
	 */
	public Dog(String name) {
		super(name);
	}

	/**
	 * Dogs bark.
	 * Overrides the method in the base class Animal
	 * 
	 * @Override Enforces the behaviour of overriding. 
	 * If this method should not exist an error will be thrown.
	 */
	@Override
	public void makeSound() {
		System.out.println("Woof!");
	}
}
