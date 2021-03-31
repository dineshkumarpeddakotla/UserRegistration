package userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public static Boolean validateFirstName(String firstName){
        if (!Pattern.matches("[A-Z]{3,}",firstName)){
            System.out.println("Please Enter Minimum Of Three Characters");
        }
        return Pattern.matches("[A-Z]{3,}",firstName);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Name In Capital Letters");
        String firstName = sc.nextLine();

        System.out.println(validateFirstName(firstName));
    }
}
