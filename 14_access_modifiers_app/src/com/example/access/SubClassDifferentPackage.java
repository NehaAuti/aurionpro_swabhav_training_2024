package com.example.access;

import com.example.modifiers.TestModifiers;

public class SubClassDifferentPackage extends TestModifiers {
    public void accessMembers() {
        // System.out.println(privateMember);    // Not accessible
        // System.out.println(defaultMember);    // Not accessible
        System.out.println(protectedMember);   // Accessible
        System.out.println(publicMember);      // Accessible
    }
}