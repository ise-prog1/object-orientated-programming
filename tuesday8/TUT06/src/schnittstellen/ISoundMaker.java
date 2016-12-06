package schnittstellen;

/**
 * This interface represents any possible source of sound
 * 
 * Methods in Interfaces are public and abstract by default
 * and that cannot be changed, except for default methods in Java 8
 */
public interface ISoundMaker {

	
	/**
	 * makes a Sound by printing to console
	 */
	void makeSound();
	
	/**
	 * Example of a default method
	 * 
	 * These look very similar to other methods,
	 * only to differ in the default keyword.
	 * 
	 * You can override these methods in the implementing classes,
	 * but you do not have to.
	 * @return an empty String
	 */
	default String getDefaultSound() {
		return "";
	}
}
