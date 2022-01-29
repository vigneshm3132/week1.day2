package week1.day2;

public class Palindrome {
	
public static void main(String[] args) {
	
	//Declare A String value as"madam"
	String txt = "madame";
	
	//Declare another String rev value as ""
	String rev = "";
	
	int length = txt.length();
	
	//iterate over the String in reverse order
	for (int i = (length-1); i >=0 ; i--) 
	{
		
	//Add the char into rev
	rev= rev + txt.charAt(i);
	}
	//Compare the original String with the reversed String, if it is same then print palinDrome
	
	if (txt.equals(rev)) {
		
		System.out.println(txt + " is Palindrome");
		
	}
	else
	{
		System.out.println(txt + " is not Palindrome");
	}
		
	}

}
