public class P4_HardyTrent_startOz {
	
	public static void main (String[] args) { 
		System.out.println("class program: P4_HardyTrent_startOz");
		System.out.println(" ");

		String strCall = "ozymandias";
		System.out.println("call inputs: strCall: " +strCall
			+ " ** Method call Result: " + startOz(strCall));
		
		strCall = "z";
		System.out.println("call inputs: strCall: " +strCall
			+ " ** Method call Result: " + startOz(strCall));
		
		strCall = "bzoo";
		System.out.println("call inputs: strCall: " +strCall
			+ " ** Method call Result: " + startOz(strCall));
		
		strCall = "oxx";
		System.out.println("call inputs: strCall: " +strCall
			+ " ** Method call Result: " + startOz(strCall));

		strCall = "oZHardy";
		System.out.println("call inputs: strCall: " +strCall
			+ " ** Method call Result: " + startOz(strCall));

		
	}
	public static String startOz(String str) {
		String result = "";
		if (str.length() >= 1 && str.charAt (0) =='o') {
			result = result + str.charAt(0);

		}
		if (str.length() >= 2 && str.charAt (1) =='z') {
			result = result + str.charAt(1);
		}
		return result;
	}
}
		