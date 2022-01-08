package week3.day1;

public class AndroidPhoneInheritance extends SmartPhoneInheritance {
	public void takeVideo()
	{
		System.out.println("taking video from and");
	}
	public static void main(String[] args) {


		AndroidPhoneInheritance andObject=new AndroidPhoneInheritance();
		andObject.accessWhatsapp();
		andObject.sendMsg();
		andObject.makeCall();
		andObject.saveContact();
		andObject.takeVideo();
	}

}
