public class P4_HardyTrent_C13_backAround {

	/* Given a String, take the last char and return
	 * a new String with the last char added at the front and back,
	 * so "cat" yields "tcatt"
	 * The original String will be length 1 or more,
	 * backAround*"cat") becomes "tcatt"
	 * backAround("Joe") Becomes "eJoee"
	 * backAround("Cusack") becomes "kCusackk"
	 */

static String backAround(String str) {
	// Get the last char
	String last = str.substring(str.length() - 1);
	return last + str + last;
       }

    public static void main(String[] args) {
	System.out.println("Class program: P4_HardyTrent_C13_backAround");
	System.out.println(" ");

	String strCall; //The identifier strCall is being defined wit hthe complex Object String
	strCall = "cat";
	System.out.println("call inputs: strCall: cat "
		+ " ** Method call Result: " + backAround(strCall));

	strCall = "KleinCollins";
	System.out.println("call inputs: strCall: Klein Collins "
		+ " ** Method call Result: " + backAround(strCall));

	strCall = "Trent";
	System.out.println("call inputs: strCall: Trent "
		+ " ** Method call Result: " + backAround(strCall));

	strCall = "Hardy";
	System.out.println("call inputs: strCall: Hardy "
		+ " ** Method call Result: " + backAround(strCall));
      }
}

