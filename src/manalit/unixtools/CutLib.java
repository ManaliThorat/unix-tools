package manalit.unixtools;

public class CutLib {
    public void cutCount(int field_no,String delimeter,String input){
        String words[];
        String result = "";
        String lines[] = input.split("\n");
        for(int i = 0;i<lines.length;i++ ){
            words=lines[i].split(delimeter);
            result=result+words[field_no-1]+"\r\n";
        }
        System.out.println(result);
    }
}
