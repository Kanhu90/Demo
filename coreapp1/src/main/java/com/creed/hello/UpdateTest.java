package com.creed.hello;

import java.util.logging.Logger;

import org.apache.log4j.*;

public class UpdateTest {
	static{
		BasicConfigurator.configure();
	}
public static void main(String args[]){
		Logger log=Logger.getAnonymousLogger();
		System.out.println("----------------");
		log.info("Main Begin");
		System.out.println("Hai Guys....my first Maven App");
		System.out.println("Hai Guys....my first Maven App");
		System.out.println("Command Line args");
		for (String string : args) {
			System.out.println(string);
		}
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
		}
		log.info("Main End");
		System.out.println("------------------");
}
}
