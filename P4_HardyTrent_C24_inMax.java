public class P4_HardyTrent_C24_inMax {

	public static void main(String[] args) {
		System.out.println("Class program: P4_HardyTrent_C24_inMax");
		System.out.println(" ");

		int aCall = 1; int bCall = 2; int cCall = 4;
		System.out.println("call inputs: aCall: " + aCall + " bCall: " + bCall + " cCall: " + cCall
			+ " ** Method call Result: " + intMax(aCall, bCall, cCall));

		int aCall = 1; int bCall = 5; int cCall = 2;
		System.out.println("call inputs: aCall: " + aCall + " bCall: " + bCall + " cCall: " + cCall
			+ " ** Method call Result: " + intMax(aCall, bCall, cCall));

		int aCall = 9; int bCall = 2; int cCall = 1;
		System.out.println("call inputs: aCall: " + aCall + " bCall: " + bCall + " cCall: " + cCall
			+ " ** Method call Result: " + intMax(aCall, bCall, cCall));

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