package manalit.unixtools;

import java.io.*;


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
        File file = new File(args[0]);
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < sortedDAta.length; i++) {
            bw.write(String.valueOf(sortedDAta[i]+"\n"));
        }
        bw.close();

    }
}

//FileWriter fw = new FileWriter(file.getAbsoluteFile());
//BufferedWriter bw = new BufferedWriter(fw);
//bw.write(content);
//        bw.close();
