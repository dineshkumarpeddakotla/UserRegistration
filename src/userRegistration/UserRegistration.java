package userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    //Created Method To Take Input From User
    private String getFirstName() {
        System.out.println("Enter Your Last Name Of First Letter In Capital ");
        return sc.next();
    }
    /*
         Checking For First Letter Capital And Minimum Of 3 Letters
         The Same Rule Has Been Applied For First Name and Last Name
        */
    //Created Instance Method To Validate First Name
    protected void validateFirstName(){
        Boolean firstName = Pattern.matches("[A-Z][a-z]{2,}",getFirstName());
        System.out.println(nameResult(firstName));
     }
    //Created Method To Take Input From User
    private String getLastName() {
        System.out.println("Enter Your Last Name Of First Letter In Capital ");
        return sc.next();
    }
    //Created Instance Method To Validate Last Name
    protected void validateLastName(){
        Boolean  lastName = Pattern.matches("[A-Z][a-z]{2,}",getLastName());
        System.out.println(nameResult(lastName));
    }
    //Printing Result
    public String nameResult(Boolean result){
        if (Boolean.TRUE.equals(result)) {
            return "Your Entry Is Valid";
        }else
            return "Please Enter Minimum Of Three Characters";

    }
    //Created Method To Take Input From User
    private String getEmail(){
        System.out.println("Enter The Email Address");
        return sc.next();
    }
    //Created Instance Method To Validate Email
    protected void validateEmail(){

         //Creating Boolean Value And checking More Accurate Email Validator Added

        Boolean email = Pattern.matches("^[A-Za-z]+([.+-]?[a-z A-z0-9]+)?@[a-zA-z0-9]{1,6}\\.[a-zA-Z]{2,6},?([.][a-zA-z+,]{2,6})?$",getEmail());
        System.out.println(emailResult(email));
    }
    //Printing Result
    public String emailResult(Boolean result){
        if (Boolean.TRUE.equals(result)) {
            return "Email Is Valid";
        }else
            return "Email Is Invalid";

    }
    //Created Method To Take Input From User
    private String getMobileNumber(){
        System.out.println("Enter The Mobile Number");
        return sc.next();
    }
    //Created Instance Method To Validate Mobile Number
    protected void validateMobileNumber(){
        /*
         Checking For Mobile number
          The Accepted Types Are +00 000000000 ; +00 0000000000 ;+000 0000000000; 0 0000000000 ; 00 0000000000
         */
        Boolean mobileNumber = Pattern.matches("^[0]?([+][0-9]{2,3})?[-][6-9]+[0-9]{9}",getMobileNumber());
        System.out.println(mobileNumberResult(mobileNumber));
    }
    //Printing Result
    public String mobileNumberResult(Boolean result){
        if (Boolean.TRUE.equals(result)) {
            return "Mobile Number Is Valid";
        }else
            return "Mobile Number Is Invalid";

    }
    //Created Method To Take Input From User
    private String getPassword(){
        System.out.println("Enter the Password Minimum Of 8 Charters");
        return sc.next();
    }
    //Created Instance Method To Validate Password
    protected void validatePassword(){
        //Only Checking For Word Type Password With Minimum Of 8 Digits, At Least One Capital Letter,At Least One Number,At Least One Special Character
        Boolean password = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9](?=.*[!@#$%^&*()])).{8,}$",getPassword());
        System.out.println(passwordResult(password));
    }
    //Printing Result
    public String passwordResult(Boolean result){
        if (Boolean.TRUE.equals(result)) {
            return "Password Is Valid";
        }else
            return "Password Is Invalid";

    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
       //Creating A New Object
        UserRegistration user = new UserRegistration();
        //Calling Methods Of First Name, Last Name, Email, Mobile Number, Password
        user.validateFirstName();
        user.validateLastName();
        user.validateEmail();
        user.validateMobileNumber();
        user.validatePassword();
    }


}
