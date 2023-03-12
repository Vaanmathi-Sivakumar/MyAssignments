package week1.assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		//Declare String variable and get values using scanner class
		String str1,str2=""; //declare an empty string variable
		str1=sc.nextLine();
		
		//convert the string into characters and store it in char array
		char[] characters= str1.toCharArray();
		//iterate the loop from char array length to 0 in reverse
		for(int i=characters.length-1;i>=0;i--)
		{
			//add character to str2
			str2=str2+characters[i];
		}
		
		//checks if str1 is equal to str2
		if(str1.equals(str2))
		{
			System.out.println(str1+" is Palindrome");
		}
		else
		{
			System.out.println(str1+" is not Palindrome");
		}

	}

}
