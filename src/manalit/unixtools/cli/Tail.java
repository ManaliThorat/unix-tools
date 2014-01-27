package manalit.unixtools.cli;

import manalit.unixtools.ReadFile;
import manalit.unixtools.TailLib;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Tail {
    public static void main(String args[]) throws IOException {
        Tail tailcli = new Tail();
        ReadFile fs = new ReadFile();
        TailLib tail = new TailLib();

        String properArgv[] = tailcli.getArguments(args);
        String fileData = fs.read(properArgv[0]);
        int size;
        if (properArgv[1] != null)
            size = Integer.parseInt(properArgv[1].substring(1));
        else {
            try {
                String user_config = System.getenv("UNIX") +  "/config.properties";
                FileReader reader = new FileReader(user_config);
                Properties properties = new Properties();
                properties.load(reader);
                size = Integer.parseInt(properties.getProperty("default-tail-lines"));
            } catch (IOException e) {
                size = 10;
            }
        }
        String columnData = tail.tailCount(size, fileData);
        System.out.println(columnData);
    }

    String[] getArguments(String[] arg) {
        String options[] = new String[2];
        for (int i = 0; i < arg.length; i++) {
            if (Tail.isNumber(arg[i]))
                options[1] = arg[i];
            if (!Tail.isNumber(arg[i]))
                options[0] = arg[i];
        }
        return options;
    }

    static boolean isNumber(String arg) {
        return arg.matches("-.*");
    }


}


