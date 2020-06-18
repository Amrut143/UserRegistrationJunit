package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author : Amrut
 * Purpose : This class is to validate the user
 */
public class UserRegistration {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-zA-Z]{2,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-zA-Z]{2,}$";
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([-_+.][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{3})*$";
    private static final String MOBILE_NUM_PATTERN = "^[0-9]{2}[ ]?[0-9]{10}$";
    private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z]?)(?=.*[A-Z])(?=.*[@#$%]){1}.{8,})$";

    /*function to validate first name*/
    public boolean validateFirstName(String firstName) {
        Pattern pattern= Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    /*function to validate last name*/
    public boolean validateLastName(String lastName) {
        Pattern pattern= Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    /*function to validate email address*/
    public boolean validateEmail(String email) {
        Pattern pattern= Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    /*function to validate mobile number*/
    public boolean validateMobileNumber(String mobileNumber) {
        Pattern pattern= Pattern.compile(MOBILE_NUM_PATTERN);
        return pattern.matcher(mobileNumber).matches();
    }

    /*function to validate password*/
    public boolean validatePassword(String password) {
        Pattern pattern= Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
