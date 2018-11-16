public class P4_HardyTrent_C14_or5or3 {

	/**
	 * @author Joe Cusack
	 * Return true if the given non negative number is a multiple of 3
	 * or a multiple of 5. Use the % "mod" operator
	 * -- see Introduction to mod on next 5 lines,
	 * e.g. 23 % 10 results in 3
	 * Repeatedly subtract 10 from 23 ... whats left?
	 * like the "remainder" after diving by 10
	 *
	 * or2or5(3) becomes true
	 * or3or5(10) becomes true
	 * or3or5(8) becomes false
	 * or3or5(30) becomes true
	 */

	static boolean or3or5(int n) {
		return (n % 3 == 0) || (n % 5 == 0);
	}

	public static void main(String[] args) {
		System.out.println("class program: P4_HardyTrent_C14_or5or3");
		System.out.println(" ");

		int nCall; // The identifier n is being defined with the primitive integer

		// The identifier nCall is being assigned the values of 3, 10, 8 and 30 below
		nCall = 3;
		System.out.println("call inputs: nCall: 3 "
			+ " ** Method call Result: " + or3or5(nCall));

		nCall = 10;
		System.out.println("call inputs: nCall: 10 "
			+ " ** Method call Result: " + or3or5(nCall));

		nCall = 8;
		System.out.println("call inputs: nCall: 8 "
			+ " ** Method call Result: " + or3or5(nCall));

		nCall = 30;
		System.out.println("call inputs: nCall: 30 "
			+ " ** Method call Result: " + or3or5(nCall));
	}
}