package org.tutorial.core.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ProgramCore {

    public static void main(String[] args) throws IOException {

        Path cwd = Path.of("").toAbsolutePath();
        String path = cwd + "/src/main/resources/";
        System.out.println("Resources path: " + path);

        System.out.print("\nStream: ");
        try (FileOutputStream fos = new FileOutputStream(path + "test.txt")) {
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(path + "test.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        }

        File directory = new File(path + "testDir");
        if (!directory.exists()) {
            directory.mkdir();
        }

//        if (directory.exists()) {
//            directory.delete();
//        }

        System.out.print("\nRead all: ");
        Path p = Paths.get(path + "test.txt");

        List<String> dd = Files.readAllLines(p);

        for (var s : dd) {
            System.out.print(s);
        }
    }
}
