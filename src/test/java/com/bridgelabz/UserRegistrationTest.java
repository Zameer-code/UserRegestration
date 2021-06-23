package com.bridgelabz.demo;

/**
* ************************************************************************************************************************** 
* Purpose: Class is To Test the validation of user
* using Regular expression commands 
* @author ZameerAhamad Ron <zameerraone96@gmail.com>
* @version 1.4
* @since 18-06-2020 ********************************************************************************************************
*/

import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTest {
			
	 UserRegistration ur= new UserRegistration();
	    private Assert Assert;


	    @Test
	    //create method fNValidation()
	    public void fNValidation() {
	        Assert.assertTrue(ur.firstName("Jackson"));
	    }

	    @Test
	    //create method lNValidation()
	    public void lNValidation()        {
	        Assert.assertTrue(ur.lastName("Briggs"));
	    }

	    @Test
	    //create method emailValidation()
	    public void emailValidation() {
	        Assert.assertTrue(ur.email("zameerraone96@gmail.com"));
	    }
	    @Test
	    //create method mobileValidation()
	    public void mobileValidation() {
	        Assert.assertTrue(ur.mobile("91 7892496608"));
	    }
	    @Test
	    //create method passwordValidation()
	    public void passwordValidation() {
	        Assert.assertTrue(ur.password("zameerPassword"));
	    }
	    @Test
	    //create method passwordValidationRule2()
	    public void passwordValidationRule2() {
	        Assert.assertTrue(ur.passwordRule2("zameerPassword"));
	    }

	    @Test
	    //create method passwordValidationRule3()
	    public void passwordValidationRule3() {
	        Assert.assertTrue(ur.passwordRule3("zameer6Password"));
	    }

	    @Test
	    //create method passwordValidationRule4()
	    public void passwordValidationRule4() {
	        Assert.assertTrue(ur.passwordRule4("zameer6@Password"));
	    }
	    @Test
   	    public void givenString_whenEntered_shouldReturnSad() {
       	        Assertions.assertEquals("Sad",ur.happySad("Sad"));
    }
}
