package org.tutorial.core.jvm;

public class Loop {
    public static void main(String[] args) {

        // while 0-9
        System.out.println("\nwhile 0-9");
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }


        // do while 0-9
        System.out.println("\ndo while 0-9");
        i = 0;

        do {
            System.out.println(i);
            i++;
        } while (i < 10);


        // for 1-5
        System.out.println("\nfor 1-5");
        int[] numbers = {1, 2, 3, 4, 5};

        for (int x : numbers) {
            System.out.println(x);
        }


        // break 0-4
        System.out.println("\nbreak 0-4");

        for (int a = 0; a < 10; a++) {
            if (a == 5) {
                // stop 4
                break;
            }
            System.out.println(a);
        }


        // continue 0-9 skip 5
        System.out.println("\ncontinue 0-9 skip 5");

        for (int b = 0; b < 10; b++) {
            if (b == 5) {
                // skip 5
                continue;
            }
            System.out.println(b);
        }
    }
}
