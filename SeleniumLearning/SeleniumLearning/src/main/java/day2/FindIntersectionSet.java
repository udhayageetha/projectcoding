package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class FindIntersectionSet {

	public static void main(String[] args) {
		int arr1[]={3,2,11,4,6,7};
		int arr2[]={1,2,8,4,9,7};
		Set <Integer> intValue1=new TreeSet<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				intValue1.add(arr1[i]);
				intValue1.add(arr2[j]);
				
				
			}
		}
		
		System.out.println(intValue1);
		

	}

}
