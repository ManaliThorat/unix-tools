package manalit.unixtools;

/**
 * Created by manalit on 1/8/14.
 */
public class TailLib {
    public void tailCount(String input){
        String data[] = input.split("\n");
        for(int i = data.length - 10;i<data.length;i++ ){
            System.out.println(data[i]);
        }
    }
}
