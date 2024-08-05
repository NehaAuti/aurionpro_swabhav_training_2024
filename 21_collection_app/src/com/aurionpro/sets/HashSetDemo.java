package com.aurionpro.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<String> set = new HashSet<String>();
		//LinkedHashSet<String> set = new LinkedHashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Neha");
		set.add("Mrunalani");
		set.add("Sivam");
		set.add("Chriag");
		set.add("Chriag");
		
		System.out.println(set);

	}

}
