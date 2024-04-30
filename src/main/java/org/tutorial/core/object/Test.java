package org.tutorial.core.object;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        var obj1 = new Object();
        var obj2 = new Object();

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj1));
        System.out.println(obj1 == obj1);

        var x = new Email("abc");
        var y = new Person();

        System.out.println(x.getClass());

        System.out.println(String.format("Email hashCode() | %s", x.hashCode()));
        x.setValue("def");
        System.out.println(String.format("Email hashCode() | %s", x.hashCode()));

        y.setName("Name_1");
        System.out.println(String.format("Person hashCode() | %s", y.hashCode()));
        y.setName("Name_2");
        System.out.println(String.format("Person hashCode() | %s", y.hashCode()));

    }
}
