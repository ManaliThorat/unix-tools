package manalit.unixtools;

import java.io.IOException;

public class Cut {
    public static void main(String args[])throws IOException {
        String text;
        String delimeter;
        StringBuilder result;
        if(args.length == 3)
            delimeter = args[2].substring(2);
        else
            delimeter = " ";
        ReadFile readFile = new ReadFile();
        text =readFile.read(args[0]);
        CutLib cutData = new CutLib();
        result = cutData.cutCount(Integer.parseInt(args[1].substring(2)),delimeter,text);
        System.out.println(result);
    }

}
