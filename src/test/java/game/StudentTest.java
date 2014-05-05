package game;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

public class StudentTest {
    private List specialNumbers;

    @Before
    public void setUp() {
        specialNumbers = Arrays.asList(new SpecialNumber(3, "Fizz"), new SpecialNumber(5, "Buzz"), new SpecialNumber(7, "Whizz"));
    }

    @Test
    public void only_one_student() {
        assertEquals("1", new Student(specialNumbers, 1).numberOff());
    }


    @Test
    public void divisible_by_one_special_number() {
        assertEquals("Fizz", new Student(specialNumbers, 3).numberOff());
    }

    @Test
    public void divisible_by_two_special_numbers() {
        assertEquals("FizzBuzz", new Student(specialNumbers, 3 * 5).numberOff());

    }

    @Test
    public void divisible_by_all_special_numbers() {
        assertEquals("FizzBuzzWhizz", new Student(specialNumbers, 3 * 5 * 7).numberOff());
    }

    @Test
    public void contains_first_speicial_number() {
        assertEquals("Fizz", new Student(specialNumbers, 35).numberOff());
    }

}
