package week3.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {1,7,3,4,5,6,8};
		Arrays.sort(number);
		for(int i=0;i<number.length;i++)
		{
			if(number[i]!=i+1)
			{
				System.out.println(i+1);
				break;
				
			}
		}


	}

}
