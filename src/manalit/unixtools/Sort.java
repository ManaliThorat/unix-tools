package manalit.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
        if(args.length == 2 && (0 == args[1].compareTo("-r"))){
            reverseDAta = findCount.reverseData(text);
            for (String s : reverseDAta) {
                System.out.println(s);
            }
        }
        else {
            sortedDAta = findCount.sortData(text);
            for (String line : sortedDAta) {
                System.out.println(line);
            }
        }
    }
}

