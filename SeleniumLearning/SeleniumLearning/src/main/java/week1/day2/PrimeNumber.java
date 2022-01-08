package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=6;
		int remainder;
		boolean flag=false;
			for(int i=2;i<=input/2;i++)
			{
			remainder=input%i;
			if(remainder==0)
			{
				flag=true;
				break;
			}
			}
			if(flag=false)
			System.out.println(input+   "  is prime number");
			else
				System.out.println(input+   " is not a prime number");
			}
			
}
	


