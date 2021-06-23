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
			
    private UserRegistration ur;
    private String email;
    private boolean expRes;

    @Before
    public void initialize() {
        ur = new UserRegistration();
    }

    public UserRegistrationTest(String email, boolean expRes) {
        this.email=email;
        this.expRes=expRes;
    }
    @Parameterized.Parameters
    public static Collection inputEmails(){
        return Arrays.asList(new Object[][] { {"abc@gmail.com",true},{"abc-100@gmail.com",true},{"abc.100@gmail.com",true},
                {"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@gmail.com.au",true},{"abc@1.com",true},
                {"abc@gmail.com.com",true},{"abc+100@gmail.com",true},{"abc",false},
                {"abc@.com.my",false},{"abc123@.com",false},{"abc123@.com.com",false},
                {".abc@abc.com",false},{"abc()*@abc.com",false},{".abc@!#$.com",false},{"abc..2002@abc.com",false},
                {"abc.@abc.com",false},{"abc@abc@abc.com",false},{".abc@abc.com",false},{"abc@abc.com.1a",false},
                {"abc@abc.com.aa.au",false}});
    }

    @Test
    public void parameterizedWayOfEmailValidation() {
        System.out.println("Parameterized Email is: "+ email);
        Assert.assertEquals(expRes,ur.email(email));
    }
}
