package week1.day1;

public class Globalvariables
{
	String mobileModel="Samsung";
	int mobileWeight=29;
	boolean isFullCharge=true;
	double mobileCost=50000.90;

	public static void main(String args[])
	{

		Globalvariables globalObj=new Globalvariables();
		System.out.println(globalObj.mobileModel);
		System.out.println(globalObj.mobileWeight);
		System.out.println(globalObj.isFullCharge);
		System.out.println(globalObj.mobileCost);
	}

}
