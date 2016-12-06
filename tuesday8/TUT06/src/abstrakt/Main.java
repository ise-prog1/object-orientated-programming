package abstrakt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cannot instanciate type Animal directly as the base class is abstract
		//Animal t = new Animal("Mensch");
		Cat cat = new Cat("Katze");
		Dog dog = new Dog("Hund");
		// but we can treat a Dog as an Animal
		Animal tier = new Dog("HundAlsTier");
		Animal human = new Human("Horst");
		
		tier.makeSound();
		cat.makeSound();
		dog.makeSound();
		human.makeSound();
		
		System.out.println("---------");
		
		testSound(tier);
		testSound(cat);
		testSound(dog);
		testSound(human);
	}
	
	/**
	 * This method accepts any Animal and produces its sound.
	 * @param tier - the Animal to be forced to make its sound
	 */
	public static void testSound(Animal tier) {
		//Inside this method we can only access methods available to the Animal class
		//tier.hunt() // Cat only method
		System.out.println(tier.getName() + " macht folgendes Geräusch: ");
		tier.makeSound();
	}

}
