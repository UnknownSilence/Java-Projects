public class P4_HardyTrent_Logical0
{
 public static void main( String args[] )
 {
	System.out.println("");
	System.out.println("Java Logical Operators");
	System.out.println("");
	System.out.println("------------------------------");
	System.out.println("|   Operators  |   Meaning   |");
	System.out.println("------------------------------");
	System.out.println("|      &&      | Logical AND |");
	System.out.println("|      ||      | Logical OR  |");
	System.out.println("|       !      | Logical NOT |");
	System.out.println("------------------------------");
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("The logical operators && and || are used ");
	System.out.println("when we want to form compound conditions by combining two or more relations.");
	System.out.println("Logical operators return results indicated in the following table.");
	System.out.println("");
	System.out.println(" ");
	System.out.println("-----------------------------");
	System.out.println("| X |  Y  | X && Y | X || Y |");
	System.out.println("-----------------------------");
	System.out.println("| T |  T  |    T   |    T   |");
	System.out.println("| T |  F  |    F   |    T   |");
	System.out.println("| F |  T  |    F   |    T   |");
	System.out.println("| F |  F  |    F   |    F   |");
	System.out.println("-----------------------------");
	System.out.println(" ");
	System.out.println("");
	System.out.println("----------------------------");
	System.out.println("|      X       |      !    |");
	System.out.println("----------------------------");
	System.out.println("|      T        |     F    |");
	System.out.println("|      T        |     T    |");
	System.out.println("----------------------------");
	System.out.println("");
	System.out.println("");
	System.out.println("I tested the logic tables above with actual Java statements below:");
	System.out.println("");
 // create truth table for && (conditional AND) operator
 System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
  "Conditional AND (&&)", "false && false", ( false && false ),
  "false && true", ( false && true ),
  "true && false", ( true && false ),
 "true && true", ( true && true ) );
 // create truth table for || (conditional OR) operator
 System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
  "Conditional OR (||)", "false || false", ( false || false ),
  "false || true", ( false || true ),
  "true || false", ( true || false ),
  "true || true", ( true || true ) );
 // create truth table for & (boolean logical AND) operator
 System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
  "Boolean logical AND (&)", "false & false", ( false & false ),
  "false & true", ( false & true ),
  "true & false", ( true & false ),
  "true & true", ( true & true ) );
 // create truth table for | (boolean logical inclusive OR) operator
 System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
  "Boolean logical inclusive OR (|)",
  "false | false", ( false | false ),
  "false | true", ( false | true ),
  "true | false", ( true | false ),
  "true | true", ( true | true ) );
 // create truth table for ^ (boolean logical exclusive OR) operator
 System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
  "Boolean logical exclusive OR (^)",
  "false ^ false", ( false ^ false ),
  "false ^ true", ( false ^ true ),
  "true ^ false", ( true ^ false ),
  "true ^ true", ( true ^ true ) );
 // create truth table for ! (logical negation) operator
 System.out.printf( "%s\n%s: %b\n%s: %b\n", "Logical NOT (!)",
  "!false", ( !false ), "!true", ( !true ) );
 }
}