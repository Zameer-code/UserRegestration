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
}
