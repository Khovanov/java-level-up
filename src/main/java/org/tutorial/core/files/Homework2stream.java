package org.tutorial.core.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Homework2stream {
    static int MAX_FILE_SIZE = 10;

    public static void main(String[] args) throws IOException {
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
            try (Stream<Path> stream = Files.walk(Paths.get(str), 1)) {
                stream
                    .sorted(Comparator.comparing(p -> p.toFile().length(), Comparator.reverseOrder()))
                    .filter(p -> getFileSizeMb(p.toFile()) > MAX_FILE_SIZE )
                    .forEach(Homework2stream::printDetails);
            } catch (NoSuchFileException e) {
                System.out.println("Directory doesn't exist, try again");
            }
        } while (true);
    }

    private static void printDetails(Path path) {
        File file = path.toFile();
        System.out.println(getFileSizeMb(file) + " mb" + " | " + file.getName());
    }

    private static Long getFileSizeMb(File file) {
        return (long) file.length() / (1024 * 1024);
    }
}
