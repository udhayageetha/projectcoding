package week1.day1;

public class Factorial
{
	int factValue=1;
	int findFactorial=5;
	public void factorialResult()
	{
		for(int i=1;i<=findFactorial;i++)
			factValue=factValue*i;
	}

	public static void main(String args[])
	{

		Factorial factObj=new Factorial();
		factObj.factorialResult();
		System.out.println("Factorial of a number:" +factObj.factValue);
	}
}


