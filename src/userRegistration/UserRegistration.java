package userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    private String getFirstName() {
        System.out.println("Enter Your Last Name Of First Letter In Capital ");
        return sc.next();
    }
    protected void validateFirstName(){
        Boolean firstName = Pattern.matches("[A-Z][a-z]{2,}",getFirstName());
        System.out.println(nameResult(firstName));
     }


    private String getLastName() {
        System.out.println("Enter Your Last Name Of First Letter In Capital ");
        return sc.next();
    }
    protected void validateLastName(){
        Boolean  lastName = Pattern.matches("[A-Z][a-z]{2,}",getLastName());
        System.out.println(nameResult(lastName));
    }
    public String nameResult(Boolean result){
        if (Boolean.TRUE.equals(result)) {
            return "Your Entry Is Valid";
        }else
            return "Please Enter Minimum Of Three Characters";

    }
    private String getEmail(){
        System.out.println("Enter The Email Address");
        return sc.next();
    }
    protected void validateEmail(){
        Boolean email = Pattern.matches("^[A-Za-z]+([.][a-z A-z]+)?[@][a-zA-z]{2,6}[.][a-zA-Z]{2,6}([.][a-zA-z]{2,6})?$",getEmail());
        System.out.println(emailResult(email));
    }
    public String emailResult(Boolean result){
        if (Boolean.TRUE.equals(result)) {
            return "Email Is Valid";
        }else
            return "Email Is Invalid";

    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        UserRegistration user = new UserRegistration();
        user.validateFirstName();
        user.validateLastName();
        user.validateEmail();

    }


}
