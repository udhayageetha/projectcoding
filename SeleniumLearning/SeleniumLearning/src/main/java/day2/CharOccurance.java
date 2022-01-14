package week3.day2;

import java.util.Arrays;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		str=str.replace(" ","");
		int count=0;
		char[] ch1=str.toCharArray();
		System.out.println(ch1);
		int size=ch1.length;char c='e';
		for(int i=0;i<size;i++)
		{
		
			if(c==ch1[i])
			{
				count++;
				
			}
			
		}
		System.out.println(count);
	}
		
	
	}




