package manalit.unixtools;
import java.io.*;

public class wc {
   public static void main(String args[])throws IOException{
       String currentLine,text = "";
       try {
           BufferedReader br = new BufferedReader(new FileReader(args[0]));
           while ((currentLine = br.readLine()) != null) {
               text += currentLine+"\r\n";
           }
       } catch (IOException e) {
           System.out.println(e);
       }
   	 Count findCount = new Count();
	 int characters = findCount.charCount(text);
	 int words = findCount.wordCount(text);
	 int lines = findCount.lineCount(text);
	 System.out.println(characters+" "+words+" "+lines);
}
}
