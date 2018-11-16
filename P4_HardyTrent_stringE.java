public class P4_HardyTrent_stringE {
	
	public static boolean stringE(String str) {
		int count = 0;
	
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == 'e') count++;

		}
		return (count >= 1 && count <= 3);
	}
		
	public static void main(String[] args) {


		System.out.println("class program: P4_HardyTrent_stringE");
		System.out.println(" ");

		String strCall = "Hello";
		System.out.println("call inputs: strCall: " + strCall
			+ " ** Method call Result: " + stringE(strCall));

		strCall = "Heello";
		System.out.println("call inputs: strCall: " + strCall
			+ " ** Method call Result: " + stringE(strCall));

		strCall = "Heelele";
		System.out.println("call inputs: strCall: " + strCall
			+ " ** Method call Result: " + stringE(strCall));

		strCall = "BryceHarris";
		System.out.println("call inputs: strCall: " + strCall
			+ " ** Method call Result: " + stringE(strCall));

	}
}
	