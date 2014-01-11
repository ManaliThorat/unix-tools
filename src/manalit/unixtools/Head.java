package manalit.unixtools;

import java.io.IOException;


public class Head {
    public static void main(String args[])throws IOException {
        int size;
        String text;
        if(args.length == 2){
            size =Integer.parseInt(args[1].substring(1));
        }
        else{
            size = 10;
        }
        ReadFile readFile = new ReadFile();
            text =readFile.read(args[0]);
        HeadLib findCount = new HeadLib();
        findCount.headCount(size,text);
    }
}



