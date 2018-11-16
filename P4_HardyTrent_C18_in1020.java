public class P4_HardyTrent_C18_in1020 {

	/**
	 * @author Joe Cusack
	 * Given 2 int values,
	 * return true if either of them is in the range 10...20 inclusive.
	 * in1020(12, 99) becomes true
	 * in1020(21, 12) becomes true
	 * in1020(8, 99) becomes false
	 * in1020(-19, -99) becomes false
	 */
	public static void main(String[] args) {

		System.out.println("Class program: P4_HardyTrent_C18_in1020");
		System.out.println(" ");

		int value1call;
		int value2call;

		value1call = 12;	value2call = 99;
		System.out.println("call inputs: value1call: " + value1call
			+ " value2call: " + value2call
			+ " ** Method call Result: "
			+ in1020(value1call,value2call));

		value1call = 21;	value2call = 12;
		System.out.println("call inputs: value1call: " + value1call
			+ " value2call: " + value2call
			+ " ** Method call Result: "
			+ in1020(value1call,value2call));

			value1call = 8;	value2call = 99;
		System.out.println("call inputs: value1call: " + value1call
			+ " value2call: " + value2call
			+ " ** Method call Result: "
			+ in1020(value1call,value2call));

			value1call = -19;	value2call = -99;
		System.out.println("call inputs: value1call: " + value1call
			+ " value2call: " + value2call
			+ " ** Method call Result: "
			+ in1020(value1call,value2call));
	}
	public static boolean in1020(int a, int b) {
		return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
	}
}