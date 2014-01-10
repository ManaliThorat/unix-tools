package manalit.unixtools;

public class HeadLib {
    public void headCount(int size,String input){
        String data[] = input.split("\n");
        for(int i = 0;i<=size;i++ ){
            System.out.println(data[i]);
        }
    }
}
