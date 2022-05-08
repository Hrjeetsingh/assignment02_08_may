/*"1. Find the second minimum element in the array -> Come up with two appoaches and find which is best
*/
import java.io.*;

class SecondSmallest
{
	
	
	static void print2Smallest(int arr[])
	{
		int first, second, arr_size = arr.length;

		
		if (arr_size < 2)
		{
			System.out.println(" Invalid Input ");
			return;
		}

		first = second = Integer.MAX_VALUE;
		for (int i = 0; i < arr_size ; i ++)
		{
			if (arr[i] < first)
			{
				second = first;
				first = arr[i];
			}

			else if (arr[i] < second && arr[i] != first)
				second = arr[i];
		}
		if (second == Integer.MAX_VALUE)
			System.out.println("There is no second" +
							"smallest element");
	}

	
	public static void main (String[] args)
	{
		int arr[] = {12, 13, 1, 10, 34, 1};
		print2Smallest(arr);
	}
}




/*
 Find the frequency of each String in the array
{""India"", ""Australia"",""India"",""Japan""}

Output 
India - 2
Australia - 1
Japan - 1"*/


class SubString{
	
	static int search(String[]arr, String s)
	{
			int counter = 0;
			for (int j = 0; j < arr.length; j++)

				if (s.equals(arr[j]))
					counter++;

		return counter;
	}

	static void answerQueries(String[] arr, String q[])
	{
		for (int i=0;i<q.length; i++)
			System.out.print(search(arr, q[i]) + " ");
	}

	
	public static void main(String[] args) {

		String[] arr = {"aba","baba","aba","xzxb"};
		String[] q = {"aba","xzxb","ab"};
		answerQueries(arr, q);
	}
}


