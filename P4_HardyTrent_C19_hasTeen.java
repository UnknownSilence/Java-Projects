public class P4_HardyTrent_C19_hasTeen {

	public static void main(String[] args) {
		System.out.println("Class program: P4_HardyTrent_C19_hasTeen");
		System.out.println(" ");

		int teen1, teen2, teen3;

		teen1 = 13;	teen2 = 20;	teen3 = 20;
		System.out.println("call inputs: teen1: " + teen1
			+ " teen2: " + teen2 + " teen3: " + teen3
			+ " ** Method call Result: "
			+ hasTeen(teen1, teen2, teen3));

		teen1 = 20;	teen2 = 19;	teen3 = 10;
		System.out.println("call inputs: teen1: " + teen1
			+ " teen2: " + teen2 + " teen3: " + teen3
			+ " ** Method call Result: "
			+ hasTeen(teen1, teen2, teen3));

		teen1 = 20;	teen2 = 10;	teen3 = 13;
		System.out.println("call inputs: teen1: " + teen1
			+ " teen2: " + teen2 + " teen3: " + teen3
			+ " ** Method call Result: "
			+ hasTeen(teen1, teen2, teen3));

		teen1 = 29;	teen2 = 30;	teen3 = 43;
		System.out.println("call inputs: teen1: " + teen1
			+ " teen2: " + teen2 + " teen3: " + teen3
			+ " ** Method call Result: "
			+ hasTeen(teen1, teen2, teen3));
		}
		public static boolean hasTeen(int a, int b, int c) {
		
			return (a>=13 && a<=19) ||
			(b>=13 && b<=19) ||
			(c>=13 && c<=19);
		}
	}


		