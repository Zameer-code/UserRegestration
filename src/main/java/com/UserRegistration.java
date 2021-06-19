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
