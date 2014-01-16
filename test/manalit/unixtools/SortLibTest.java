package manalit.unixtools;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manalit on 1/14/14.
 */
public class SortLibTest {
    @Test
    public void testSortData() throws Exception {
        String text = "Ram\nSam\nTum";
        String expected = "Ram\r\nSam\r\nTum\r\n";

        SortLib uniq = new SortLib();
        String result = uniq.sortData(text);
        String actual = result.toString();
        assertEquals(expected,actual);
    }

    @Test
    public void testReverseData() throws Exception {
        String text = "Ram\nSam\nTum";
        String expected = "Tum\r\nSam\r\nRam\r\n";

        SortLib uniq = new SortLib();
        String result = uniq.reverseData(text);
        String actual = result.toString();
        assertEquals(expected,actual);
    }
    @Test
    public void testSortForEmptyString() throws Exception {
        String expected = "\r\n";

        SortLib sort = new SortLib();
        String result = sort.sortData("");
        assertEquals(expected, result);
    }

    @Test
    public void testReverseSortForEmptyString() throws Exception {
        String expected = "";

        SortLib sort = new SortLib();
        String result = sort.reverseData("");
        assertEquals(expected, result);
    }
}
