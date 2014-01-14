package manalit.unixtools;

import org.junit.Test;
import  static org.junit.Assert.assertEquals;

/**
 * Created by manalit on 1/13/14.
 */
public class TailLibTest {
    @Test
    public void testTailCount() throws Exception {
        String data = "manali\r\nhow r u\r\nwhere r u\r\ni m here\r\nwhat r u doing\r\n what to do";
        int size = 4;
        String expected = "where r u\r\ni m here\r\nwhat r u doing\r\nwhat to do\r\n";
        TailLib tail = new TailLib();
        String actual =  tail.tailCount(size, data);
        assertEquals(expected, actual);
    }
}
