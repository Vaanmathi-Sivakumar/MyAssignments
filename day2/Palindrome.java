package week3.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str1,str2="";
		str1=sc.nextLine();
		char[] characters= str1.toCharArray();
		for(int i=characters.length-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
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
