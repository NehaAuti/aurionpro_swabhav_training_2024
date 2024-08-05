package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList list = new ArrayList();
//		System.out.println(list);
//		System.out.println(list.size());
//		
//		list.add("Neha");
//		list.add("Sayali");
//		System.out.println(list);
//		
//		list.add(1,"Sakshi");
//		System.out.println(list);
//		
//		list.add(3,"Namrata");
//		System.out.println(list);
//		
//		list.add(50);
//		System.out.println(list);
//		
//		list.remove("sakshi");
//		System.out.println(list);
		
		
		List<String> list  = new ArrayList<String>();
        List<Integer> integers = Arrays.asList(10,20,30,40,50);
        
        list.add("Neha");
        list.add("Sayali");
        list.add("Sakshi");
        
        System.out.println(list);
        
        System.out.println("Using Normal for loop");
        
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println("Using Advanced for loop");
        for(String name : list) {
            System.out.println(name);
        }
        
        System.out.println("Using Iterator");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("Using List Iterator (Forward)");
        ListIterator<String> listIterator = list.listIterator();
        
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        
        System.out.println("Using List Iterator (Backward)");
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}