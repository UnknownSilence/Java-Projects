public class P4_HardyTrent_C28_max1020 {


	public static int max1020(int a, int b) {

		if (b > a) {
		  int temp = a;
		  a = b;
		  b = temp;
		}

		if (a >= 10 && a <= 20) return a;
		