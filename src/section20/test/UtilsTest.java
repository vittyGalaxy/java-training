package section20.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import section20.src.Utils;

@RunWith(Parameterized.class)
public class UtilsTest {
    private int numberTested;
    private boolean expectedResult;

    public UtilsTest(int numberTested, boolean expectedResult) {
        super();
        this.numberTested = numberTested;
        this.expectedResult = expectedResult;
    }
    
    @Parameterized.Parameters
    public static List<Object[]> dataset() {
        return Arrays.asList(new Object[][] {
            new Object[] {1, false},
            {2, true},
            {3, false},
            {4, true},
            {5, false},
            {6, true},
            {7, false},
            {8, true},
            {9, false},
            {10, true},
        });
    }

    @Test
    public void testEvenNumber() {
        Utils u = new Utils();

        System.out.println("I run the text with the number" + numberTested);
        assertEquals("The number " + numberTested + " it's odd", expectedResult, u.numberEven(numberTested));
    }
}
