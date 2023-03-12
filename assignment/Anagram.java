package week1.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare two string variables with values
		String str1="race";  
		String str2="care";
		
		//find the length of the string ad store it in integer variable
		int len1=str1.length();
		int len2=str2.length();
		
		//compare whether both string length are equal
		if(len1==len2)
		{
			System.out.println("length is equal");
		}
		else
		{
			System.out.println("length not equal");
		}
		
		//convert the string into characters and store it in char array
		char[] charArr1=str1.toCharArray();
		char[] charArr2=str2.toCharArray();
		
		//sort the character array
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		//print the sorted array
		System.out.println(Arrays.toString(charArr1));
		System.out.println(Arrays.toString(charArr2));
		
		boolean equals=Arrays.equals(charArr1,charArr2); // checks whether both the arrays are equal using .equals method
		System.out.println(equals);
		
		if(Arrays.equals(charArr1,charArr2))
		{
			System.out.println("The given string is Anagram");  //it is anagram if it is equal
		}
		else
		{
			System.out.println("The given string is not Anagram");
		}
	}

}
