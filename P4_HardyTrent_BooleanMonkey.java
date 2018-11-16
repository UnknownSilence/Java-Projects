public class P4_HardyTrent_BooleanMonkey {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("class program: P4_HardyTrent_BooleanMonkey");
		System.out.println(" ");

		boolean aSmileCall = true;
		boolean bSmileCall = true;
		System.out.println("call input: aSmileCall: " + aSmileCall
				+	" **** call input: bSmileCall: " + bSmileCall);
		System.out.println("Method call result: " + monkeyTrouble(aSmileCall,bSmileCall));
		
		aSmileCall = true;
		bSmileCall = false;
		System.out.println("call input: aSmileCall: " + aSmileCall
				+	" **** call input: bSmileCall: " + bSmileCall);
		System.out.println("Method call result: " + monkeyTrouble(aSmileCall,bSmileCall));

		aSmileCall = false;
		bSmileCall = true;
		System.out.println("call input: aSmileCall: " + aSmileCall
				+	" **** call input: bSmileCall: " + bSmileCall);
		System.out.println("Method call result: " + monkeyTrouble(aSmileCall,bSmileCall));

		aSmileCall = false;
		bSmileCall = false;
		System.out.println("call input: aSmileCall: " + aSmileCall
				+	" **** call input: bSmileCall: " + bSmileCall);
		System.out.println("Method call result: " + monkeyTrouble(aSmileCall,bSmileCall));

	}
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if ((!aSmile && !bSmile) || (aSmile && bSmile))
		    return true;
		{
		 return false;

	       }
	      }
}
