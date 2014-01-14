package manalit.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manalit on 1/14/14.
 */
public class CutLibTest {
    @Test
    public void testCutCount() throws Exception {
        String text = "manali T\nShital M";
        String expected = "manali\r\nShital\r\n";
        CutLib uniq = new CutLib();
        StringBuilder result = uniq.cutCount(1," ",text);
        String actual = result.toString();
        assertEquals(expected,actual);
    }
}
