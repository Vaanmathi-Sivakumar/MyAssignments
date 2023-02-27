package week2.day1;

public class Car {
	
	public void applyBreak()
	{
		System.out.println("apply Break");
	}
	public void applyGear()
	{
		System.out.println("apply Gear");
	}
	public void switchOnAc()
	{
		System.out.println("switch On Ac");
	}
	public void applyAcclerate()
	{
		System.out.println("apply Acclerator");
	}
	
	public static void main(String[] args) {//main method
		Car myCar = new Car();//mobile() is a constructor
		myCar.applyBreak();//calling method by object
		myCar.applyGear();
		myCar.applyAcclerate();
		myCar.switchOnAc();
		
	}
		
}
