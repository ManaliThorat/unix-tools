package manalit.unixtools;
import java.io.*;

public class wc {
   public static void main(String args[])throws IOException{
   	char arr[] = new char[50];
    try{
	    File file = new File("one.txt");
	    int i = 0;
	    FileReader fr = new FileReader(file); 
	    char [] a = new char[50];
	    fr.read(a);
	    for(char c : a){
	    	arr[i] = c;
	    	i++;
	    }
	    for(i = 0;i<arr.length;i++)
	    	System.out.print(arr[i]);
	      fr.close();
   }
   catch(Exception e){
   		System.out.println("error");
   }
   String file_data = new String(arr);
   	 Count findCount = new Count();	
	 int characters = findCount.charCount(file_data);
	 int words = findCount.wordCount(file_data);
	 int lines = findCount.lineCount(file_data);
	 System.out.println(characters+" "+words+" "+lines);
}
}
