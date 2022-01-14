package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int size1=text1.length();
		int size2=text2.length();
		if(size1==size2)
		{
			char[] ch1=text1.toCharArray();
			char[] ch2=text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(ch1.equals(ch2))
			{
				System.out.println(ch1);
			}

			System.out.println(ch1);

		}
	}
}

