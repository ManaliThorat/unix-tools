package manalit.unixtools;

import org.junit.Test;
import  static org.junit.Assert.assertEquals;

public class HeadLibTest {
    @Test
    public void testHeadCount() throws Exception {
        String data = "manali\nhow r u\nwhere r u\ni m here\nwhat r u doing\n what to do";
        int size = 4;
        String expected = "manali\r\nhow r u\r\nwhere r u\r\ni m here\r\n";
        HeadLib head = new HeadLib();
        String actual =  head.headCount(size,data);
        assertEquals(expected, actual);
    }
    final String input = "manali\r\nShital\r\nkajal\r\n"+
            "manali\r\nkajal\r\nshabrin\r\nshweta\r\nkavita\r\nsayali\r\nprajakta\r\nsamiksha";
    @Test
    public void testWhenNumberIsLessThanTen() throws Exception {
        String data = "manali\nhow r u\nwhere r u\ni m here\nwhat r u doing\n what to do";
        int size = 2;
        String expected = "manali\r\nhow r u\r\n";
        HeadLib head = new HeadLib();
        String actual =  head.headCount(size,data);
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenNumberOfLinesAreByeDefaultTen() throws Exception {
        String data = "manali\nShital\nkajal\n"+
                "manali\nkajal\nshabrin\nshweta\nkavita\nsayali\nprajakta\nsamiksha";
        int size = 10;
        String expected = "manali\r\nShital\r\nkajal\r\n"+
                "manali\r\nkajal\r\nshabrin\r\nshweta\r\nkavita\r\nsayali\r\nprajakta\r\n";
        HeadLib head = new HeadLib();
        String actual =  head.headCount(size,data);
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenNumberOfLinesMoreThanTen() throws Exception {
        String data = "manali\nShital\nkajal\n"+
                "manali\nkajal\nshabrin\nshweta\nkavita\nsayali\nprajakta\nsamiksha\ntanbir\nshweta";
        int size = 13;
        String expected = "manali\r\nShital\r\nkajal\r\n"+
                "manali\r\nkajal\r\nshabrin\r\nshweta\r\nkavita\r\nsayali\r\nprajakta\r\nsamiksha\r\ntanbir\r\nshweta\r\n";
        HeadLib head = new HeadLib();
        String actual =  head.headCount(size,data);
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenNumberOfLinesWhenTextIsEmpty() throws Exception {
        String data = "";
        int size = 1;
        String expected = "\r\n";
        HeadLib head = new HeadLib();
        String actual =  head.headCount(size,data);
        assertEquals(expected, actual);
    }
}
