package com.example.access;

import com.example.modifiers.TestModifiers;

public class AnotherClassDifferentPackage {
    public void accessMembers() {
        TestModifiers tm = new TestModifiers();
        // System.out.println(tm.privateMember); // Not accessible
        // System.out.println(tm.defaultMember); // Not accessible
        // System.out.println(tm.protectedMember); // Not accessible
        System.out.println(tm.publicMember);   // Accessible
    }

    public static void main(String[] args) {
        AnotherClassDifferentPackage acdp = new AnotherClassDifferentPackage();
        acdp.accessMembers();
    }
}