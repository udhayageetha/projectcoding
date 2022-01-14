package week3.day2;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] testSplit=test.split(" ");
		System.out.println(Arrays.toString(testSplit));
		int arr=testSplit.length;
		for(int i=0;i<arr;i++)
		{
			if(i%2==0)
			{
				char[] charArray=testSplit[i].toCharArray();
			
		
		for(int j=charArray.length-1;j>=0;j--)
		
		{
			System.out.print( charArray[j]+   "");
		}
		
			    System.out.println(String.valueOf(charArray));
			
		}
		}
		//System.out.println(" ");	

	}	
}


