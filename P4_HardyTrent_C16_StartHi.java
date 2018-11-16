public class P4_HardyTrent_C16_StartHi {

	/**
	 * @author Joe Cusack
	 * Given a string, return true if the string with "hi"
	 * and false otherwise.
	 * startHi("hi there") becomes true
	 * startHi("hi") becomes true
	 * startHi("hello hi") become false	*/

	public static void main(String[] args) {
		System.out.println("Class program: P4_HardyTrent_C16_StartHi");
		System.out.println(" ");

		String strCall;

		// The identifier strCall is being assigned to hi there, hi, hello hi, Joe Cusack
		strCall = "hi there";
		System.out.println("call inputs: strCall: " + strCall
			+ " ** Method call Result: " + startHi(strCall));

		strCall = "hi";
		System.out.println("call inputs: strCall: " + strCall
			+ " ** Method call Result: " + startHi(strCall));

		strCall = "hello hi";
		System.out.println("call inputs: strCall: " + strCall
			+ " ** Method call Result: " + startHi(strCall));

	}

public static boolean startHi(String str) {
	// First test if the string is not atleast length 2
	// (so the substring() below does not go past the end
	if (str.length() < 2) return false;

	// Pull out the string of the first two chars
	String firstTwo = str.substring(0, 2);

	// Test if it is equal to "hi"
	if (firstTwo.equals("hi")) {
		return true;
	} else {
		return false;
	}
	 // This last part can be shortened to: return(firstTwo.equals("hi"));
       }
}