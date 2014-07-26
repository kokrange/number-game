package game;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

public class StudentTest {
    private List specialNumbers;

    private final static int NUMBER_ONE = 3;
    private final static int NUMBER_TWO = 5;
    private final static int NUMBER_THREE = 7;

    private final static String WORD_ONE = "Fizz";
    private final static String WORD_TWO = "Buzz";
    private final static String WORD_THREE = "Whizz";

    @Before
    public void setUp() {
        specialNumbers = Arrays.asList(
                new SpecialNumber(NUMBER_ONE, WORD_ONE),
                new SpecialNumber(NUMBER_TWO, WORD_TWO),
                new SpecialNumber(NUMBER_THREE, WORD_THREE)
        );
    }

    @Test
    public void only_one_student() {
        assertEquals("1", new Student(specialNumbers, 1).numberOff());
    }


    @Test
    public void divisible_by_one_special_number() {
        assertEquals(WORD_ONE, new Student(specialNumbers, NUMBER_ONE).numberOff());
    }

    @Test
    public void divisible_by_two_special_numbers() {
        assertEquals(WORD_ONE + WORD_TWO, new Student(specialNumbers, NUMBER_ONE * NUMBER_TWO).numberOff());

    }

    @Test
    public void divisible_by_all_special_numbers() {
        assertEquals(WORD_ONE + WORD_TWO + WORD_THREE, new Student(specialNumbers, NUMBER_ONE * NUMBER_TWO * NUMBER_THREE).numberOff());
    }

    @Test
    public void contains_first_speicial_number() {
        assertEquals(WORD_ONE, new Student(specialNumbers, containFirstNumber()).numberOff());
    }

    private Integer containFirstNumber() {
        return Integer.valueOf(String.valueOf(NUMBER_ONE) + String.valueOf(NUMBER_TWO));
    }

}
