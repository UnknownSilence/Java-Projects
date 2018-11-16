public class P4_HardyTrent_C27_in3050 {

	public static boolean in3050(int a, int b) {

		if (a >= 30 && a <= 40 && b >= 40 && b <= 50) {
			return true;
		}
		if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
			return true;
		}
		return false;
	      }

	public static void main(String[] args) {

		System.out.println("Class program: P4_HardyTrent_C27_in3050");
		System.out.println(" ");

		int aCall = 30; int bCall = 31;
		System.out.println("call inputs: aCall: " + aCall + " bCall: " + bCall
			+ " ** Method call Result: " + in3050(aCall, bCall));

		aCall = 30; bCall = 41;
		System.out.println("call inputs: aCall: " + aCall + " bCall: " + bCall
			+ " ** Method call Result: " + in3050(aCall, bCall));

		aCall = 40; bCall = 50;
		System.out.println("call inputs: aCall: " + aCall + " bCall: " + bCall
			+ " ** Method call Result: " + in3050(aCall, bCall));
	}
}