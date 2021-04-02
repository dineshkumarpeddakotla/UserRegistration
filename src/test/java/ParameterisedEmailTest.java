import com.userValidation.UserValidation;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterisedEmailTest{

    String email;
        boolean email_result_expected;


        public ParameterisedEmailTest(String email, boolean email_result_expected){

            this.email = email;
            this.email_result_expected = email_result_expected;
        }


        @Parameterized.Parameters
        public static Collection data() {
            return Arrays.asList(new Object[][]{
                    {"abc@yahoo.com", true}, {"abc-100@yahoo.com", true}, {"abc.100@yahoo.com", true}, {"abc111@abc.com", true},
                    {"abc-100@abc.net", true}, {"abc.100@abc.com.au", true}, {"abc@1.com", true}, {"abc@gmail.com.com", true},
                    {"abc+100@gmail.com", true},

                    {"abc", false}, {"abc@.com.my", false}, {"abc123@gmail.a", false}, {"abc123@.com", false}, {"abc123@.com.com", false},
                    {".abc@abc.com", false}, {"abc()*@gmail.com", false}, {"abc@%*.com", false}, {"abc..2002@gmail.com", false},
                    {"abc.@gmail.com", false}, {"abc@abc@gmail.com", false}, {"abc@gmail.com.1a", false}, {"abc@gmail.com.aa.au ", false}});
        }



    @Test
        public void givenEmail_WhenProper_returnDesiredValue(){
            UserValidation test_email = new UserValidation();
            boolean email_result = test_email.validateEmail(this.email);
            Assertions.assertEquals(this.email_result_expected, email_result);
        }

}
