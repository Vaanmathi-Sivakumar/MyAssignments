package week1.assignment;

public class Factorial {

	public static void main(String[] args) {
		
		// declare integer variables fact with value 1 and n with any value
		int fact=1,n=5;
		//iterate through the loop in reverse order
		for(int i=n;i>0;i--)
		{
			// multiply i with fact
			fact=fact*i;
		}
		//print fact
		System.out.println(fact);

	}

}
