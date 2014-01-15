package manalit.unixtools;

import java.io.IOException;

public class Head {
    public static void main(String args[])throws IOException {
        int size = 0;
        String text;
        String result;
        if(args.length == 2){
            for (int i = 0; i <args.length ; i++) {
                if(args[i].startsWith("-"))
                    size =Integer.parseInt(args[1].substring(1));

            }
        }
       else
            size = 10;

        ReadFile readFile = new ReadFile();
        text =readFile.read(args[0]);
        HeadLib tail = new HeadLib();
        result = tail.headCount(size, text);
        System.out.println(result);
    }
}



