package manalit.unixtools;

public class ReduceSpaceLib {
    public String[] removeSpaces(String input){
        String lines[] = input.split("\n");
        for(int i = 0;i<lines.length;i++ ){
            lines[i]=lines[i].replaceAll("\\s+"," ");
        }
        return lines;
    }

}
