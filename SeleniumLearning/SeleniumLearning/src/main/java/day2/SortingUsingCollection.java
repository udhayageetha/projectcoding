package week3.day2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		int size=input.length;
		List<String>list=Arrays.asList(input);
		Collections.sort(list);
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(list.get(i));
		}
		
		
		

	}

}
