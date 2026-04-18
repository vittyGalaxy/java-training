package section20.test;

import section20.src.StringExample;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringExample2Test {
    // @Test
    // public void testIsPalindroma() {
    //     fail("Not yet implemented");
    // }

    @Test
    public void testCountsOccurrences() {
        StringExample se = new StringExample();

        String text = "Today is a beautiful sunny day";

        int occ = 3;
        assertEquals("The number of occurrences is different from the expected one", occ, se.countsOccurrences(text, "a"));
    }
}
