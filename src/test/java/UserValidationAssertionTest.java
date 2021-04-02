import com.userValidation.UserValidation;
import org.junit.jupiter.api.Assertions;

import org.junit.Test;
public class UserValidationAssertionTest {
    //Happy Test For First Name
    @Test
    public void givenFirstName_WhenProper_returnTrue(){
        UserValidation test_FirstName = new UserValidation();
        boolean result = test_FirstName.validateFirstName("Dinesh");
        Assertions.assertTrue(result,"HAPPY");
    }
    //Sad Test For First Name
    @Test
    public void givenFirstName_WhenProper_returnFalse(){
        UserValidation test_FirstName = new UserValidation();
        boolean result = test_FirstName.validateFirstName("dinesh");
        Assertions.assertFalse(result,"SAD");
    }
    @Test
    public void givenLastName_WhenProper_returnTrue(){
        UserValidation test_LastName = new UserValidation();
        boolean result = test_LastName.validateLastName("Dinesh");
        Assertions.assertTrue(result,"HAPPY");
    }
    //Sad Test For Last Name
    @Test
    public void givenLastName_WhenProper_returnFalse(){
        UserValidation test_LastName = new UserValidation();
        boolean result = test_LastName.validateLastName("dinesh");
        Assertions.assertFalse(result,"SAD");
    }


    @Test
    public void givenEmail_WhenProper_returnTrue(){
        UserValidation test_Email = new UserValidation();
        boolean result = test_Email.validateEmail("dineshkumar.icon@gmail.com");
        Assertions.assertTrue(result,"HAPPY");
    }
    @Test
    public void givenEmail_WhenProper_returnFalse(){
        UserValidation test_Email = new UserValidation();
        boolean result = test_Email.validateEmail("dineshkumar...icon@gmail.com");
        Assertions.assertFalse(result,"SAD");
    }
    @Test
    public void givenMobileNumber_WhenProper_returnTrue(){
        UserValidation test_MobileNumber = new UserValidation();
        boolean result = test_MobileNumber.validateMobileNumber("+91-8919105923");
        Assertions.assertTrue(result,"HAPPY");
    }
    @Test
    public void givenMobileNumber_WhenProper_returnFalse(){
        UserValidation test_MobileNumber = new UserValidation();
        boolean result = test_MobileNumber.validateMobileNumber("+91--8919105923");
        Assertions.assertFalse(result,"SAD");
    }
    @Test
    public void givenPassword_WhenProper_returnTrue(){
        UserValidation test_Password = new UserValidation();
        boolean result = test_Password.validatePassword("Dinnu@Dinnu9");
        Assertions.assertTrue(result,"HAPPY");
    }
    @Test
    public void givenPassword_WhenProper_returnFalse(){
        UserValidation test_Password = new UserValidation();
        boolean result = test_Password.validatePassword("DinnuDinnu");
        Assertions.assertFalse(result,"SAD");
    }

}
