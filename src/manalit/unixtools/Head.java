package manalit.unixtools;

import java.io.IOException;

public class Head {
    public static void main(String args[])throws IOException {
        Head headcli= new Head();
        ReadFile fs = new ReadFile();
        HeadLib head = new HeadLib();

        String properArgv[] = headcli.getArguments(args);
        String fileData = fs.read(properArgv[0]);
        int size = Integer.parseInt(properArgv[1].substring(1));
        String columnData = head.headCount(size, fileData);
        System.out.println(columnData);
    }

    String[] getArguments(String[] arg) {
        String options[] = new String[2];
        for (int i = 0; i < arg.length; i++) {
            if (Head.isNumber(arg[i]))
                options[1] = arg[i];
            if (!Head.isFile(arg[i]))
                options[0] = arg[i];
        }
        return options;
    }

    static boolean isNumber(String arg) {
        return arg.matches("-.*");
    }

    static boolean isFile(String arg) {
        return arg.matches("-.*");
    }

}




