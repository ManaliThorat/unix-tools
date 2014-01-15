package manalit.unixtools;

import java.io.IOException;

public class Tail {
    public static void main(String args[])throws IOException {
        Tail tailcli= new Tail();
        ReadFile fs = new ReadFile();
        TailLib tail = new TailLib();

        String properArgv[] = tailcli.getArguments(args);
        String fileData = fs.read(properArgv[0]);
        int size;
        if(properArgv[1] != null)
            size = Integer.parseInt(properArgv[1].substring(1));
        else
            size = 10;
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


