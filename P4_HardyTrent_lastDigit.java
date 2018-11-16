public class P4_HardyTrent_lastDigit {
	
	public static boolean lastDigit(int a, int b) {
		
		return(a % 10 == b % 10);
	}
	public static void main(String[] args) {


			System.out.println("class program: P4_HardyTrent_lastDigit");
			System.out.println(" ");

			int aCall = 7; int bCall = 17;
			System.out.println("call inputs: aCall: " + aCall
				+ " bCall: " + bCall 
				+ " ** Method call Result: " + lastDigit(aCall, bCall));

			aCall = 6; bCall = 20;
			System.out.println("call inputs: aCall: " + aCall 
				+ " bCall: " + bCall 
				+ " ** Method call Result: " + lastDigit(aCall, bCall));

			aCall = 3; bCall = 133;
			System.out.println("call inputs: aCall: " + aCall 
				+ " bCall: " + bCall 
				+ " ** Method call Result: " + lastDigit(aCall, bCall));

			aCall = 122; bCall = 1972;
			System.out.println("call inputs: aCall: " + aCall 
				+ " bCall: " + bCall 
				+ " ** Method call Result: " + lastDigit(aCall, bCall));

	}
}
	