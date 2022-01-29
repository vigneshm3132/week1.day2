package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		
		// Check number of occurrences of a char (eg 'e') in a String
		String str = "welcome to chennai";
		char searchChar = 'e';
		
		// declare and initialize a variable count to store the number of occurrences
		int count = 0;
		// convert the string into char array
		char[] charArray1 = str.toCharArray();
		// get the length of the array
		//int length1 = charArray1.length;
		
		// traverse from 0 till the array length
		for (int i = 0; i < charArray1.length; i++) {
			
			// Check the char array has the particular char in it
			
			if (charArray1[i] == searchChar) {
				
				count = count +1;
						}
		}
			System.out.println(count);
			
		
		
		
		
	}
}
