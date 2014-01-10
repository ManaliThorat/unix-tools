package manalit.unixtools;

/**
 * Created by manalit on 1/9/14.
 */
public class CutLib {
    public void cutCount(int field_no,String input){
        String words[];
        String result = "";
        String lines[] = input.split("\n");
        for(int i = 0;i<lines.length;i++ ){
            words=lines[i].split(" ");
            result=result+words[field_no-1]+"\r\n";
        }
        System.out.println(result);
    }
}
