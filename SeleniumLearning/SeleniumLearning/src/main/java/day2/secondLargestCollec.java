package week3.day2;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class secondLargestCollec {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		int size=data.length;
		Set<Integer> ascOrder=new TreeSet<Integer>();
		for(int i=0;i<size;i++)
		{
		ascOrder.add(data[i]);
		}
		System.out.println(ascOrder);
		List<Integer>listPrint=new LinkedList<Integer>(ascOrder);
		System.out.println(listPrint.get(size-2));
	}

}
