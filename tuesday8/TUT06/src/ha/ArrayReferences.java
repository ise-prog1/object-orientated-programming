package ha;

public class ArrayReferences {

	public static void main(String[] args) {
		IntHolder a = new IntHolder(0);
		IntHolder b = new IntHolder(1);
		ClassWithArray array = new ClassWithArray("test", a, b);
		// Modifying the elements inside the array 
		// update the array as the content of the reference changes.
		// b.getValue() == 1
		System.out.println(array);
		b.setValue(42);
		// b.getValue() == 42
		System.out.println(array);
		// negative values get ignored -> no change
		// b.getValue() == 42
		b.setValue(-42);
		System.out.println(array);
	}

}
