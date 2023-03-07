package week3.day2;

import java.util.Scanner;

public class ChangeOddIndexUpperCase {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		char[] characters=str1.toCharArray();
		for(int i=0;i<characters.length;i++)
		{
			if((i+1)%2==0)
			{
				
				System.out.println(Character.toUpperCase(characters[i]));
			}
			else
			{
				System.out.println(characters[i]);
			}
		}
	}

}
