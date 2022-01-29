package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "tertd";
		String text2 = "potss";
		// Check length of the strings are same then (Use A Condition)
		if(text1.length() == text2.length())
		{
			// Convert both Strings in to characters
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			// Sort Both the arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			//Check both the arrays has same value
			
			//boolean result1 = Arrays.equals(charArray1, charArray2);
						
			boolean result1 = charArray1.equals(charArray2);
			
			if (result1)
			{
				
				System.out.println(text1 +" and " + text2 +" are Anagram" );
			}
			else
			{
				System.out.println(text1 +" and " + text2 +" are not Anagram");
			}
		}
		
		
				
		
	}
}
