package week2.day2;

import week3.day1.BankInfo;

public class AxisBank extends BankInfo {
    public void deposit()
    {
    	System.out.println("deposit amt is 500 in axis");
    }
	public static void main(String[] args) {
		AxisBank axisObjec=new AxisBank();
		axisObjec.deposit();
		axisObjec.fixed();
		axisObjec.saving();

	}

}
