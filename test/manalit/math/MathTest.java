package manalit.math;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by manalit on 1/8/14.
 */
public class MathTest {
    @Test
    public void testAdd() throws Exception {
        Math addition = new Math();
        int expected = 7;

        int actual = addition.add(3, 4);

        assertEquals(expected,actual);
    }




}
