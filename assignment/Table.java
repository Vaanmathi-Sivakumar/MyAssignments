package week1.assignment;

public class Table {
	public static void main(String[] args) 
	{
	//declare an integer variable
	int mul=1;
	
	//iterate from 1 to 10
	for(int i=1;i<=10;i++)
	{
		//multiply i with 10(10th table) and store it in mul
		mul=i*10;
		//print the value
		System.out.println(i+"*10="+mul);
	}
	}
}
