public class P4_HardyTrent_intMax {
	
	public static void main (String[] args) { 
		System.out.println("class program: P4_HardyTrent_intMax");
		System.out.println(" ");

		int aCall = 1; int bCall = 2; int cCall = 4;
		System.out.println("call inputs: aCall: " + aCall + " bCall: " + bCall + " cCall: " + cCall
			+ " ** Method call Result: " + intMax(aCall, bCall, cCall));

		aCall = 1; bCall = 5; cCall = 2;
		System.out.println("call inputs: aCall: " + aCall + " bCall: " + bCall + " cCall: " + cCall
			+ " ** Method call Result: " + intMax(aCall, bCall, cCall));

		aCall = 9; bCall = 2; cCall = 1;
		System.out.println("call inputs: aCall: " + aCall + " bCall: " + bCall + " cCall: " + cCall
			+ " ** Method call Result: " + intMax(aCall, bCall, cCall));
	}
	public static int intMax(int a, int b, int c) {
		int max;
		
		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		if (c > max) {
			max = c;
		}
		
		return max;
	}
}