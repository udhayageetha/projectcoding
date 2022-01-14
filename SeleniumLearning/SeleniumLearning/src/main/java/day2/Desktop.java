package week3.day2;

public class Desktop implements Software {
    public void desktopModel()
    {
    	System.out.println("desktop ");
    }
	public static void main(String[] args) {
		Desktop desObj=new Desktop();
		desObj.desktopModel();
		desObj.harwareResources();
		desObj.harwareResources();

	}

	public void harwareResources() {
		System.out.println("harware desktop");
		
	}

	public void softwareResources() {
	System.out.println("desktop software");
		
	}

}
