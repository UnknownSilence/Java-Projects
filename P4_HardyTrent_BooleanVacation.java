public class P4_HardyTrent_BooleanVacation {

	public static void main(String[] args) {

		boolean weekdayCall;
		boolean vacationCall;
		
		System.out.println("P4_HardyTrent_BooleanVacation");

		weekdayCall = true;
		vacationCall = true;
		System.out.println("call input: weekdayCall: " + weekdayCall
				+	" call input: weekdayCall: " + vacationCall);
		System.out.println("Method call Result: "  + sleepIn(weekdayCall,vacationCall));

		weekdayCall = true;
		vacationCall = false;
		System.out.println("call input: weekdayCall: " + weekdayCall
				+	" call input: weekdayCall: " + vacationCall);
		System.out.println("Method call Result: "  + sleepIn(weekdayCall,vacationCall));

		weekdayCall = false;
		vacationCall = true;
		System.out.println("call input: weekdayCall: " + weekdayCall
				+	" call input: weekdayCall: " + vacationCall);
		System.out.println("Method call Result: "  + sleepIn(weekdayCall,vacationCall)); 

		weekdayCall = false;
		vacationCall = false;
		System.out.println("call input: weekdayCall: " + weekdayCall
				+	" call input: weekdayCall: " + vacationCall);
		System.out.println("Method call Result: "  + sleepIn(weekdayCall,vacationCall)); 
	}

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  if (!weekday || vacation) {
		    return true;
		  }

		  return false;

		  // Solution notes: better to write "vacation" than "vacation == true"
		  // though they mean exactly the same thing.
		  // Likewise "!weekday" is better than "weekday == false".
		  // This all can be shortened to: return (!weekday || vacation);
		  // Here we just put the return-false last, or could use an if/else.
		}

}		    