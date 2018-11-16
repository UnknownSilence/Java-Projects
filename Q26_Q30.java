package hardy;

import java.util.Arrays;

public class Q26_Q30 {

	public static void main(String[] args) {


		System.out.println("Question 26: E");
		start();
		System.out.println(" ");
		System.out.println("Question 27: B");		
		int[] sort1 = {6, 3, 2, 5, 4, 1};
		sort(sort1);
		System.out.print(Arrays.toString(sort1));
		System.out.println(" ");
		int[] sort3 = {1, 2, 3, 4, 5, 6};
		sort2(sort3);
		System.out.println("Question 28: B");
		System.out.println(" ");
		System.out.println(what(1));
		System.out.println(what(10));
		System.out.println(what(100));


		System.out.println("Question 29: A");

		System.out.println("getCost, 3: " + getCost(3));
		System.out.println("getCost, 6: " + getCost(6));		
		System.out.println("getCost, 12: " + getCost(12));
		System.out.println(" ");

		System.out.println("Question 30: B");	

	}
	public static void changeIt(int[] arr, int val, String word) {
		arr = new int[5];
		val = 0;
		word = word.substring(0, 5);

		for (int k = 0; k < arr.length; k++)
		{
			arr[k] = 0;
		}

	}

	public static void start()
	{
		int[] nums = {1, 2, 3, 4, 5};
		int value = 6;
		String name = "blackboard";

		changeIt(nums, value, name);

		for (int k = 0; k < nums.length; k++)
		{
			System.out.print(nums[k] + " ");
		}
		System.out.print(value + " ");
		System.out.print(name);
	}


	public static void sort(int[] data)
	{

		for (int j = 0; j <= 2; j++)
		{
			int m =j;
			for (int k = j + 1; k < data.length; k++)
			{
				if (data[k] < data[m])
				{
					m = k;
				}
			}
			int temp = data[m];
			data[m] = data[j];
			data[j] = temp;

		}
	}

	public static void sort2(int[] data)
	{

		int compare = 0;
		int assign = 0;

		for (int j = 0; j < data.length - 1; j++)
		{
			int m =j;
			for (int k = j + 1; k < data.length; k++)
			{
				if (data[k] < data[m])
				{
					m = k;
				}
				compare++;
			}
			int temp = data[m];
			assign++;
			data[m] = data[j];
			data[j] = temp;
		}
		System.out.println("compare: " + compare);
		System.out.println("assign: " + assign);
	}

	public static int what(int num) {


		if (num < 10)
		{
			return 1;
		}
		else
		{
			return 1 + what(num / 10);
		}
	}

	public static double getCost(int numBoxes)
	{
		double totalCost = 0.0;

		if (numBoxes >= 10)
		{
			totalCost = numBoxes * 1.50;
		}
		else if (numBoxes >= 5)
		{
			totalCost = numBoxes * 3.00;		
		}
		else
		{
			totalCost = numBoxes * 5.00;
		}

		return totalCost;

	}
}