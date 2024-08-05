package com.aurienpro.model;
//Local Class
public class LocalClassExample {
    private int outerField = 50;

    public void methodWithLocalClass() {
        int localVariable = 30;

        // Local class inside a method
        class LocalClass {
            public void display() {
                System.out.println("Outer Field: " + outerField);
                System.out.println("Local Variable: " + localVariable);
            }
        }

        LocalClass local = new LocalClass();
        local.display();
    }

    public static void main(String[] args) {
        LocalClassExample outer = new LocalClassExample();
        outer.methodWithLocalClass();
    }
}
