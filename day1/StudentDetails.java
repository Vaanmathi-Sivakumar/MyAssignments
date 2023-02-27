package week2.day1;

public class StudentDetails {
	public void getStudentId()
	{
		System.out.println("Get student ID"); 
	}
	public void getStudentName()
	{
		System.out.println("Get student Name"); 
	}
	public void getStudentAddress()
	{
		System.out.println("Get student Address"); 
	}
	public void getStudentgender()
	{
		System.out.println("Get student Gender"); 
	}
	public void getStudentDOB()
	{
		System.out.println("Get student DOB"); 
	}
	public static void main(String[] args) {
		StudentDetails stuDetail= new StudentDetails();
		stuDetail.getStudentId();
		stuDetail.getStudentName();
		stuDetail.getStudentAddress();
		stuDetail.getStudentgender();
		stuDetail.getStudentDOB();
	}
}
