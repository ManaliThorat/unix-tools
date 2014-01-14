package manalit.unixtools;

import java.io.IOException;

public class Tail {
    public static void main(String args[])throws IOException {
        int size;
        String text;
        String result;
        if(args.length == 2){
            size =Integer.parseInt(args[1].substring(1));
        }
        else{
            size = 10;
        }
        ReadFile readFile = new ReadFile();
        text =readFile.read(args[0]);
        TailLib tail = new TailLib();
        result = tail.tailCount(size,text);
        System.out.println(result);
    }
}

