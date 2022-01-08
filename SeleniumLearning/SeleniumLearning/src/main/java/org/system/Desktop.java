package org.system;

public class Desktop extends Computer{

	public void desktopSize()
	{
		System.out.println("Desktop size 100 mm");
	}
	public static void main(String[] args) {

		Desktop desObject=new Desktop();
		desObject.computerModel();
		desObject.desktopSize();
	}

}
