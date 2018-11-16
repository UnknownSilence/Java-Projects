public class P4_HardyTrent_longString {
		
	public static void main(String[] args) {
			System.out.println("class program:P4_HardyTrent_longString");
			System.out.println(" ");
	
			String str1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String str2 = "           11111111112222222222333333333334444444444";
			String str3 = "0123456789012345678901234567890123456789012345678901";
			
			System.out.println("substring(7,10) range is 7 (included) to 10 (excluded) ");
			System.out.println(str1.substring(7,10));
			System.out.println(str2.substring(7,10));
			System.out.println(str3.substring(7,10));
			System.out.println(" ");
			System.out.println("substring(12,15) range is 12 (included) to 15 (excluded) ");
			System.out.println(str1.substring(12,15));
			System.out.println(str2.substring(12,15));
			System.out.println(str3.substring(12,15));
			System.out.println(" ");	
			System.out.println("substring(17,20) range is 17 (included) to 20 (excluded) ");
			System.out.println(str1.substring(17,20));
			System.out.println(str2.substring(17,20));
			System.out.println(str3.substring(17,20));
			System.out.println(" ");
			System.out.println("substring(25,30) range is 25 (included) to 30 (excluded) ");
			System.out.println(str1.substring(25,30));
			System.out.println(str2.substring(25,30));
			System.out.println(str3.substring(25,30));
			System.out.println(" ");
	}
}