
package hardy;

public class Q16_Q20 {
	public static void main(String [] args) {
		System.out.println("Question 16: E ");
		int[][] values = {{3,2,1,4},{1,2,3,4},{2,2,1,2},{1,1,1,1}};
		calculate(values);
		System.out.println(" ");

		System.out.println("Question 17: D");
		System.out.println(doWhat(1));
		System.out.println(doWhat(2));
		System.out.println(doWhat(3));
		System.out.println(doWhat(4));
		System.out.println(" ");

		System.out.println("Question 18: D ");
		System.out.println(404 / 10 * 10 + 1);
		System.out.println(" ");
		System.out.println("Question 19: E ");

		System.out.println(" ");

		System.out.println("Question 20: E ");
		int [] arr = {3, 2, 32, 5, 4, 4};
		System.out.println(mystery(arr));
		System.out.println(" ");
	}
	public static void calculate(int[][]values)
	{
		int found = values[0][0];
		int result = 0;
		for (int[] row : values)

		{
			for (int y = 0; y < row.length; y++)
			{
				if (row [y] > found)
				{
					found = row[y];
					result = y;
				}
			}
		}
		System.out.println(result);
	}
	public static int doWhat(int num)
	{
		int var = 0;
		for (int loop = 1; loop <= num; loop = loop + 2)
		{
			var += loop;
		}
		return var;
	}
	public static int mystery(int[] arr)
	{
		int index = 0;
		int count = 0;
		int m = -1;

		for (int outer = 0; outer < arr.length; outer++)
		{
			count = 0;
			for (int inner = outer + 1; inner < arr.length; inner++)
			{
				if (arr[outer] == arr[inner])
				{
					count++;
				}
			}
			if (count > m)
			{
				index = outer;
				m = count;
			}
		}
		return index;

	}
}