package manalit.unixtools;

import java.io.IOException;

public class Cut {
    public static void main(String args[])throws IOException {
        String text;
        String delimeter;
        if(args.length == 3)
            delimeter = args[2];
        else
            delimeter = " ";
        ReadFile readFile = new ReadFile();
        text =readFile.read(args[0]);
        CutLib findCount = new CutLib();
        findCount.cutCount(Integer.parseInt(args[1]),delimeter,text);
    }

}
