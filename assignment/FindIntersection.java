package week1.assignment;

public class FindIntersection {

	public static void main(String[] args) {
		//Declare two integer arrays with values
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		
		//iterate the loop from 0 to length of first array
		for (int i = 0; i < a.length; i++) {
			
			////iterate the loop from 0 to length of second array
			for (int j = 0; j < b.length; j++) {
				
				//checks if value in first array is equal to value in second array
				if(a[i]==b[j])
				{
					//print the value
					System.out.println(a[i]);
				}
				
			}
			
		}

	}

}
