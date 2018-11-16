public class P4_HardyTrent_mixStart {
	
	public static void main (String[] args) { 
		System.out.println("class program: P4_HardyTrent_mixStart");
		System.out.println(" ");

		String strCall = "mix snacks";
		System.out.println("call inputs: strCall: " +strCall
			+ " ** Method call Result: " + mixStart(strCall));
		
		strCall = "pix snacks";
		System.out.println("call inputs: strCall: " +strCall
			+ " ** Method call Result: " + mixStart(strCall));
		
		strCall = "apiz snacks";
		System.out.println("call inputs: strCall: " +strCall
			+ " ** Method call Result: " + mixStart(strCall));
		
		strCall = "mi";
		System.out.println("call inputs: strCall: " +strCall
			+ " ** Method call Result: " + mixStart(strCall));

		strCall = "9ix Hardy";
		System.out.println("call inputs: strCall: " +strCall
			+ " ** Method call Result: " + mixStart(strCall));

		
	}
	public static boolean mixStart(String str) {
		if (str.length() < 3) return false;
		
		String two = str.substring(1, 3);
		
		if (two.equals("ix")) {
			return true;
		} else {
			return false;
		}
	}		
}
		