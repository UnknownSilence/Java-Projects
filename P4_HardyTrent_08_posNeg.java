public class P4_HardyTrent_08_posNeg {

	 /*
	 * Given 2 int values,
	 *	    return true if one is negative
	 *	    and one is positive.
	 *	    then return true only if both are negative.
	 * posNeg(1, -1, false) == true
	 * posNeg(-1, 1, false) == true
	 * posNeg(-4, -5, true) == true
	 * posNeg(99, 88, true) == false
 	 */

	public static void main(String[] args) {

		System.out.println("class program: P4_HardyTrent_08_posNeg");
		System.out.println(" ");

		int aCall = 1;	int bCall = -1; boolean posNeg = false;
		System.out.println("call inputs: aCall: " + aCall + " ** bCall: " + bCall + " ** posNeg: " + posNeg
			+ " ** Method call Result: " + posNeg(aCall, bCall, posNeg));

		aCall = 1;	bCall = 1; posNeg = false;
		System.out.println("call inputs: aCall: " + aCall + " ** bCall: " + bCall + " ** posNeg: " + posNeg
			+ " ** Method call Result: " + posNeg(aCall, bCall, posNeg));

		aCall = -4;	bCall = -5; posNeg = true;
		System.out.println("call inputs: aCall: " + aCall + " ** bCall: " + bCall + " ** posNeg: " + posNeg
			+ " ** Method call Result: " + posNeg(aCall, bCall, posNeg));

		aCall = 99;	bCall = 88; posNeg = true;
		System.out.println("call inputs: aCall: " + aCall + " ** bCall: " + bCall + " ** posNeg: " + posNeg
			+ " ** Method call Result: " + posNeg(aCall, bCall, posNeg));

	}

	public static boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			return (a < 0 && b < 0);
		}
		else {
			return ((a < 0 && b > 0) || (a > 0 && b < 0));
		}
	}
}





