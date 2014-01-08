package manalit.unixtools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by manalit on 1/8/14.
 */
public class Head {
    public static void main(String args[])throws IOException {
        String currentLine,text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            while ((currentLine = br.readLine()) != null) {
                text += "\r\n"+currentLine;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        HeadLib findCount = new HeadLib();
        findCount.headCount(text);
    }
}
