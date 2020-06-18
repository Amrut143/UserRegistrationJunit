package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author : Amrut
 * Purpose : This class is to validate the user
 */
public class UserRegistration {

    /*function to validate first name*/
    public boolean validateFirstName(String firstName) {
        Pattern pattern= Pattern.compile("^[A-Z][a-zA-Z]{2,}");
        Matcher matcher=pattern.matcher(firstName);
        return matcher.matches();
    }
}
