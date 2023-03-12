package week1.assignment;

import java.util.Arrays;

public class SecondLarge {

	public static void main(String[] args) {
		//Declare an integer array with value
		int[] number= {1,5,9,2,6,3,5,4,8,7};
		
		//find the length of the array using .length 
		int length=number.length;
		//sort the array
		Arrays.sort(number);
		
		//print the n-2 number
		System.out.println(number[length-2]);
	}

}
