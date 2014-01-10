package manalit.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReduceSpace {
    public static void main(String args[])throws IOException {
        String sortedDAta[];
        String currentLine,text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            while ((currentLine = br.readLine()) != null) {
                text += currentLine+"\r\n";
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        ReduceSpaceLib findCount = new ReduceSpaceLib();
        sortedDAta = findCount.removeSpaces(text);
        for (int i = 0; i < sortedDAta.length; i++) {
            System.out.println(sortedDAta[i]);
        }
    }
}


