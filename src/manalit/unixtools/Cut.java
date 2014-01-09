package manalit.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by manalit on 1/9/14.
 */
public class Cut {
    public static void main(String args[])throws IOException {
        String currentLine,text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            while ((currentLine = br.readLine()) != null) {
                text += currentLine+"\r\n";
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        CutLib findCount = new CutLib();
        findCount.cutCount(2,text);
    }

}
