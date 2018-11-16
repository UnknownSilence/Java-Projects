public class P4_HardyTrent_09_notString {

	/* Given a string,
	 * return a new string where "not" has been added to the font.
	 * However, if the string already begins with "Not".
	 * return the string unchanged.
	 * Note: use .equals() to compare 2 strings
	 *
	 * notString("candy") -> "not candy"
	 * notString("x") -> "not x"
	 * notString("not bad") -> "not bad"
	 * notString("nothing changed") -> "nothing changed"
	 */

	public static void main(String[] args) {

		System.out.println("class program P4_HardyTrent_09_notString");		System.out.println(" ");

		// String is a complex object not a primitive like int, double, or char
		String strCall = "not candy";
		System.out.println("call input: strCall: " + strCall
			+ " ** Method Call result: " + notString(strCall));

		strCall = "x";
		System.out.println("call input: strCall: " + strCall
			+ " ** Method Call result: " + notString(strCall));

		strCall = "not bad";
		System.out.println("call input: strCall: " + strCall
			+ " ** Method Call result: " + notString(strCall));

		strCall = "nothing changed";
		System.out.println("call input: strCall: " + strCall
			+ " ** Method Call result: " + notString(strCall));
	}
	public static String notString(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("not"))
		{
			return str;
		}
		return "not " + str;
	}
}