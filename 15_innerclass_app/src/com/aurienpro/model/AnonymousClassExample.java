package com.aurienpro.model;
//Anonymous Class
interface Greeting {
    void greet();
}

public class AnonymousClassExample {
    public void displayGreeting() {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous class!");
            }
        };

        greeting.greet();
    }

    public static void main(String[] args) {
        AnonymousClassExample outer = new AnonymousClassExample();
        outer.displayGreeting();
    }
}