package manalit.unixtools;

public class ReduceSpaceLib {
    public String removeSpaces(String input) {
        return input.replaceAll("( )+", " ");
    }

}
