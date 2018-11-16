public class P4_HardyTrent_Q1_Q5 {
	public static void main(String [] args) {
	System.out.println(numDivisors(8));
	under();
	P4_HardyTrent_A obj = new P4_HardyTrent_B();
	obj.show();
}
	

}
	private static int numDivisors(int inputVal) {
	int count = 0;
	for (int k=1; k<=inputVal; k++) {
	if (inputVal % k == 0){
		count ++; }
}
		return count;
}
	private static void under() {
	for (int r=3; r>0; r--) {
	int c;
	for (c=1; c<r; c++) {
	System.out.print("_");
}
	for (c=r; c<=3; c++) {
	System.out.println("*");
}
	System.out.println();
}
}
	private int[] arr;

	public int findMax() {

	int maxVal = 0

	for (int val = arr) {
	if (val > maxVal) {
	max = val;





