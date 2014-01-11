package manalit.unixtools;
import java.io.*;

public class wc {
   public static void main(String args[])throws IOException{
       String text;
       ReadFile readFile = new ReadFile();
       text =readFile.read(args[0]);
   	 Count findCount = new Count();
	 int characters = findCount.charCount(text);
	 int words = findCount.wordCount(text);
	 int lines = findCount.lineCount(text);
	 System.out.println(characters+" "+words+" "+lines);
}
}
