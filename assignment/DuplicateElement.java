package week1.assignment;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare an integer array with values
		int arr1[]= {7,2,4,5,6,7,8,4,6,6};
		
		//declare integer variables count and flag
		int count=0,flag=0;
	
		//Iterate the values 0 to length of the array 
		for(int i=0;i<arr1.length;i++)
		{
			count=1;
			//Add Inner loop ,to compare the values
			for (int j=i+1;j<arr1.length;j++)
			{
				
				//compares i index value with i+1 value
				if(arr1[i]==arr1[j])
				{
					
				//increase the count and assign a[j]=flag
					count++;
					arr1[j]=flag;
				}
				
			}
			
			//checks whether count is greater than 1 and arr[i] is not equal to flag
			if(count>1&&arr1[i]!=flag)
			{
				System.out.println(arr1[i]);
			}
		}

	}

}
