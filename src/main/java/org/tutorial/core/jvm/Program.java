package org.tutorial.core.jvm;

public class Program {
    public static void main(String[] args) {

        HelloWorld hello = new HelloWorld();
        Loop loop = new Loop();
        Condition cond = new Condition();

        // System.out.println(System.getenv("CLASSPATH"));

        hello.main(args);
        loop.main(args);
        cond.main(args);

    }
}
