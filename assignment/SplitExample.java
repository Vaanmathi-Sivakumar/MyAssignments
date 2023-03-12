package week1.assignment;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare a string with value
		String str1="Amazon has 20,000 employee in   Chennai";
		
		//split the string and store it in string array
		String[] len=str1.split("\\s+");
		System.out.println(len.length);
		
		//replace
		String replaceAll=str1.replaceAll("[0-9]","");
		System.out.println(replaceAll);
		
		String replaceAll1=str1.replaceAll("[^0-9]","");
		System.out.println(replaceAll1);
		
		Boolean contains=str1.contains("Amazon");
		System.out.println(contains);
	}

}
