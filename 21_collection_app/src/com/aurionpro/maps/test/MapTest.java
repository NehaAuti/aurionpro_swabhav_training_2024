package com.aurionpro.maps.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	HashMap<Integer ,String> map = new HashMap<Integer ,String>();
    //	LinkedHashMap<Integer ,String> map = new LinkedHashMap<Integer ,String>();
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
//		map.put(5,"Neha");
//		map.put(4, "Sayali");
//		map.put(7, "Sakshi");
//		map.put(4, "Mrunmai");
//		map.put(5, "Namrata");
		map.put(5,"Chirag");
		map.put(4, "Shirish");
		map.put(7, "vinayak");
		
		
		System.out.println(map);
		
		Set<Entry<Integer,String>> entries = map.entrySet();
		
		for(Entry<Integer,String> entry:entries)
		{
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
		
		
		
	}

}
