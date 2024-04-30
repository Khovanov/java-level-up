package org.tutorial.core.jvm;

public class Condition {
    public static void main(String[] args) {

        // if
        int x = 4;

        if (x < 5) {
            System.out.println("x less then 5");
        } else if (x > 5) {
            System.out.println("x greater then 5");
        } else {
            System.out.println("x equal 5");
        }

        // switch
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Weekend");
        }
    }
}
