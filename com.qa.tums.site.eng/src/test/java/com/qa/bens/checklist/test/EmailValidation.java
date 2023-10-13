package com.qa.bens.checklist.test;

import java.util.Scanner;

public class EmailValidation {
	
	public static void main(String[] args) {
		
		
	// ^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$ - for Email
	// ^[A-Z]+[a-z]{5,10}	
	//	^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$ - DOB
		
//		[0-9]{4}[@][g][m][a][i][l][.][c][o][m]
		
		for (int i = 0; i <=100; i++) {
			Scanner sc = new Scanner(System.in);
		     System.out.println("Enter your Email ID: ");
		     String dob = sc.next();
		     String regex = "^[a-z]{3,10}[0-9]{4}[@][g][m][a][i][l][.][c][o][m]$";
		     //Matching the given phone number with regular expression
		     boolean result = dob.matches(regex);
		     if(result) {
		        System.out.println("Given E-mail is valid");
		     } else {
		        System.out.println("Given E-mail is not valid");
		     }
		}
  }

}
