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
	 * UC4 - Mobile Format
	 * 
	 * @description: class to checking user Phone Number by regular expression check
	 * Phone Number is valid with country code using regular expression
	 */
	public boolean mobile(String mobileNum) {
		return (Pattern.matches("(0|91)?\\s{1}[6-9][0-9]{9}", mobileNum) == true);
	}

}
