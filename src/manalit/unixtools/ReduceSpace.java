package manalit.unixtools;

import java.io.*;


public class ReduceSpace {
    public static void main(String args[])throws IOException {
        String sortedDAta[];
        String text;
        ReadFile readFile = new ReadFile();
        text =readFile.read(args[0]);
        ReduceSpaceLib reduceSpace = new ReduceSpaceLib();
        sortedDAta = reduceSpace.removeSpaces(text);
        for (int i = 0; i < sortedDAta.length; i++) {
            System.out.println(sortedDAta[i]);
        }
        File file = new File(args[0]);
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < sortedDAta.length; i++) {
            bw.write(String.valueOf(sortedDAta[i]+"\n"));
        }
        bw.close();

    }
}
