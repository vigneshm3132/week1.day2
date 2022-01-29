package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		
		String name1 = "Testing";
		String name2 = new String("TesTing");
		String name3 = "Testing";
	
		int length = name1.length();
		System.out.println(length);
		
		String lowerCase1 = name2.toLowerCase();
		System.out.println(lowerCase1);
		
		String concat = name1.concat(name2);
		System.out.println(concat);
		
		String text1 = "NewTest";
		String text2 = "newTest";
		
		boolean equals = text1.equals(text2);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = text1.equalsIgnoreCase(text2);
		System.out.println(equalsIgnoreCase);
		
		String txt3 = "NewTest is in process";
		
		boolean contains = txt3.contains("New");
		System.out.println(contains);
	
		char charAt = txt3.charAt(1);
		System.out.println(charAt);
		
		char[] charArray = text2.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
		
			System.out.println(charArray[i]);
		}
		
		String[] split = txt3.split(" ");
		for (int i = 0; i < split.length; i++) {
			
			System.out.println(split[i]);
		}
		
	}
}
