package manalit.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    public String read(String fileName) {
        String line;
        String fileData = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                fileData += line + "\n";
            }
        } catch (Exception e) {
            System.out.println("file not found");
        }
        return fileData;
    }
}
