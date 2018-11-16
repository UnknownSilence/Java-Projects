public class P4_HardyTrent_07_Near100or200 {

	  /**
	  * @param args
	  * Given an int n, return true if it is within 10 of 100 or 200.
	  * Note: Math.abs(num) computes the absolute value of a number.
	  * I have 4 test cases:
	  * nearHundred(93) -> true
	  * nearHundred(90) -> true
	  * nearHundred(89) -> false
	  * nearHundred(212) -> false
	  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("class program P4_HardyTrent_07_Near100or200");
		System.out.println(" ");

		int nCall = 93;
		System.out.println("Call input nCall: " + nCall
			+ " ** Method Call Result: " + nearHundred(nCall));

		nCall = 90;
		System.out.println("Call input nCall: " + nCall
			+ " ** Method Call Result: " + nearHundred(nCall));

		nCall = 89;
		System.out.println("Call input nCall: " + nCall
			+ " ** Method Call Result: " + nearHundred(nCall));

		nCall = 212;
		System.out.println("Call input nCall: " + nCall
			+ " ** Method Call Result: " + nearHundred(nCall));
	}

public static boolean nearHundred(int n) {
	return ((Math.abs(100 - n) <= 10) ||
	  (Math.abs(200 - n) <= 10));
	}
}
	