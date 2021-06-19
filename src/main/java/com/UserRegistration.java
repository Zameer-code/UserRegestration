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
		

}
