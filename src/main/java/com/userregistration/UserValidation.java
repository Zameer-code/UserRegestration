package com.userregistration;

/**
* ************************************************************************************************************************** 
* Purpose: Interface to provida validation Insertion to the regestration class..
* using Regular expression commands 
* @author ZameerAhamad Ron <zameerraone96@gmail.com>
* @version 1.4
* @since 18-06-2020 ********************************************************************************************************
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface UserValidation {
	

	public abstract void userValidation(String var);

}
