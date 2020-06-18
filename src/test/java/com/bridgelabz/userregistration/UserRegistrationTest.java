package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
    /*variables*/
    private String arguement;
    private boolean expectedResult;

    /*constructor*/
    public UserRegistrationTest(String arguement, boolean expectedResult) {
        this.arguement = arguement;
        this.expectedResult = expectedResult;
    }

    /* TestCase for validating first name*/
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Amrut");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenLessThan_ThreeChar_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Am");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("am@rut");
        Assert.assertFalse(result);
    }

    /*TestCase for validating last name*/
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Panda");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Pa");
        Assert.assertFalse(result);
    }
    /*function for validating email address*/
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Boolean result = userRegistration.validateEmail(this.arguement);
        Assert.assertEquals(this.expectedResult, result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"abc@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc.100@abc.com.au", true},
                {"abc+100@gmail.com", true},
                {"abc.abc@gmail.co.in", true},
                {"abc100@gmail.com", true},
                {"abc@1.com", true},
                {"abc+100", false},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@g.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@a.com.21a", false},
                {"abc@g.cim.au.au", false}};

        return Arrays.asList(data);
    }
    /*TestCase for validating mobile number*/
    @Test
    public void givenPhoneNumber_WhenProper_TenDigitNumberWithTwoDigitCountryCode_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateMobileNumber("919589347869"));
    }

    @Test
    public void givenPhoneNumber_WhenProper_OneSpaceAfterCountryCode_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateMobileNumber("91 9921370869"));
    }

    @Test
    public void givenPhoneNumber_WhenProper_CountryCodeTwoDigitNumber_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateMobileNumber("91 9937548869"));
    }

    @Test
    public void givenPhoneNumber_WhenImproper_CountryCodeThreeDigitNumber_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateMobileNumber("919 9945547869"));
    }

    @Test
    public void givenPhoneNumber_WhenProper_OnlyNumericValue_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertTrue(userRegistration.validateMobileNumber("919851747869"));
    }

    @Test
    public void givenPhoneNumber_WhenImproper_AlphaNumericValue_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateMobileNumber("961275t74f89"));
    }

    @Test
    public void givenPhoneNumber_WhenImproper_SpecialSymbol_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateMobileNumber("97876578#98"));
    }

    @Test
    public void givenPhoneNumber_WhenImproper_NoSpaceInPhoneNumber_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertFalse(userRegistration.validateMobileNumber("98756476 78"));
    }
}
