package week1.assignment;

public class PrintEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare a string variable 
		String text="testleaf";
		
		//convert the string into characters and store it in char array
		char[] characters=text.toCharArray();
		
		//traverse from 0 to char array length
		for(int i=0;i<characters.length;i++)
		{
			System.out.println(characters[i]);
		}
	}

}
