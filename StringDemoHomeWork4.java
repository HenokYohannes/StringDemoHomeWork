package com.syntax.com14;

public class StringDemoHomeWork4 {

	public static void main(String[] args) {
		// How would you reverse a String character by character?

	
	String str= "Java is fun!";
	String reverse=" ";
	
	for(int i=str.length()-1; i>=0;i--) {
		
		reverse+=str.charAt(i);
	}
	System.out.println(str);
	System.out.println(reverse);
	System.out.println("--------------");
	//How would you reverse a String word by word?
	
	String str2= "Java is smart!";
	
	String reverse1="";
	String[] arr=str2.split(" ");
	
	
	for (int i=arr.length-1;i>=0;i--) {
		reverse1+=arr[i]+ " ";
	}
	System.out.println("Java is smart!");
	System.out.print(reverse1);
	
	}

}
