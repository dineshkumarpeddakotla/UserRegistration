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
            return "Your Entry Is valid";
        }else
            return "Please Enter Minimum Of Three Characters";

    }


    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        UserRegistration user = new UserRegistration();
        user.validateFirstName();
        user.validateLastName();

    }


}
