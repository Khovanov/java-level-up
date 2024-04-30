package org.tutorial.core.jvm;

public class Embeded {
    public static void main(String[] args) {
        var emb = new Test2.Test3();

        var a = 1; //int
        var b = 1L; //long
        int c = new Integer(32);
    }

    public static class Test2 {
        public static class Test3 {
        }
    }
}
