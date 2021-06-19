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
}
