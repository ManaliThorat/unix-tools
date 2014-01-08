package manalit.unixtools;

/**
 * Created by manalit on 1/8/14.
 */
public class UniqLib {
    public void uniqData(String input){
        String data[] = input.split("\n");
        System.out.println(data.length);
        for(int count=0;count<data.length-1;count++){
            if(0!=(data[count].compareTo(data[count+1])))
                System.out.println(data[count]);

        }
    }
}
