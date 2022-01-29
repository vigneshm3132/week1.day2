package week1.day2;

import java.util.Iterator;

public class FindTypes {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		// Build the logic to find the count of each
		//Convert the String to character array
		
		char[] charArray1 = test.toCharArray();
		
		//Traverse through each character (using loop)
		for (int i = 0; i < charArray1.length; i++) {
			
			if(Character.isLetter(charArray1[i]))
			{
				letter = letter +1;
			}else if (Character.isDigit(charArray1[i]))
			{
				num = num +1;
			}else if (Character.isSpace(charArray1[i]))
			{
				space = space +1;
			}else
			{
				specialChar = specialChar +1;
			}
			
				
		}
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
		
		
		
	}
}
