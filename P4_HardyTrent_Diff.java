
public class P4_HardyTrent_Diff {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("P4_HardyTrent_Diff");
			System.out.println("Call value n: 16");
			System.out.println("Method Diff Result: " + diff21(16));
			System.out.println("*******");

			System.out.println("Call value n: 33");
			System.out.println("Method Diff Result: " + diff21(33));
			System.out.println("*******");

		}

		public static int diff21(int n) {
			if (n <= 21) {
				return 21 - n;
			} else {
				return (n - 21) * 2;
			}
		}
}