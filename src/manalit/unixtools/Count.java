package manalit.unixtools;

public class Count {
    public int charCount(String input) {
        String data[] = input.split("");
        return data.length;
    }

    public int wordCount(String input) {
        String data[] = input.split(" ");
        return data.length;
    }

    public int lineCount(String input) {
        String data[] = input.split("\n");
        return data.length;
    }
}