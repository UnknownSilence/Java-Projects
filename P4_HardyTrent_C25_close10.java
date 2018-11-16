public class P4_HardyTrent_C25_close10 {

	public static int close10(int a, int b) {
		int aDiff = Math.abs(a - 10);
		int bDiff = Math.abs(b - 10);

		if (aDiff < bDiff) {
			return a;
		}
		if (bDiff < aDiff) {
			return b;
		}
		return 0;
	}
		public static void main(String[] args) {

			System.out.println("class program: P4_HardyTrent_C25_close10");
			System.out.println