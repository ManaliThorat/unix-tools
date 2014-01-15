package manalit.unixtools;

import java.io.IOException;

public class Cut {
    public static void main(String args[])throws IOException {
        Cut cutclient = new Cut();
        ReadFile fs = new ReadFile();
        CutLib cut = new CutLib();

        String properArgv[] = cutclient.getArguments(args);
        int fieldValue = Integer.parseInt(properArgv[0].substring(2));
        String delimitor = properArgv[1].substring(2);
        String fileData = fs.read(properArgv[2]);
        StringBuilder columnData = cut.cutCount(fieldValue, delimitor, fileData);
        System.out.println(columnData);
    }

    String[] getArguments(String[] arg) {
        String options[] = new String[3];
        for (int i = 0; i < arg.length; i++) {
            if (Cut.isfield(arg[i]))
                options[0] = arg[i];
            if (Cut.isDelimitor(arg[i]))
                options[1] = arg[i];
            if (!Cut.isFile(arg[i]))
                options[2] = arg[i];
        }
        return options;
    }

    static boolean isDelimitor(String arg) {
        return arg.matches("-d.*");
    }

    static boolean isfield(String arg) {
        return arg.matches("-f.*");
    }

    static boolean isFile(String arg) {
        return arg.matches("-.*");
    }
    }


