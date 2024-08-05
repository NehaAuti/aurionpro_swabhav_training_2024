package com.aurionpro.solution.guiter.model;

import java.util.*;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
        Guitar guitar = new Guitar(serialNumber, price, spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList<>();
        for (Guitar guitar : guitars) {
            GuitarSpec guitarSpec = guitar.getSpec();
            if (searchSpec.getBuilder() != guitarSpec.getBuilder())
                continue;
            String model = searchSpec.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitarSpec.getModel().toLowerCase())))
                continue;
            if (searchSpec.getType() != guitarSpec.getType())
                continue;
            if (searchSpec.getBackWood() != guitarSpec.getBackWood())
                continue;
            if (searchSpec.getTopWood() != guitarSpec.getTopWood())
                continue;
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}

//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//public class Inventory { 
//	private List<Guitar> guitars;
//	
//	public Inventory() {
//		guitars = new LinkedList<>();
//	}
//	
//	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
//    Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood, numStrings);
//    guitars.add(guitar);
//
//	}
//	
//	public Guitar getGuitar(String serialNumber)
//	{
//		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
//			Guitar guitar = i.next();
//        if (guitar.getSerialNumber().equals(serialNumber)) {
//            return guitar;
//        }
//    }
//    return null;
//}
//	
//	public List<Guitar> search(GuitarSpec searchSpec)
//	{
//		List<Guitar> matchingGuitars = new LinkedList<>();
//		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
//        Guitar guitar = i.next();
//        if (guitar.getSpec().matches(searchSpec)) {
//            matchingGuitars.add(guitar);
//        }
//    }
//    return matchingGuitars;
//   }
//}
