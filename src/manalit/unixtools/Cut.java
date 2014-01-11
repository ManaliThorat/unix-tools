package manalit.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cut {
    public static void main(String args[])throws IOException {
        String currentLine,text = "";
        String delimeter;
        if(args.length == 3)
            delimeter = args[2];
        else
            delimeter = " ";
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            while ((currentLine = br.readLine()) != null) {
                text += currentLine+"\r\n";
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        CutLib findCount = new CutLib();
        findCount.cutCount(Integer.parseInt(args[1]),delimeter,text);
    }

}
