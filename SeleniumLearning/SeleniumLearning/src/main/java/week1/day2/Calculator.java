package week1.day2;
//format-> ctrl+shift+f
public class Calculator {

	int num1,num2,sum,sub,mul,div;

	public int addResult(int num1,int num2)
	{
		sum=num1+num2;
		return sum;
	}
	public int subResult(int num1,int num2)
	{
		sub=num1-num2;
		return sub;
	}
	public int mulResult(int num1,int num2)
	{
		mul=num1*num2;
		return mul;
	}
	public int divResult(int num1,int num2)
	{
		div=num1/num2;
		return div;
	}
	public static void main(String[] args) {

		Calculator calObj=new Calculator();
		System.out.println("Addition:" +calObj.addResult(10, 20));
		int subtraction=calObj.subResult(40, 20);
		System.out.println("Subtraction:"+subtraction);
		System.out.println("Multiplication:" +calObj.mulResult(10, 20));
		System.out.println("Divison:" +calObj.divResult(50, 20));

	}
}


