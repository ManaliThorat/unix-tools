package manalit.unixtools;

import java.io.IOException;

public class Uniq {
    public static void main(String args[])throws IOException {
        String text;
        StringBuilder result;
        ReadFile readFile = new ReadFile();
        text =readFile.read(args[0]);
        UniqLib uniq = new UniqLib();
        result = uniq.uniqData(text);
        System.out.println(result);
    }
}