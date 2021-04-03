import com.userValidation.UserValidation;
import com.userValidation.UserValidationException;
import org.junit.jupiter.api.Assertions;

import org.junit.Test;
public class UserValidationAssertionTest {
    //Happy Test For First Name
    @Test
    public void givenFirstName_WhenProper_returnTrue() throws UserValidationException {
        UserValidation test_FirstName = new UserValidation();
        boolean result = test_FirstName.validateFirstName("Dinesh");
        Assertions.assertTrue(result,"HAPPY");
    }
    //Sad Test For First Name
    @Test
    public void givenFirstName_WhenProper_returnFalse() throws UserValidationException {
        UserValidation test_FirstName = new UserValidation();
        boolean result = test_FirstName.validateFirstName("dinesh");
        Assertions.assertFalse(result,"SAD");
    }
    @Test
    public void givenLastName_WhenProper_returnTrue() throws UserValidationException {
        UserValidation test_LastName = new UserValidation();
        boolean result = test_LastName.validateLastName("Dinesh");
        Assertions.assertTrue(result,"HAPPY");
    }
    //Sad Test For Last Name
    @Test
    public void givenLastName_WhenProper_returnFalse() throws UserValidationException {
        UserValidation test_LastName = new UserValidation();
        boolean result = test_LastName.validateLastName("dinesh");
        Assertions.assertFalse(result,"SAD");
    }


    @Test
    public void givenEmail_WhenProper_returnTrue() throws UserValidationException {
        UserValidation test_Email = new UserValidation();
        boolean result = test_Email.validateEmail("dineshkumar.icon@gmail.com");
        Assertions.assertTrue(result,"HAPPY");
    }
    @Test
    public void givenEmail_WhenProper_returnFalse() throws UserValidationException {
        UserValidation test_Email = new UserValidation();
        boolean result = test_Email.validateEmail("dineshkumar...icon@gmail.com");
        Assertions.assertFalse(result,"SAD");
    }
    @Test
    public void givenMobileNumber_WhenProper_returnTrue() throws UserValidationException {
        UserValidation test_MobileNumber = new UserValidation();
        boolean result = test_MobileNumber.validateMobileNumber("+91-8919105923");
        Assertions.assertTrue(result,"HAPPY");
    }
    @Test
    public void givenMobileNumber_WhenProper_returnFalse() throws UserValidationException {
        UserValidation test_MobileNumber = new UserValidation();
        boolean result = test_MobileNumber.validateMobileNumber("+91--8919105923");
        Assertions.assertFalse(result,"SAD");
    }
    @Test
    public void givenPassword_WhenProper_returnTrue() throws UserValidationException {
        UserValidation test_Password = new UserValidation();
        boolean result = test_Password.validatePassword("Dinnu@Dinnu9");
        Assertions.assertTrue(result,"HAPPY");
    }
    @Test
    public void givenPassword_WhenProper_returnFalse() throws UserValidationException {
        UserValidation test_Password = new UserValidation();
        boolean result = test_Password.validatePassword("DinnuDinnu");
        Assertions.assertFalse(result,"SAD");
    }
    @Test
    public void givenEmptyFirstName_WhenEmpty_throwsException() {
        UserValidation test_FirstName = new UserValidation();
        try {
            boolean result = test_FirstName.validateFirstName("");
            Assertions.assertTrue(result);
        }
        catch (UserValidationException e){
            e.printStackTrace();
        }
    }
    //Sad Test For First Name
    @Test
    public void givenNullFirstName_WhenNull_throwsException() {
        UserValidation test_FirstName = new UserValidation();
        try {
            boolean result = test_FirstName.validateFirstName(null);
            Assertions.assertFalse(result);
        }
        catch (UserValidationException e){
            e.printStackTrace();
        }

    }
    @Test
    public void givenEmptyLastName_WhenEmpty_throwsException() {
        UserValidation test_LastName = new UserValidation();
        try {
            boolean result = test_LastName.validateLastName("");
            Assertions.assertTrue(result);
        }
        catch (UserValidationException e){
            e.printStackTrace();
        }

    }
    //Sad Test For Last Name
    @Test
    public void givenNullLastName_WhenNull_throwsException() {
        UserValidation test_LastName = new UserValidation();
        try {
            boolean result = test_LastName.validateLastName(null);
            Assertions.assertFalse(result);
        }
        catch (UserValidationException e){
            e.printStackTrace();
        }

    }
    @Test
    public void givenEmptyEmail_WhenEmpty_throwsException() {
        UserValidation test_Email = new UserValidation();
        try {

            boolean result = test_Email.validateEmail("");
            Assertions.assertTrue(result);
        }
        catch (UserValidationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenNullEmail_WhenNull_throwsException() {
        UserValidation test_Email = new UserValidation();
        try {
            boolean result = test_Email.validateEmail(null);
            Assertions.assertFalse(result);
        }
        catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmptyMobileNumber_WhenEmpty_throwsException() {
        UserValidation test_MobileNumber = new UserValidation();
        try {
            boolean result = test_MobileNumber.validateMobileNumber("");
            Assertions.assertTrue(result);
        }
        catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenNullMobileNumber_WhenNull_throwsException() {
        UserValidation test_MobileNumber = new UserValidation();
        try {
            boolean result = test_MobileNumber.validateMobileNumber(null);
            Assertions.assertFalse(result);
        }
        catch (UserValidationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmptyPassword_WhenEmpty_throwsException() {
        UserValidation test_Password = new UserValidation();
        try {
            boolean result = test_Password.validatePassword("");
            Assertions.assertTrue(result);
        }
        catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenNullPassword_WhenNull_throwsException() {
        UserValidation test_Password = new UserValidation();
        try {
            boolean result = test_Password.validatePassword(null);
            Assertions.assertFalse(result);
        }
        catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
}
