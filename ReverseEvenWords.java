package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		
		// split the words and have it in an array
		String[] spliteven = test.split(" ");
		
		//Traverse through each word (using loop)
		for (int i = 0; i < spliteven.length; i++) {
			
			if(i % 2 != 0) {
				// split the words and have it in an array
			String test1 = spliteven[i];
			String[] spliteven1 = test1.split("");
			// print the even position words in reverse order using another loop (nested
			// loop)
			for (int j = spliteven1.length -1; j>=0; j--) {
				// Convert words to character array if the position is even else print the word
				// as it is(concatenate space at the end).
				System.out.print(spliteven1[j]);
			}
			}
			else
			{
				System.out.print(" " + spliteven[i] + " ");
			}
			
		}
	}
	
}
