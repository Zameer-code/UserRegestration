package com.bridgelabz.demo;

/**
 * **************************************************************************** 
 * Purpose: Class is To create User Registration using Regular expression commands 
 * @author ZameerAhamad Ron <zameerraone96@gmail.com>
 * @version 1.4
 * @since 18-06-2020 ****************************************************************************
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.Pattern;

public class UserRegistration {

	/*
	 * UC1 - First name starts with Cap and has minimum 3 characters
	 * 
	 * @Description- checks the First Name for registration a name is valid or not
	 */
	public boolean firstName(String fN) {
		return (Pattern.matches("^[A-Z]{1}[a-z]{3,}$", fN) == true);
	}

	/*
	 * UC2 -Last Name Starts with cap and has minimum 3 characters
	 * 
	 * @description- Check last name for registration a name is valid or not
	 * 
	 * @return string:- return the last name
	 */
	public boolean lastName(String lN) {
		return (Pattern.matches("^[A-Z]{1}[a-z]{3,}$", lN) == true);
	}

	/*
	 * UC 3 - enter a valid email
	 * 
	 * @description-checking email is in correct form or not
	 * 
	 * @return string:- return the emil id for validation E.g. abc.xyz@bl.co.in -
	 * Email has 3 mandatory parts (abc, bl & co)
	 */
	public boolean email(String emailId) {
		return (Pattern.matches("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", emailId) == true);
	}

	/*
	 * UC4 - Mobile Format
	 * 
	 * @description: class to checking user Phone Number by regular expression check
	 * Phone Number is valid with country code using regular expression
	 */
	public boolean mobile(String mobileNum) {
		return (Pattern.matches("(0|91)?\\s{1}[6-9][0-9]{9}", mobileNum) == true);
	}

	/*
	 * UC 5 Password (Rule-1)
	 * 
	 * @description: checking Password by regular expression check Password minimum
	 * 8 Character using regular expression
	 */
	public boolean password(String pass) {
		return (Pattern.matches("[A-Z0-9a-z$%&*@!#]{8,}", pass) == true);
	}

	/*
	 * UC 6 Password (All rule-1 must be passed)
	 * 
	 * @description: checking Password by regular expression check Password minimum
	 * 8 Character using regular expression Should have at least 1 Upper Case
	 */
	public boolean passwordRule2(String pass) {
		return ((Pattern.matches("[A-Z0-9a-z$%&*@!#]{8,}", pass) && Pattern.matches(".*[A-Z].*", pass)) == true);
	}

	/*
	 * UC 7 Password (All rule must be passed)
	 * 
	 * @description: checking Password by regular expression check Password minimum
	 * 8 Character using regular expression Should have at least 1 Upper Case Should
	 * have at least 1 numeric number
	 */
	public boolean passwordRule3(String pass) {
		return ((Pattern.matches("[A-Z0-9a-z$%&*@!#]{8,}", pass) && Pattern.matches(".*[A-Z].*", pass)
				&& Pattern.matches(".*[0-9].*", pass)) == true);
	}

	/*
	 * UC 8 Password (All rule must be passed)
	 * 
	 * @description: checking Password by regular expression check Password minimum
	 * 8 Character using regular expression Should have at least 1 Upper Case Should
	 * have at least 1 numeric number 1 Special Character
	 */
	public boolean passwordRule4(String pass) {
		return ((Pattern.matches("[A-Z0-9a-z$%&*@!#]{8,}", pass) && Pattern.matches(".*[A-Z].*", pass)
				&& Pattern.matches(".*[0-9].*", pass) && Pattern.matches(".*[\\W]{1}.*", pass)) == true);
	}
		
		/**
		 * UC-10 to write J unit test for happy and sad test case
		 * @param word
		 * @return
		 */
	 public String happySad(String word) {
	        if (word.contains("Negative"))
	            return "Negative";
	        else
	            return "Positive";
	    }

}
