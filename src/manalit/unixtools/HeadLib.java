package manalit.unixtools;

public class HeadLib {
    public StringBuilder headCount(int size,String input){
        String data[] = input.split("\n");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i<size;i++ ){
            stringBuilder.append(data[i]).append("\r\n");
        }
        return stringBuilder;
    }
}
