package week1.day1;

public class OddNumber {

	public void oddNumbers()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==1)
			{
				System.out.println("Odd Numbers are:" +i);
			}
			
		}
	}
	public static void main(String[] args) {
		OddNumber oddObj=new OddNumber();
		oddObj.oddNumbers();
	}

}
