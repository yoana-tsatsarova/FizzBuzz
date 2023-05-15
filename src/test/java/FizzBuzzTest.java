import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void oneShouldReturn1 () {
        assertEquals("1", fizzBuzz.fizzBuzz(1));
    }

    @Test
    void threeShouldReturnFizz () {
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
    }

    @Test
    void fiveShouldReturnBuzz () {
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
    }

    @Test
    void fifteenShouldReturnFizzBuzz () {
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
    }
    @Test
    void seventeenShouldReturnFizzBuzz () {
        assertEquals("17", fizzBuzz.fizzBuzz(17));
    }

}