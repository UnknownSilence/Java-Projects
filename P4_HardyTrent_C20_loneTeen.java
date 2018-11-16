public class P4_HardyTrent_C20_loneTeen {

	public static void main(String[] args) {
		System.out.println("Class program: P4_HardyTrent_C20_loneTeen");
		System.out.println(" ");

		int teen1, teen2;

		teen1 = 13;	teen2 = 99;
		System.out.println("call inputs: teen1: " + teen1
			+ " teen2: " + teen2
			+ " ** Method call Result: "
			+ loneTeen(teen1, teen2));

			teen1 = 21;	teen2 = 19;
		System.out.println("call inputs: teen1: " + teen1
			+ " teen2: " + teen2
			+ " ** Method call Result: "
			+ loneTeen(teen1, teen2));

			teen1 = 13;	teen2 = 14;
		System.out.println("call inputs: teen1: " + teen1
			+ " teen2: " + teen2
			+ " ** Method call Result: "
			+ loneTeen(teen1, teen2));

			teen1 = 15;	teen2 = 17;
		System.out.println("call inputs: teen1: " + teen1
			+ " teen2: " + teen2
			+ " ** Method call Result: "
			+ loneTeen(teen1, teen2));
		}
		public static boolean loneTeen(int a, int b) {

			boolean aTeen = (a >= 13 && a <= 19);	boolean bTeen = (b >= 13 && b <=19);
			return (aTeen && !bTeen) || (!aTeen && bTeen);
		}
}