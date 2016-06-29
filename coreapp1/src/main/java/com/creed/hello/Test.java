package com.creed.hello;

public class Test {
	static {
		System.out.println("Test-S.B");
	}
	{
		System.out.println("Test-I.I.B");	
	}
 public static void main(String args[]) {
	 System.out.println("-----------------");
	 System.out.println("Hello Guys");
	 System.out.println("Command Line Args");
	 for (String string : args) {
		System.out.println(string);
	}
	System.out.println("-------------------");
}
}
