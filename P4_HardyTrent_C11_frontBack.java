class P4_HardyTrent_C11_frontBack {

	/* Given a string return a new string where the first and last chars have been exchanged.
	 * frontBack("code") becomes "eodc"
	 * frontBack("a") becomes "a"
	 * frontBack("KleinCollins") becomes "sleinCollinK"
	 * frontBack("TrentHardy") becomes "yrentHardT"
	 * Note: You will need to replace my name with your full name
	 * 	without any spaces.
	 * Note: I put the moved main to the bottom of the code
	 * 	this was to show you it can be done
	 *	and that the code will run fine.
	 *	in later lessons when I create objects from classes
	 *	you should appreciate why I changed my format.	*/

	static String frontBack(String str) {
		if (str.length() <= 1) return str;
		// store the middle part of the word to use with your
		String mid = str.substring(1, str.length()-1);
		// Concatenate last and mid and first together
		return str.charAt(str.length()-1) + mid + str.charAt(0);
	}

		public static void main(String[] args) {

			System.out.println("class program P4_HardyTrent_C11_frontBack");
			System.out.println(" ");
			// The identifier strCall is being defined with the String Java Object
			String strCall;

			// The Identifier strCall is being assigned the value of code
			strCall = "code";
			System.out.println("call inputs: strCall: code "
				+ " ** Method Call Result: " + frontBack(strCall));

			strCall = "a";	// I assigned the identifier the value of a
			System.out.println("call inputs: strCall: code "
				+ " ** Method Call Result: " + frontBack(strCall));

			strCall = "KleinCollins";	
			System.out.println("call inputs: strCall: code "
				+ " ** Method Call Result: " + frontBack(strCall));

			strCall = "TrentHardy";
			System.out.println("call inputs: strCall: code "
				+ " ** Method Call Result: " + frontBack(strCall));
		}
}