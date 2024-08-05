package com.example.modifiers;

public class AnotherClassSamePackage {
	public void accessMembers() {
        TestModifiers tm = new TestModifiers();
        // System.out.println(tm.privateMember); // Not accessible
        System.out.println(tm.defaultMember);  // Accessible
        System.out.println(tm.protectedMember); // Accessible
        System.out.println(tm.publicMember);    // Accessible
	}
}