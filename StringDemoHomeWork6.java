package com.syntax.com14;

public class StringDemoHomeWork6 {

	public static void main(String[] args) {
		// How would you swap  2 strings without a temporary variable?

	
	String a= "Go go go !";
	
	String b="come come come !";
	
	System.out.println(a);
	System.out.println(b);
	
	System.out.println("-----------------");
	a=a+b;
	b=a.replace(b,"");
	
    a=a.replace(b, "");
	
	System.out.println(a);
	System.out.println(b);
	
	}

}
