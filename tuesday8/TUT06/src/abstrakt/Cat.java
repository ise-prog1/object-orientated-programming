package abstrakt;

/**
 * This class represents a cat.
 */
public class Cat extends Animal {

	/**
	 * Constructor for Cat
	 * @param name - The name for the cat.
	 */
	public Cat(String name) {
		super(name);
	}
	
	/**
	 * Cats meow!
	 * Overrides the method in the base class Animal
	 * 
	 * @Override Enforces the behaviour of overriding. 
	 * If this method should not exist an error will be thrown.
	 */
	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
	
	/**
	 * A method that we only have in the Cat class.
	 * Not accessible in the Animal context.
	 */
	public void hunt() {
		System.out.println(name + "the Cat is hunting...");
	}

}
