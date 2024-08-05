package com.aurionpro.structural.facade.test;

import com.aurionpro.structural.facade.model.HotelReception;

public class HotelFacadeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelReception hotelReception = new HotelReception();

        System.out.println("Indian Hotel Menu:");
        hotelReception.getIndianMenu();

        System.out.println("\nItalian Hotel Menu:");
        hotelReception.getItalianMenu();

        System.out.println("\nChinese Hotel Menu:");
        hotelReception.getChineseMenu();
    }
}

