package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) {
		int number = -120;
		if(number<0)
		{
			System.out.println(number+  "  number is Negative number");
			int convertPositive=Math.abs(number);
			System.out.println("Negative Number converted to positive:" +convertPositive);
		}
		else if(number>0)
			System.out.println(number+ "  number is positive number");
		else
			System.out.println(number+ "  number is neither positive nor negative");
			
	}

}
