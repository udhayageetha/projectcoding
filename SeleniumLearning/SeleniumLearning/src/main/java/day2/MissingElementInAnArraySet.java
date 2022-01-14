package week3.day2;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementInAnArraySet {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		Set<Integer>intMissing=new TreeSet<Integer>();
		for(int i=1;i<arr.length-1;i++)
		{
			intMissing.add(i);
		}
		for(int i=0;i<arr.length;i++)
					{
					intMissing.remove(arr[i]);
					}
		
				
for(int x:intMissing)
{
System.out.println(x);
	}
	}
	}

		
	

