package org.tutorial.core.object;

public class Email {
    private String value;

    // constructor
    public Email(String value) {
        this.value = value;
    }

    // constructor
    public Email() {}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
