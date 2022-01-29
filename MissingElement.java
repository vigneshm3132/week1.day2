package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
	
	//	String[] names = {"test","best","tes"};
	//	int lengthOfArray = names.length;
	//	System.out.println(names[2]);
	
		int[] arr = {1,2,3,4,7,6,8};  //
		Arrays.sort(arr);
		// System.out.println(lengthOfArray);
				
		for (int i=0; i < arr.length ; i++) {
			if (arr[i] != i + 1) {
				// print the number

				// once printed break the iteration
				System.out.println(" missing element :" + (i + 1));
				break;
			}
			
		}
	}	
}
