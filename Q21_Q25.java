package hardy;
import java.util.Arrays;

public class Q21_Q25 {
	public static void main(String[] args) {


		whatsItDo("WATCH");
		System.out.println("Question 21: D");
		{
			int[][] numbers = {{1,2,3},{4,5,6}};


			for (int[]row : numbers)
			{
				for (int n : row)
				{
					System.out.print(n);
				}
			}
			System.out.println(" ");
			System.out.println("Question 22: A");
			
			{
				int arr[] = {5,4,3,2,1};
				{
					for (int j = 1; j < arr.length; j++)
					{
						int insertItem = arr[j];
						int k = j - 1;

						while (k >= 0 && insertItem < arr[k])
						{
							arr[k + 1] = arr[k];
							k--;
						}

						arr[k + 1] = insertItem;
						System.out.print(Arrays.toString(arr));

					}
					
				}
			}

			System.out.println(" ");
			System.out.println("Question 23: C");
			System.out.println("Question 24: D");
			System.out.println("Question 25: C");
			int count = 0; {

				for (int x = 0; x < 4; x++)
				{
					for (int y = x; y < 4; y++)
					{
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}



	public static void whatsItDo(String str)
	{
		int len = str.length();
		if (len > 1)
		{
			String temp = str.substring(0, len - 1);
			System.out.println(temp);
			whatsItDo(temp);
		}
	}

		


}
class someMethods
{
	public void one(int first)
	{

	}
	public void one(int first, int second)
	{

	}
	public void one(int first, String second)
	{

	}
	public void one(String first, int second)
	{

	}
	public void one(int first, int second, int third)
	{

	}

}







