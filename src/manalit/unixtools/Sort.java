package manalit.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by manalit on 1/9/14.
 */
public class Sort {
    public static void main(String args[])throws IOException {
        String sortedDAta[];
        String reverseDAta[];
        String currentLine,text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            while ((currentLine = br.readLine()) != null) {
                text += currentLine+"\r\n";
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        SortLib findCount = new SortLib();
        sortedDAta = findCount.sortData(text);
        for (String line : sortedDAta) {
            System.out.println(line);
        }
        reverseDAta = findCount.reverseData(text);
        for (String s : reverseDAta) {
            System.out.println(s);
        }
    }
}

