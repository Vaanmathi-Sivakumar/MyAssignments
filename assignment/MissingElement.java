package week1.assignment;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
				
				//Declare an integer array with value
				int a[]= {5,4,2,3,1,8,6};
				
				//Sort the array using sort method
				Arrays.sort(a);
				
				//Iterate the loop from 0 to length of the array
				for(int i=0;i<a.length;i++)
				{
					//checks whether value in a[i] is not equal to i+1
					if(a[i]!=i+1)
					{
						//Print the missing element
						System.out.println(i+1);
						
						//Break the loop once the missing element is found
						break;
					}
				}

	}

}
