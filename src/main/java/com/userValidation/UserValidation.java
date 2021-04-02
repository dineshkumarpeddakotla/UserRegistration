package com.userValidation;

import java.util.regex.Pattern;

public class UserValidation {
    private static final String NAME_PATTERN ="[A-Z][a-z]{2,}";
    private static final String EMAIL_PATTERN="^[A-Za-z]+([.+-]?[a-z A-z0-9]+)?@[a-zA-z0-9]{1,6}\\.[a-zA-Z]{2,6},?([.][a-zA-z+,]{2,6})?$";
    private static final String MOBILENUMBER_PATTERN="^[0]?([+][0-9]{2,3})?[-][6-9]+[0-9]{9}";
    private static final String PASSWORD_PATTERN ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()]).{8,}$";
    public Boolean validateFirstName(String firstName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }

    public Boolean validateLastName(String lastName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
    /*
     * Creating Boolean value and checking only for "abc.xyz@pqrs.lm" type,
     * later will check for more accurate email
     * more accurate email validator added
     */
    public Boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();

    }
    /*
         Checking For Mobile number
          The Accepted Types Are +00 000000000 ; +00 0000000000 ;+000 0000000000; 0 0000000000 ; 00 0000000000
         */
    public Boolean validateMobileNumber(String mobileNumber){
        Pattern pattern = Pattern.compile(MOBILENUMBER_PATTERN);
        return pattern.matcher(mobileNumber).matches();
    }
    //Only Checking For Word Type Password With Minimum Of 8 Digits, At Least One Capital Letter,At Least One Number,At Least One Special Character
    public Boolean validatePassword(String password){
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }

}
