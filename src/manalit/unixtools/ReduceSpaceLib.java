package manalit.unixtools;

public class ReduceSpaceLib {
    public String removeSpaces(String input){
        input.replaceAll("\\s+"," ");
        return input;
    }

}
