package hardy;

import java.util.Arrays;

public class Q11_Q15 {

	public static void main(String[] args) 
	{

		System.out.println(mystery("no"));
		System.out.println(mystery("on"));
		System.out.println(mystery("nnoo"));
		System.out.println(mystery("nono"));
		System.out.println(mystery("noon"));
		System.out.println("Q11: E");
		System.out.println(" ");
		bootrue();
		System.out.println("Q12: B");
		System.out.println(" ");
		System.out.println(Arrays.toString(mystery3(3)));
		System.out.println("Q13: A");
		System.out.println(" ");
		System.out.println("1, 2, 3" + biggest(1, 2, 3));
		System.out.println("3, 3, 1" + biggest(3, 3, 1));
		System.out.println("3, 1, 3" + biggest(3, 1, 3));
		System.out.println("1, 3, 3" + biggest(1, 3, 3));

		System.out.println("Q14: C");
		System.out.println(" ");
		showMe(0);
		System.out.println(" ");
		System.out.println("Q15: A");

	}

	private static boolean mystery(String str)
	{
		String temp = "";

		for (int k = str.length(); k >  0; k--)
		{
			temp = temp + str.substring(k - 1, k);
		}
		return temp.equals(str);
	}

	private static void bootrue() {
		boolean x = true;
		boolean y = true;
		{
			if ((x && y) && (!x || y))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
		}

	}

	private static int[] mystery3(int x)
	{

		int[]numbers = {17, 34, 21, 42, 15, 69, 48, 25, 39};

		{
			for (int k = 1; k < numbers.length; k = k + x)
			{
				numbers[k] = numbers[k - 1] + x;
			}
			return numbers;
		}

	}


	private static int biggest(int a, int b, int c)
	{
		if ((a > b) && (a > c))
		{
			return a;

		}
		else if (( b > a) && (b > c))
		{
			return b;
		}
		else
		{
			return c;
		}
	}

	public static void showMe(int arg)
	{
		if (arg < 10)
		{
			showMe(arg + 1);
		}
		else
		{
			System.out.print(arg + " ");
		}
	}

}










