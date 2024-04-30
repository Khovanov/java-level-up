package org.tutorial.core.object;

public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        person1.setEmail(new Email("aaa@test"));
        person1.setName("AAA");

        Person person2 = new Person();
        person2.setEmail(new Email("bbb@test"));
        person2.setName("BBB");

        Person person3 = new Person();
        person3.setName(person1.getName());
        person3.setEmail(person1.getEmail());

        System.out.println(String.format("person1 | %s", person1));
        System.out.println(String.format("person2 | %s", person2));
        System.out.println(String.format("person3 | %s", person3));

        System.out.println(String.format("person1 == person2 | %s", person1 == person2));
        System.out.println(String.format("person1.equals(person2) | %s", person1.equals(person2)));
        System.out.println(String.format("person1.equals(null) | %s", person1.equals(null)));
        System.out.println(String.format("person1.equals(person3) | %s", person1.equals(person3)));

        System.out.println(String.format("person1.hashCode | %s", person1.hashCode()));
        System.out.println(String.format("person2.hashCode | %s", person2.hashCode()));
        System.out.println(String.format("person3.hashCode | %s", person3.hashCode()));

        Person clone1 = (Person) person1.clone();
        System.out.println(String.format("person1 | %s", person1));
        System.out.println(String.format("clone1 | %s", clone1));
        System.out.println(String.format("person1.equals(clone1) | %s", person1.equals(clone1)));

    }
}
