package manalit.unixtools;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by manalit on 1/8/14.
 */
public class CountTest {
    @Test
    public void testCharCount() throws Exception {
        Count count = new Count();
        int expected = 7;
        int actual = count.charCount("manali");
        assertEquals(expected,actual);
    }

    @Test
    public void testWordCount() throws Exception {
        Count count = new Count();
        int expected = 1;
        int actual = count.lineCount("manali");
        assertEquals(expected,actual);
    }

    @Test
    public void testLineCount() throws Exception {
        Count count = new Count();
        int expected = 1;
        int actual = count.wordCount("manali");
        assertEquals(expected,actual);
    }
}
