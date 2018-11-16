public class P4_HardyTrent_close10 {
	
	public static int close10(int a, int b) {
		int aDiff = Math.abs(a - 10);
		int bDiff = Math.abs(b - 10);
		
		if (aDiff < bDiff) {
			return a;
		} else {

		}
		if (bDiff < aDiff) {
			return b;
		}
		return 0;
	}
			
		public static void main(String[] args) { 

			System.out.println("class program: P4_HardyTrent_close10");
			System.out.println(" ");

			int aCall = 8; int bCall = 13;
			System.out.println("call inputs: aCall: " + aCall + " bCall " + bCall
				+ " ** Method call Result: " + close10(aCall, bCall));

			aCall = 14; bCall = 7;
			System.out.println("call inputs: aCall: " + aCall + " bCall " + bCall
				+ " ** Method call Result: " + close10(aCall, bCall));

			aCall = 14; bCall = 6;
			System.out.println("call inputs: aCall: " + aCall + " bCall " + bCall
				+ " ** Method call Result: " + close10(aCall, bCall));
	}
}
