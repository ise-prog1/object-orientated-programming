
public class ArraysHA9 {

	// create an String array that has zero elements in it.
	// Might seem useless but an array with 0 elements is not equal to null
	// So we can use it without any null checks!
	public static String[] strings = new String[0];
	public static void main(String[] args) {

		int[] demo = {1,22, 3};
		System.out.println(findBiggestValueByIndex(demo)); // 1
	}
	
	/**
	* Adds any given amount of strings to the class array.
	* @param strings - the new Strings to be appended
	*/
	public static void addStrings(String... strings) {
		String[] newStrings = new String[ArraysHA9.strings.length + strings.length];
		int i = 0;
		for(; i < ArraysHA9.strings.length; i++) {
			newStrings[i] = ArraysHA9.strings[i];
		}
		
		for (int j = 0; j < strings.length; j++) {
			newStrings[i++] = strings[j]; 
		}
	}

	/**
	* Finds the index of the biggest Value inside the given array.
	* @param target - the int array to be searched
	*/
	public static int findBiggestValueByIndex(int[] target) {
		int index = -1;
		// Start with the smallest possible int value. Every other value is bigger than this value.
		int biggestValue = Integer.MIN_VALUE;
		// Arrays are a reference type, so they can be null!
		if (target == null) {
			return index;
		}
		
		for (int i = 0; i < target.length; i++) {
			if (target[i] > biggestValue) {
				// if there is a new biggestValue 
				// save it as the current biggestValue 
				// and save its index i in index
				biggestValue = target[i];
				index = i;
			}
		}
		
		return index;
	}
}