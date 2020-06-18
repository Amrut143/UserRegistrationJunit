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
}
