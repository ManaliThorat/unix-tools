package manalit.unixtools;


public class UniqLib {
    public void uniqData(String input){
        String data[] = input.split("\n");
        for(int count=0;count<data.length-1;count++){
            if(0!=(data[count].compareTo(data[count+1])))
                System.out.println(data[count]);
        }
    }
}
