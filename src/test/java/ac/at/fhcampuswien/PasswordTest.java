package ac.at.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PasswordTest {
    @Test
    @DisplayName("has the password the correct length")
    public void lengthOfPasswordTest(){
        Password p = new Password("12345678");
        boolean actual = p.lengthOfPassword();
        assertTrue(actual);
    }
    @Test
    @DisplayName("does it have upper- and lowercase")
    public void passwordWithUpAndLowTest(){
        Password p = new Password();
        boolean actual = p.passwordWithUpAndLow();
        assertTrue(actual);
    }


}
