package manalit.unixtools;

import org.junit.Test;
import  static org.junit.Assert.assertEquals;

public class HeadLibTest {
    @Test
    public void testHeadCount() throws Exception {
        String data = "manali\r\nhow r u\r\nwhere r u\r\ni m here\r\nwhat r u doing\r\n what to do";
        int size = 4;
        String expected = "manali\r\nhow r u\r\nwhere r u\r\ni m here\r\n";
        HeadLib head = new HeadLib();
        String actual =  head.headCount(size,data);
        System.out.println(expected);
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}
