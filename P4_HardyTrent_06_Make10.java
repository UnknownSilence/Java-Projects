public class P4_HardyTrent_06_Make10 {
	public static void main(String[] args) {
		// Given 2 integers, a and b,
		//	return true if one of them is 10 or if their sum is 10.
		// The following are what are called test cases:
		//	I have 4 different test cases.
		// makes10(9, 10) == true
		// makes10(9, 9) == false
		// makes10(1, 9) == true
		// makes10(11, 8) == false

		System.out.println("class program: P4_HardyTrent_06_Make10");
		System.out.println(" ");

		int aCall = 9;
		int bCall = 10;
		System.out.println("call inputs: aCall: " + aCall
			+   " ** bCall: " + bCall
		  	+   " ** Method call Result: " + makes10(aCall,bCall));

		aCall = 9;
		bCall = 9;
		System.out.println("call inputs: aCall: " + aCall
			+   " ** bCall: " + bCall
		  	+   " ** Method call Result: " + makes10(aCall,bCall));

		aCall = 1;
		bCall = 9;
		System.out.println("call inputs: aCall: " + aCall
			+   " ** bCall: " + bCall
		  	+   " ** Method call Result: " + makes10(aCall,bCall));

		aCall = 11;
		bCall = 8;
		System.out.println("call inputs: aCall: " + aCall
			+   " ** bCall: " + bCall
		  	+   " ** Method call Result: " + makes10(aCall,bCall));
	}
	public static boolean makes10(int a, int b) {
	    return (a == 10 || b == 10 || a + b == 10);
	}
}
	
