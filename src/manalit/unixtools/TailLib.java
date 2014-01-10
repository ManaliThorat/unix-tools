package manalit.unixtools;

public class TailLib {
    public void tailCount(int size,String input){
        String data[] = input.split("\n");
        for(int i = data.length - size;i<data.length;i++ ){
            System.out.println(data[i]);
        }
    }
}
