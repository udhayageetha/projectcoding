package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCollections {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] chDup=text.split(" ");
		Set<String> charSet=new LinkedHashSet<String>();
		 for(String str:chDup)
		 {
			 charSet.add(str);
			 }
		 System.out.println(charSet);
	}
}