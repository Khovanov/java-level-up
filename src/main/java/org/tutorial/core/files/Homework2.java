package org.tutorial.core.files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;

public class Homework2 {
    static int MAX_FILE_SIZE = 10;

    public static void main(String[] args) {
        String str = "";
        do {
            System.out.println("Specify directory to find files larger than 10 mb, or type exit.");
            // input from console
            Scanner in = new Scanner(System.in);
            str = in.nextLine();

            // exit control
            if (str.toLowerCase().equals("exit")) {
                break;
            }

            // inspect directory
            File directory = new File(str);
            if (directory.exists() && directory.isDirectory()) {
                System.out.println("Inspect directory: " + str);
                File[] files = inspectDirectory(directory);
                if (files.length > 0) {
                    printFileList(files);
                } else {
                    System.out.println("Files larger than 10 mb not found");
                }

            } else {
                System.out.println("Directory doesn't exist, try again");
            }
        } while (true);
    }

    private static File[] inspectDirectory(File directory) {
        File[] lf = directory.listFiles(File::isFile);
        List<File> list = new ArrayList<File>();

        // select by size
        for (int i = 0; i < lf.length; i++) {
            if (getFileSizeMb(lf[i]) > MAX_FILE_SIZE) {
                list.add(lf[i]);
            }
        }
        // sort by size
        list.sort(Comparator.comparing(p -> p.length(), Comparator.reverseOrder()));

        File[] files = new File[list.size()];
        return list.toArray(files);
    }

    private static void printFileList(File[] files) {
        for (int i = 0; i < files.length; i++) {
            System.out.println(getFileSizeMb(files[i]) + " mb" + " | " + files[i].getName());
        }
    }

    private static Long getFileSizeMb(File file) {
        return (long) file.length() / (1024 * 1024);
    }
}
