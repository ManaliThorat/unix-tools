package manalit.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manalit on 1/14/14.
 */
public class ReduceSpaceLibTest {
    @Test
    public void testRemoveSpaces() throws Exception {
        String data = "where r u\r\ni m       here\r\nwhat r u doing\r\nwhat to do";
        String expected = "where r u\r\ni m here\r\nwhat r u doing\r\nwhat to do";
        ReduceSpaceLib reduce = new ReduceSpaceLib();
        String actual =  reduce.removeSpaces(data);
        assertEquals(expected, actual);
    }
}
