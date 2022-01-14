package week3.day2;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
    String s="PayPal India";
    s=s.replace(" ", "");
    char[] chArray=s.toCharArray();
    System.out.println(chArray);
    Set<Character> charSet=new HashSet<Character>();
    Set<Character> dupCharSet=new HashSet<Character>();
    for(char c:chArray)
    {
    	boolean add = charSet.add(c);
    	if(!add) {
		dupCharSet.add(c);
		}
    }
    System.out.println(dupCharSet);
    System.out.println(charSet);
	}

}
