package com.qa.bens.checklist.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleRegularExpressionsTest {
	
//	A-Z characters are permitted
//	a-z characters are permitted
//	0-9 digits are permitted
//	Underscore(_), dash(-), and dot(.) are permitted
//	Other characters are not permitted
	
//	^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$
	
//First Name Should be in Caps


	
//	 private static final String regex = "[A-Z]+[a-z]{5,10}+\s+[A-Z]+[a-z]{5,10}$";
	 private static final String regex = "^[0-9]{6}$";
	 
	   public static void main(String args[]) {
	       //adding  emails to an array list
	       List<String> names = new ArrayList<String>();
	       
	       Scanner input = new Scanner(System.in);
	       
	       for (int i = 0; i < 10; i++) {
	    	   Pattern pattern = Pattern.compile(regex);
	    	   System.out.println("Enter the value");
	    	   String nextLine = input.nextLine();
	    	   Matcher matcher = pattern.matcher(nextLine);
	           System.out.println("Email " + nextLine + " is " + (matcher.matches() ? "valid" : "invalid"));
			
		}
	       
	       
	       
	       
	       
	       
//	       names.add("Sujaisekar");
//	       names.add("SUjais Sujais");
//	       names.add("Sujais sujais");
//	       names.add("sujais Sujais");
//	       names.add("Sujais Sujais");
	       
	       
	       names.add("123456");
	       names.add("12345");
	       names.add("1234567");
	       
	       
//	       // valid email addresses
//	       emails.add("sUjaiSekar");
//	       emails.add("alice.bob@example.co.in");
//	       emails.add("alice1@example.me.org");
//	       emails.add("alice_bob@example.com");
//	       emails.add("alice-bob@example.com");
//	       
//	       //invalid email addresses
//	       emails.add("@example.com");
//	       emails.add("alice&example.com");
//	       emails.add("alice#@example.me.org");
//	       
//	       //System generated Email ID
//	       emails.add("cecelia.satterfield68@hotmail.com");
//	       emails.add("prudence42@gmail.com");
//	       emails.add("ali_bode42@gmail.com");
//	       emails.add("lon_lowe65@gmail.com");
//	       emails.add("eino75@yahoo.com");
	       
	       
	       //initialize the Pattern object
//	       Pattern pattern = Pattern.compile(regex);
	       //searching for occurrences of regex
//	       for (String value : names) {
//	           Matcher matcher = pattern.matcher(value);
//	           System.out.println("Email " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
//	       }
	   }

}
