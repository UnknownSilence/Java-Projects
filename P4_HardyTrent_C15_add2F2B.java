public class P4_HardyTrent_C15_add2F2B {

	/**
	 * @author Joe Cusack
	 * Given a string, take the first 2 chars and 
	 * return the string with the 2 chars added at
	 * both the front and back, so "kitten" yields "kikittenki"
	 * If the the string length is less than 2, use whatever
	 * chars are there
	 * add2F2B("kitten") becomes "kikittenki"
	 * add2F2B("KleinCollins") becomes "KlKleinCollinsKl"
	 * add2F2B("JoeCusack") becomes "JoJoeCusackJo"	*/

	static String Add2F2B(String str) {
		// First figure the number of chars to take
		int take = 2;
		if (take > str.length()) {
			take = str.length();
		}
		String front = str.substring(0, take);
		return front + str + front;
	      }

	public static void main(String[] args) {
		System.out.println("Class program: P4_HardyTrent_C15_add2F2B");
		System.out.println(" ");

		String strCall;

		// The identifier strCall is being assigned to kitten, KleinCollins and JoeCusack
		strCall = "kitten";
		System.out.println("call inputs: strCall: " + strCall
			+ " ** Method call Result: " + Add2F2B(strCall));

		strCall = "KleinCollins";
		System.out.println("call inputs: strCall: " + strCall
			+ " ** Method call Result: " + Add2F2B(strCall));

		strCall = "TrentHardy";
		System.out.println("call inputs: strCall: " + strCall
			+ " ** Method call Result: " + Add2F2B(strCall));
	}
}

