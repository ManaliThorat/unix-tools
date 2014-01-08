package manalit.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Head {
    public static void main(String args[])throws IOException {
        int size = 0;
        String currentLine,text = "";
        try {
            if(args.length == 2){
                size =Integer.parseInt(args[0].substring(1));
                BufferedReader br = new BufferedReader(new FileReader(args[1]));
                while ((currentLine = br.readLine()) != null) {
                    text += "\r\n"+currentLine;
                }
            }
            else{
                size = 10;
                BufferedReader br = new BufferedReader(new FileReader(args[0]));
                while ((currentLine = br.readLine()) != null) {
                    text += "\r\n"+currentLine;
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
        HeadLib findCount = new HeadLib();
        findCount.headCount(size,text);
    }
}
