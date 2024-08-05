package com.example.modifiers;

public class TestModifiers {
    private String privateMember = "Private Member";
    String defaultMember = "Default Member";
    protected String protectedMember = "Protected Member";
    public String publicMember = "Public Member";

    public void displayMembers() {
        // Accessing all members in the same class
        System.out.println(privateMember);    // Accessible
        System.out.println(defaultMember);    // Accessible
        System.out.println(protectedMember);  // Accessible
        System.out.println(publicMember);     // Accessible
    }

    public static void main(String[] args) {
        TestModifiers tm = new TestModifiers();
        tm.displayMembers();
    }
}