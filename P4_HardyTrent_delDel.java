public class P4_HardyTrent_delDel {
	
	public static void main (String[] args) { 
		System.out.println("class program: P4_HardyTrent_delDel");
		System.out.println(" ");

		String strCall = "abelbc";
		System.out.println("call inputs: strCall: " +strCall
			+ " ** Method call Result: " + delDel(strCall));
		
		strCall = "adelHello";
		System.out.println("call inputs: strCall: " +strCall
			+ " ** Method call Result: " + delDel(strCall));
		
		strCall = "adedbc";
		System.out.println("call inputs: strCall: " +strCall
			+ " ** Method call Result: " + delDel(strCall));
		
		strCall = "AdelHardy";
		System.out.println("call inputs: strCall: " +strCall
			+ " ** Method call Result: " + delDel(strCall));
		
	}
	public static String delDel(String str) {
		if (str.length()>=4 && str.substring(1, 4).equals("del")) {
			return str.substring(0, 1) + str.substring(4);
		}
		
		return str;
	}
}
		