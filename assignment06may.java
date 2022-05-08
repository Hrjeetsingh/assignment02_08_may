/*"1. Encrypt the string - 2
https://practice.geeksforgeeks.org/problems/encrypt-the-string-21117/1/
*/

import java.awt.*;
import java.util.*;
class encrypt{
	static String convertToHex(int num)
	{

		StringBuilder temp = new StringBuilder();
		while (num != 0) {
			int rem = num % 16;
			char c;
			if (rem < 10) {
				c = (char) (rem + 48);
			}
			else {
				c = (char) (rem + 87);
			}
			temp.append(c);
			num = num / 16;
		}

		return temp.toString();
	}

	static String encryptString(String S, int N)
	{

		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < N; i++) {

			char ch = S.charAt(i);
			int count = 0;
			String hex;

			while (i < N && S.charAt(i) == ch) {

				count++;
				i++;
			}
			i--;
			hex = convertToHex(count);

			ans.append(ch);
			ans.append(hex);
		}

	
		ans.reverse();

	
		return ans.toString();
	}
	
	
	public static void main(String[] args)
	{
	

		String S = "abc";
		int N = S.length();

		System.out.println(encryptString(S, N));
	}
}




/*
2. Roatating the String check
https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1"
*/


class StringRotation {
	static boolean areRotations(String str1, String str2)
	{
		return (str1.length() == str2.length()) &&
			((str1 + str1).contains(str2));
	}

	public static void main(String[] args)
	{
		String str1 = "AACD";
		String str2 = "ACDA";

		if (areRotations(str1, str2))
			System.out.println("Yes");
		else
			System.out.printf("No");
	}
}
