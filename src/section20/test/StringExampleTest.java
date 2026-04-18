package section20.test;

import static org.junit.Assert.*;

import org.junit.Test;

import section20.src.StringExample;

public class StringExampleTest {
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
