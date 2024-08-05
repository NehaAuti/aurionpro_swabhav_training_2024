package com.aurienpro.model;
//Static Nested Class
public class StaticNestedClass {
    private static int staticOuterField;

    static {
        staticOuterField = 100;
    }

    // Static nested class
    public static class NestedClass {
        private int innerField;

        public NestedClass(int innerField) {
            this.innerField = innerField;
        }

        public void display() {
            System.out.println("Static Outer Field: " + staticOuterField);
            System.out.println("Inner Field: " + innerField);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.NestedClass nested = new StaticNestedClass.NestedClass(200);
        nested.display();
    }
}
