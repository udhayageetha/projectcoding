package week3.day1;

public class CalcOverloading {
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,double d,int c) {
		System.out.println(a+d+c);
	}
	public void multiply(int a,int b)
	{
		System.out.println(a*b);
	}
	public void multiply(int a,int b,double d) {
		System.out.println(a*b*d);
	}
	public void divide(int a,int b)
	{
		System.out.println(a/b);
	}
	public void divide(int a,double c) {
		System.out.println(a/c);
	}
	public static void main(String args[])
	{
		CalcOverloading objCalc=new CalcOverloading();
		objCalc.add(2, 4);
		objCalc.add(6, 7.8, 8);
		objCalc.multiply(8, 10);
		objCalc.multiply(9, 6, 7.5);
		objCalc.divide(10, 5);
		objCalc.divide(1, 10);
	}
}

