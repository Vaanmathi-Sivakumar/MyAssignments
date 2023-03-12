package week1.assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		//Declare an string variable with value
		String test="I am a software tester";
		
		//split the string by space and store it in string array
		String[] t = test.split(" ");  // \\s+is is used in case of multiple space
		
		//declare an empty string
		String val = "";
		
		//iterate from 0 to length of string array
		for (int i = 0; i < t.length; i++) {
			
			//checks if i%2 is equal to 1
		    if (i % 2 == 1)
		    	
		    	//reverse that particular word and store it in val
		        val = val + new StringBuilder(t[i]).reverse().toString() + " ";
		    else
		        val = val + t[i] + " ";
		}
		//print val
		System.out.println(val);

	}

}
