package week3.day2;

public class Automation extends MultipleLanguage {

	public static void main(String[] args) {
		Automation autoObj=new Automation();
		autoObj.Selenium();
		autoObj.phython();
		autoObj.ruby();

	}

	public void Selenium() {
		System.out.println("selenium");
	}

	public void Java() {
	System.out.println("java");	
	}

	@Override
	public void ruby() {
		
		System.out.println("ruby class");
	}

}
