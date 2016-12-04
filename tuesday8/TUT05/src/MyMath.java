import Prog1Tools.IOTools;

public class MyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 2; i++) {
			int base = IOTools.readInt("Basis (ganze Zahl): ");
			int expo = IOTools.readInt("Exponent (ganze Zahl): ");
			int result = hoch(base, expo);
			System.out.println(base + " hoch " + expo + " = " + result);
			double baseDouble = IOTools.readDouble("Basis (double): ");
			expo = IOTools.readInt("Exponent (ganze Zahl): ");
			double resultDouble = hoch(baseDouble, expo);
			System.out.println(baseDouble + " hoch " + expo + " = " + resultDouble);
		}
	}


	/**
	* Special case. Returns a whole number if the base is also a whole number
	* @param x - the base 
	* @param k - the exponent
	* @return x^k (Example: 2^4 = 16)
	*/
	public static int hoch(int x, int k) {
		return (int)(hoch((double)x, k));
	}
	
	/**
	* Calculates the power of two given numbers
	* @param x - the base 
	* @param k - the exponent
	* @return x^k (Example: 2^4 = 16)
	*/
	public static double hoch(double x, int k) {
		// 2^(-4) == 1 / (2^4)
		if (k < 0) {
			return (1.0) / hoch(x, -k);
		}
		double result = 1.0D;
		for(int i = 0; i < k; i++) {
			result *= x;
		}
		return result;
	}

}
