public class P4_HardyTrent_max1020 {
	
	public static int max1020(int a, int b) {
		
		if (b > a) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		if (a >= 10 && a <= 20) return a;
		if (b >= 10 && b <= 20) return b;
		return 0;
	}
	
	public static void main (String[] args) {
		

			System.out.println("class program: P4_HardyTrent_max1020");
			System.out.println(" ");

			int aCall = 11; int bCall = 19;
			System.out.println("call inputs: aCall: " + aCall
				+ " bCall: " + bCall 
				+ " ** Method call Result: " + max1020(aCall, bCall));

			aCall = 8; bCall = 91;
			System.out.println("call inputs: aCall: " + aCall 
				+ " bCall: " + bCall 
				+ " ** Method call Result: " + max1020(aCall, bCall));

			aCall = 3; bCall = 15;
			System.out.println("call inputs: aCall: " + aCall 
				+ " bCall: " + bCall 
				+ " ** Method call Result: " + max1020(aCall, bCall));

			aCall = 31; bCall = 8;
			System.out.println("call inputs: aCall: " + aCall 
				+ " bCall: " + bCall 
				+ " ** Method call Result: " + max1020(aCall, bCall));
	}
}
	