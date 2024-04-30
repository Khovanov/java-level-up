package org.tutorial.core.exceptions;

import org.tutorial.core.jvm.HelloWorld;

public class Test {

    public static void main(String[] args) throws nameNotFilledExeption {
        Person p = new Person();


        try {
            System.out.println(p.getName());
        } catch (nameNotFilledExeption e) {
            System.out.println("Exeption: " + e.getMessage());
        }

        p.setName("PersonName");
        try {
            System.out.println(p.getName());
        } catch (nameNotFilledExeption ignored) {}
    }

    public static class Person {
        private String name;

        public String getName() throws nameNotFilledExeption {
            if (name == null) {
                throw new nameNotFilledExeption(this);
            }
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class nameNotFilledExeption extends Exception {
        public nameNotFilledExeption(Person p) {
            super("Name not filled " + p.hashCode());
        }
    }
}
