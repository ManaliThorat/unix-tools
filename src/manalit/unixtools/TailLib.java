package manalit.unixtools;

public class TailLib {
    public String tailCount(int size,String input){
        String data[] = input.split("\n");
        StringBuilder res = new StringBuilder();
        for(int i = data.length - size;i<data.length;i++ ){
            res.append(data[i]).append("\r\n");
        }
        return res.toString();
    }
}



