package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num =12,remainder;
		int temp = num,rev=0;
		while(num!=0)
		{
		remainder=num%10;
		rev=rev*10+remainder;
		num=num/10;
		
	}
		System.out.println("Reversed Number:" +rev);
if(temp==rev)
{
	System.out.println(temp+ " Number is palindrome");
}
else
	System.out.println(temp+ " Number is not palindrome");
}
}