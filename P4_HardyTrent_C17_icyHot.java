public class P4_HardyTrent_C17_icyHot {

	/**
	 * @author Joe Cusack
	 * Given two temperatures, return true if one is less than 0
	 * and the other is greater than 100.
	 * icyHot(120, -1) becomes true
	 * icyHot(-1, 120) becomes true
	 * icyHot(2, 120) becomes false
	 * icyHot(300, 123) becomes false
	 */
	public static void main(String[] args) {

		System.out.println("Class program: P4_HardyTrent_C17_icyHot");
		System.out.println(" ");

		int temp1call;
		int temp2call;

		temp1call = 120;	temp2call = -1;
		System.out.println("call inputs: temp1call: " + temp1call
			+ " temp2call: " + temp2call
			+ " ** Method call Result: " + icyHot(temp1call, temp2call));

		temp1call = -1;	temp2call = 120;
		System.out.println("call inputs: temp1call: " + temp1call
			+ " temp2call: " + temp2call
			+ " ** Method call Result: " + icyHot(temp1call, temp2call));

		temp1call = 2;	temp2call = 120;
		System.out.println("call inputs: temp1call: " + temp1call
			+ " temp2call: " + temp2call
			+ " ** Method call Result: " + icyHot(temp1call, temp2call));

		temp1call = 300;	temp2call = 123;
		System.out.println("call inputs: temp1call: " + temp1call
			+ " temp2call: " + temp2call
			+ " ** Method call Result: " + icyHot(temp1call, temp2call));
	}
	public static boolean icyHot(int temp1, int temp2) {
		return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
		// Code below is a longer version of the code above this line
		 // if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
		  //	return true;
		  // } else {
		 // return false;
		 }
	}
	
		
		
		