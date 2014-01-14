package manalit.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manalit on 1/14/14.
 */
public class UniqLibTest {
    @Test
    public void testGetUniqueLines() throws Exception {
        String text = "Ram\nSam\nSam\nTam\nTum";
        String expected = "Ram\nSam\nTum\n";

        UniqLib uniq = new UniqLib();
        StringBuilder result = uniq.uniqData(text);
        String actual = result.toString();
        assertEquals(expected,actual);
    }
}
