package manalit.unixtools;

/**
 * Created by manalit on 1/8/14.
 */
public class HeadLib {
    public void headCount(String input){
        String data[] = input.split("\n");
        for(int i = 0;i<=10;i++ ){
            System.out.println(data[i]);
        }
    }
}
