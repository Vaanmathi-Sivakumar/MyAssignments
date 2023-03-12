package week1.assignment;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare  integer variable and get value using scanner class
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		//checks if a%2 is equal to 0
		if(a%2==0)
		{
			System.out.println(a+" is even");
		}
		else
		{
			System.out.println(a+" is odd");
		}
		

	}

}
