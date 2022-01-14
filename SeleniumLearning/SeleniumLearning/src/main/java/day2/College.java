package week3.day2;

public class College extends University {

	public static void main(String[] args) {

College collObj=new College();
collObj.pg();
collObj.ug();
	}

	@Override
	void ug() {
		
		System.out.println("ug course");
	}

	

}
