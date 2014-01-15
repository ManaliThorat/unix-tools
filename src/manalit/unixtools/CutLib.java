package manalit.unixtools;

public class CutLib {
    public String cutCount(int field_no, String delimeter, String input) {
        StringBuilder result = new StringBuilder();
        String lines[] = input.split("\n");
        if (lines.length < field_no) return result.toString();
        String words_a_line[];
        for (int counter = 0; counter < lines.length; counter++) {
            words_a_line = lines[counter].split(delimeter);
            result.append(words_a_line[field_no - 1]);
            result.append("\n");
        }
        return result.toString();
    }
}
