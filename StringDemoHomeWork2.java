package com.syntax.com14;

public class StringDemoHomeWork2 {

	public static void main(String[] args) {
		/*Create a String that should be combination of letters, 
		 * numbers and special characters. Find out how many alpha 
		 * characters are there in the String.
		 * 
		 *  
		 */

		
	String str="abcdemxnrnnntnaksjjskf12345%&*";
	int numbers=0;
for(int i=0;i<str.length();i++) {
	if(Character.isLetter(str.charAt(i))) {
		numbers++;
	}
}
	System.out.println(numbers);
	}

}
