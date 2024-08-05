package com.aurionpro.structural.facade.model;

public class HotelReception {
    public void getIndianMenu() {
        IHotel indianHotel = new IndianHotel();
        IMenu menu = indianHotel.getMenu();
        menu.displayMenu();
    }

    public void getItalianMenu() {
        IHotel italianHotel = new ItalianHotel();
        IMenu menu = italianHotel.getMenu();
        menu.displayMenu();
    }

    public void getChineseMenu() {
        IHotel chineseHotel = new ChineseHotel();
        IMenu menu = chineseHotel.getMenu();
        menu.displayMenu();
    }
}