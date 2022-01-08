package week3.day1;

public class Students {
    
	public void getStudentInfo(int id)
	{
	System.out.println("id"+ " " +id);	
	}
	public void getStudentInfo(int id,String name)
	{
	
	System.out.println("id"+ " " +id+ "\n"+"name" +" " +name);	
	}
	public void getStudentInfo(long phNum,String email)
	{
	
	System.out.println("number:" +phNum+ "\n"+"emal" +"" +email);	
	}
	public static void main(String[] args) {
		Students stuObj=new Students();
		stuObj.getStudentInfo(2);
		stuObj.getStudentInfo(5, "udhaya");
		stuObj.getStudentInfo(9994089, "abc@hmail.com");
		
	}

}
