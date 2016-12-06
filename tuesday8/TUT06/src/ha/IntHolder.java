package ha;

/**
 * Simply class that holds an int value.
 * You can modify the value to represent some change.
 * As you modify the content, references do not change and will point to the updated values
 */
public class IntHolder {

	private int value;
	
	public IntHolder(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	/**
	 * Sets the given value if the value is greater or equal to 0
	 * @param value - the new value that is not negative
	 */
	public void setValue(int value) {
		// ignore negative values
		if (value < 0) {
			return;
		}
		this.value = value;
	}

	@Override
	public String toString() {
		return "IntHolder [value=" + value + "]";
	}
	
	
}
