package manalit.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sort {
    public static void main(String args[])throws IOException {
        String sortedDAta;
        String reverseDAta;
        String text;
        ReadFile readFile = new ReadFile();
        text =readFile.read(args[0]);
        SortLib sort = new SortLib();
        if(args.length == 2 && (0 == args[1].compareTo("-r"))){
            reverseDAta = sort.reverseData(text);
            System.out.println(reverseDAta);
        }
        else {
            sortedDAta = sort.sortData(text);
            System.out.println(sortedDAta);
        }
    }
}

