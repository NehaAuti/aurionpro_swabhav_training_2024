package com.aurienpro.model;
//Non-static Nested Class (Inner Class)
public class OuterClass {
    private int outerField;

    public OuterClass(int outerField) {
        this.outerField = outerField;
    }

    // Inner class (non-static nested class)
    public class InnerClass {
        private int innerField;

        public InnerClass(int innerField) {
            this.innerField = innerField;
        }

        public void display() {
            System.out.println("Outer Field: " + outerField);
            System.out.println("Inner Field: " + innerField);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass(10);
        OuterClass.InnerClass inner = outer.new InnerClass(20);
        inner.display();
    }
}