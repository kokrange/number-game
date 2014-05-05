package game;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpecialNumberTest {
    @Test
    public void word() {
        String word = "Fizz";
        int base = 3;
        int number = 3 * 465;
        SpecialNumber specialNumber = new SpecialNumber(base, word);

        assertEquals(word, specialNumber.word(number));
    }
}
