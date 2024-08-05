package com.aurionpro.linkedlist;

import java.util.LinkedList;

public class LInkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Neha");
		list.add("Sayali");
		list.addFirst("Sakshi");
		list.addLast("Swati");
		
		for(String name:list)
		System.out.println(name);
		
		System.out.println("Last Element:"+list.getLast());
		
		
		
	}

}

