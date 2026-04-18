package section20.test;

import static org.junit.Assert.*;

import org.junit.Test;

import section20.src.StringExample;

public class StringExampleTest {
    @Test
    public void testIsPalindroma() {
        StringExample se = new StringExample();
        assertTrue("The variable is true", se.isPalindroma("anna"));
        assertTrue("The variable is false", se.isPalindroma("maria"));
    }

    @Test
    public void testCountsOccurrences() {
        StringExample se = new StringExample();

        String text = "Today is a beautiful sunny day";

        int occ = 3;
        assertEquals("The number of occurrences is different from the expected one", occ, se.countsOccurrences(text, "a"));
        assertNotNull(text);
        assertNull("The variable is not null", se);
    }
}
