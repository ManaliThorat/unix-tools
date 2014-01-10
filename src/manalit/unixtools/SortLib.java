package manalit.unixtools;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLib {
    public String[] sortData(String input){
        String lines[] = input.split("\n");
        Arrays.sort(lines);
        return lines;
    }
    public String[] reverseData(String input){
        String lines[] = sortData(input);
        List<String> strList = Arrays.asList(lines);
        Collections.reverse(strList);
        lines = strList.toArray(new String[strList.size()]);
        return lines;
    }
}
