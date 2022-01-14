package week3.day2;

import java.util.LinkedList;
import java.util.List;

public class PrintDuplicatesInArraySet {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> listDup=new LinkedList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					listDup.add(arr[i]);	
				}
			}

		}
		System.out.println(listDup);
	}

}
