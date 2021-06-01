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
        Password p = new Password("SdsdasdsD");
        boolean actual = p.passwordWithUpAndLow();
        assertTrue(actual);
    }
    @Test
    @DisplayName("does password contains numbers")
    public void passwordWithNumbersTest(){
        Password p = new Password("345435435");
        boolean actual = p.passwordWithNumbers();
        assertTrue(actual);
    }
    @Test
    @DisplayName("does password contains at least one symbol ()#$?!%/@")
    public void passwordWithSymbolTest(){
        Password p = new Password("#ensdk");
        boolean actual = p.passwordWithSymbol();
        assertTrue(actual);
    }


}
