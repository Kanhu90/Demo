package com.creed.hello;

public class Test {
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
