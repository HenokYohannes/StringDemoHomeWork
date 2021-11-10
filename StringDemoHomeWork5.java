package com.syntax.com14;

public class StringDemoHomeWork5 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not?

String a="Level";
String b="";
	
	for(int i=a.length()-1; i>=0; i--) {
		
		b+=a.charAt(i);
		}

if (a.equalsIgnoreCase(b)) {
	System.out.println(a+" is palindrome");
}else {
	System.out.println(a+" is not a polindrome");
}

	}

}
