public class P4_HardyTrent_C12_front5 {
	/* Given a String, we'll say that the front is the first 5 chars of the String.
	 * If the string length is less than 5, the front is whatever is there
	 * Return a new String which is 3 copies of the front.
	 * front5("Coding") becomes "CodinCodinCodin"
	 * front5("And") becomes "AndAndAnd"
	 * front5("KleinCollins") becomes "Klein"
	 * front5("HardyTrent") becomes "HardyHardyHardy"	// Replace my name with yours
	 * Note: I moved main to the bottom of the code. */
	static String front5(String str) {
		String front;
		if (str.length() >= 5) {
		  front = str.substring(0,5);
		}
		else {
		   front = str;
		}
		return front + front + front;
	      }

	public static void main(String[] args) {
		System.out.println("class program:P4_HardyTrent_C12_front5");
		System.out.println(" ");

		String strCall; // The Identifier strCall is being defined with the String java Object

		// The Identifier strCall is being assigned the value of code
		strCall = "coding";
		System.out.println("call inputs: strCall: code "
			+ " ** Method call Result: " + front5(strCall));

		strCall = "And";
		System.out.println("call inputs: strCall: code "
			+ " ** Method call Result: " + front5(strCall));

		strCall = "KleinCollins";
		System.out.println("call inputs: strCall: code "
			+ " ** Method call Result: " + front5(strCall));

		strCall = "HardyTrent";
		System.out.println("call inputs: strCall: code "
			+ " ** Method call Result: " + front5(strCall));

	}
}
			