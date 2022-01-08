package week1.day1;

public class Fibonacci
{
	int givenInput=8;
	int firstValue=0;
	int secondValue=1;
	int sum;
	public void fibonacciResult()
	{
	for (int i = 0; i <=givenInput; i++) 
	{
		sum=firstValue+secondValue;
		firstValue=secondValue;
		secondValue=sum;
	}	
	}
	public static void main(String[] args) {
	
		
		Fibonacci fibObj=new Fibonacci();
		fibObj.fibonacciResult();
		System.out.println("Fibonacci Value for a given number:" +fibObj.sum);
		

	}

}
