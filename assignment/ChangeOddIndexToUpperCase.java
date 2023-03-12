package week1.assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		//Declare a string variable with value
		String str1="testing";
		
		//convert the string into character and store it in char array
		char[] characters=str1.toCharArray();
		
		//To find the odd Index traverse through the length of the char array
		for(int i=0;i<characters.length;i++)
		{
			
			// checks whether i%2==1
			if(i%2==1)
			{
				
				//if yes,change it into upper case
				System.out.print(Character.toUpperCase(characters[i]));
				
			}
			else
			{
				System.out.print(characters[i]);
			}
		}
	}

	}

