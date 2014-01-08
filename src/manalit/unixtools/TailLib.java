package manalit.unixtools;

/**
 * Created by manalit on 1/8/14.
 */
public class TailLib {
    public void tailCount(int size,String input){
        String data[] = input.split("\n");
        for(int i = data.length - size;i<data.length;i++ ){
            System.out.println(data[i]);
        }
    }
}
