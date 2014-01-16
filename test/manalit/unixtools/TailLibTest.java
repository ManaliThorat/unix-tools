package manalit.unixtools;

import org.junit.Test;
import  static org.junit.Assert.assertEquals;

/**
 * Created by manalit on 1/13/14.
 */
public class TailLibTest {
    @Test
    public void testTailCount() throws Exception {
        String data = "manali\nhow r u\nwhere r u\ni m here\nwhat r u doing\nwhat to do";
        int size = 4;
        String expected = "where r u\r\ni m here\r\nwhat r u doing\r\nwhat to do\r\n";
        TailLib tail = new TailLib();
        String actual =  tail.tailCount(size, data);
        assertEquals(expected, actual);
    }
    @Test
    public void testWhenNumberIsLessThanTen() throws Exception {
        String data = "manali\nhow r u\nwhere r u\ni m here\nwhat r u doing\nwhat to do";
        int size = 2;
        String expected = "what r u doing\r\nwhat to do\r\n";
        TailLib tail = new TailLib();
        String actual =  tail.tailCount(size,data);
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenNumberOfLinesAreByeDefaultTen() throws Exception {
        String data = "manali\nShital\nkajal\n"+
                "manali\nkajal\nshabrin\nshweta\nkavita\nsayali\nprajakta\nsamiksha";
        int size = 10;
        String expected = "Shital\r\nkajal\r\n"+
                "manali\r\nkajal\r\nshabrin\r\nshweta\r\nkavita\r\nsayali\r\nprajakta\r\nsamiksha\r\n";
        TailLib tail = new TailLib();
        String actual =  tail.tailCount(size,data);
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenNumberOfLinesMoreThanTen() throws Exception {
        String data = "manali\nShital\nkajal\n"+
                "manali\nkajal\nshabrin\nshweta\nkavita\nsayali\nprajakta\nsamiksha\ntanbir\nshweta";
        int size = 13;
        String expected = "manali\r\nShital\r\nkajal\r\n"+
                "manali\r\nkajal\r\nshabrin\r\nshweta\r\nkavita\r\nsayali\r\nprajakta\r\nsamiksha\r\ntanbir\r\nshweta\r\n";
        TailLib tail = new TailLib();
        String actual = tail.tailCount(size, data);
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenNumberOfLinesWhenTextIsEmpty() throws Exception {
        String data = "";
        int size = 1;
        String expected = "\r\n";
        TailLib tail = new TailLib();
        String actual =  tail.tailCount(size,data);
        assertEquals(expected, actual);
    }
}
