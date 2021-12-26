package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
	int[] data= {3,2,11,4,6,7};
	Arrays.sort(data);
	int[] sortedData=new int[data.length];
	for(int i=0;i<data.length;i++)
	{
	sortedData[i]=data[i];	
	System.out.println(sortedData[i]);
	}
	int secondLargest=data.length-2;
	System.out.println("Second Largest Value:" +data[secondLargest]);

	}

}
