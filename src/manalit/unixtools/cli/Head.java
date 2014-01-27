package manalit.unixtools.cli;

import manalit.unixtools.HeadLib;
import manalit.unixtools.ReadFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Head {
    public static void main(String args[]) throws IOException {
        Head headcli = new Head();
        ReadFile fs = new ReadFile();
        HeadLib head = new HeadLib();

        String properArgv[] = headcli.getArguments(args);
        String fileData = fs.read(properArgv[0]);
        int size;

        if (properArgv[1] != null)
            size = Integer.parseInt(properArgv[1].substring(1));
        else {
            try {
                FileReader reader = new FileReader("config.properties");
                Properties properties = new Properties();
                properties.load(reader);
                size = Integer.parseInt(properties.getProperty("default-head-lines"));
            } catch (IOException e) {
                size = 10;
            }
        }
        String columnData = head.headCount(size, fileData);
        System.out.println(columnData);
    }

    String[] getArguments(String[] arg) {
        String options[] = new String[2];
        for (int i = 0; i < arg.length; i++) {
            if (Head.isNumber(arg[i]))
                options[1] = arg[i];
            if (!Head.isNumber(arg[i]))
                options[0] = arg[i];
        }
        return options;
    }

    static boolean isNumber(String arg) {
        return arg.matches("-.*");
    }
}




