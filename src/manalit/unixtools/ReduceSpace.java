package manalit.unixtools;

import java.io.*;


public class ReduceSpace {
    public static void main(String args[])throws IOException {
        String sortedDAta;
        String text;
        ReadFile readFile = new ReadFile();
        text =readFile.read(args[0]);
        ReduceSpaceLib reduceSpace = new ReduceSpaceLib();
        sortedDAta = reduceSpace.removeSpaces(text);
        System.out.println(sortedDAta);
        File file = new File(args[0]);
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(String.valueOf(sortedDAta));
        bw.close();

    }
}
