public class P4_HardyTrent_10_missingChar {

	/* Given a non-empty string and an int n,
	 * return a new string where the char at
	 * index n has been removed.
	 * The value of n will be valid
	 * index of a char in the original string
	 * (i.e. n will be in the range 0..str.length()-1 inclusive).
	 *
	 * missingChar("kitten", 1) -> "kitten"
	 * missingChar("kitten", 0) -> "kitten"
	 * missingChar("kitten", 4) -> "kitten"
	 * missingChar("kitten", 3) -> "kitten"		*/

	public static void main(String[] args) {

		System.out.println("class program: P4_HardyTrent_10_missingChar");
		System.out.println(" ");

		System.out.println("call inputs: strCall: kitten and 1 "
			+ " ** Method call Result: " + missingChar("kitten", 1));

		System.out.println("call inputs: strCall: kitten and 0 "
			+ " ** Method call Result: " + missingChar("kitten", 0));

		System.out.println("call inputs: strCall: kitten and 4 "
			+ " ** Method call Result: " + missingChar("kitten", 4));

		System.out.println("call inputs: strCall: kitten and 3 "
			+ " ** Method call Result: " + missingChar("kitten", 3));

	}
	public static String missingChar(String str, int n) {
		String front = str.substring(0, n);

		// Start this substring at n+1 to omit the char.
		// Can also be shortened to just str.substring(n+1)
		// which goes through the end of the string.
		// String is a complex object not a primitive object like int, char or double.
		String back = str.substring(n+1, str.length());

		return front + back;
	}
}