package com.syntax.com14;

public class StringDemo3 {

	public static void main(String[] args) {
		String str="ahahahahthPHPTi1257587&$&&ssyso##%";
	
	//System.out.println(str.replaceAll("[012345]", "*"str,str));
		System.out.println(str.replaceAll("[0-9]", "*"));
		System.out.println(str.replaceAll("[a-z]", "*"));
		System.out.println(str.replaceAll("[A-Z]", "*"));
		System.out.println(str.replaceAll("[A-Za-z]", "*"));
		System.out.println(str.replaceAll("[A-Z]", "*").replaceAll("[a-z]","*")); // the same
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "*"));
		System.out.println(str.replaceAll("[$%]", "*"));
		System.out.println(str.replaceAll("[0-9]", ""));
	
	}

}
