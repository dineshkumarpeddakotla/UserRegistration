package userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    private String getFirstName() {
        System.out.println("Enter Your First Name Of First Letter In Capital ");
        return sc.next();
    }
    private void validateFirstName(){
        boolean test = Pattern.matches("[A-Z][a-z]{2,}",getFirstName());
        if (test) {
            System.out.println("Your Entry Is valid");
        }else {
            System.out.println("Please Enter Minimum Of Three Characters");
        }

     }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        UserRegistration user = new UserRegistration();
        user.validateFirstName();

    }


}
