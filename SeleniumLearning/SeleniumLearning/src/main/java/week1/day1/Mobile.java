package week1.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("Mobile calling");
	}
	public void sendMsg() {
		System.out.println("sending message");

	}
	public static void main(String args[])
	{
		Mobile mobObj=new Mobile();
		mobObj.makeCall();
		mobObj.sendMsg();
	}

}
