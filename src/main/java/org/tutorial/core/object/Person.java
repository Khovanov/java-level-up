package org.tutorial.core.object;

import java.util.Objects;

public class Person implements Cloneable {
    private String name;
    private Email email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(email.getValue(), person.email.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email=" + email.getValue() +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //  return super.clone();
        Person clone = new Person();
        clone.setName(this.name);
        clone.setEmail(new Email(this.email.getValue()));
        return clone;
    }
}
