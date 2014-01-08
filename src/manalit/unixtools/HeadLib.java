package manalit.unixtools;

/**
 * Created by manalit on 1/8/14.
 */
public class HeadLib {
    public void headCount(int size,String input){
        String data[] = input.split("\n");
        for(int i = 0;i<=size;i++ ){
            System.out.println(data[i]);
        }
    }
}
