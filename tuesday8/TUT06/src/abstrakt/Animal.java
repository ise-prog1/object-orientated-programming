package abstrakt;

/**
 * This class represents any Animal
 * 
 * No animal is simply just an animal. This is the logic reason why we do not allow instanciating the Animal class directly.
 * By making this class abstract we gain the ability to impose certain functions that every subclass has to provide (abstract methods)
 */
public abstract class Animal {
	
	/**
	 * name - The name for an animal
	 * protected so it can be accessed in subclasses directly without going over the getter
	 */
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * Prints something to console
	 * 
	 * Represents a sound an animal can make.
	 */
	public abstract void makeSound();


}
