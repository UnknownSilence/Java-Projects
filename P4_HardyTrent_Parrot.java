public class P4_HardyTrent_Parrot {

	public static void main(String[] args) {

		System.out.println("P4_HardyTrent_Parrot");
		System.out.println("Call value talking: true");
		System.out.println("Call value hour: 3");
		System.out.println("Method parrot Result: " + parrotTrouble(true,3) + "/n *******");

			System.out.println("Call value talking: false");
		System.out.println("Call value hour: 3");
		System.out.println("Method parrot Result: " + parrotTrouble(false,3) + "/n *******");

		System.out.println("Call value talking: true");
		System.out.println("Call value hour: 9");
		System.out.println("Method parrot Result: " + parrotTrouble(true,9) + "/n *******");

		System.out.println("Call value talking: false");
		System.out.println("Call value hour: 9");
		System.out.println("Method parrot Result: " + parrotTrouble(false,9) + "/n *******");

		System.out.println("Call value talking: true");
		System.out.println("Call value hour: 22");
		System.out.println("Method parrot Result: " + parrotTrouble(true,22) + "/n *******");

		System.out.println("Call value talking: false");
		System.out.println("Call value hour: 22");
		System.out.println("Method parrot Result: " + parrotTrouble(false,22) + "/n *******");

	}
	  public static boolean parrotTrouble(boolean talking, int hour) {
		return (talking && (hour < 7 || hour > 20));
		// Need extra parenthesis around the || clause
		// since && binds more tightly than ||
		// && is like arithmetic *. || is like arithmetic +
	       }
	       }