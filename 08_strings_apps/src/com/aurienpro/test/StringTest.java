package com.aurienpro.test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String are immutable
		String name1 = "Neha";
		String name2 = "Neha";
		
		System.out.println(name1==name2);
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		String name3 =new String ("Neha");
		String name4 =new String ("Neha2");
		
		System.out.println(name3==name4);
		
		System.out.println(name3.hashCode());
		System.out.println(name4.hashCode());
		
		String name="Neha";
		System.out.println(name.hashCode());
		name = name + "Auti";
		System.out.println(name);
		System.out.println(name.hashCode());
		
	    StringBuffer name5=new StringBuffer("Sakshi");
	    System.out.println(name5.hashCode());
	    name5=name5.append("Thorbole");
	    System.out.println(name5.hashCode());
	    

	    StringBuilder name6=new StringBuilder("Sakshi");
	    System.out.println(name6.hashCode());
	    name6=name6.append("Thorbole");
	    System.out.println(name6.hashCode());
	    
		
		
		
		

	}

}
