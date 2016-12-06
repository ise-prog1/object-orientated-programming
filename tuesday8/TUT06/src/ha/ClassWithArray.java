package ha;

import java.util.Arrays;

/**
 * This class has an Array of a reference type.
 * 
 * Updating the values of the referenced type will be reflected in the array
 * 
 * extends Object is implied.
 */
public class ClassWithArray extends Object {

	private String name;
	private IntHolder[] array;
	
	public ClassWithArray(String name, IntHolder...holders) {
		this.name = name;
		
		// wrong. You do not have to copy over the references.
		/*
		this.array = new IntHolder[holders.length];
		for (int i = 0; i < holders.length; i++) {
			this.array[i] = holders[i];
		}*/
		
		// the right way, simply accept the given values.
		this.array = holders;
		
	}

	@Override
	public String toString() {
		return "ClassWithArray [name=" + name + ", array=" + Arrays.toString(array) + "]";
	}
}
