package com.aurionpro.creational.adapter.test;

import com.aurionpro.creational.adapter.model.Biscuit;
import com.aurionpro.creational.adapter.model.Chocolate;
import com.aurionpro.creational.adapter.model.Hat;
import com.aurionpro.creational.adapter.model.HatAdapter;
import com.aurionpro.creational.adapter.model.IItems;
import com.aurionpro.creational.adapter.model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart cart = new ShoppingCart();

        IItems biscuit = new Biscuit("Oreo", 10);
        IItems chocolate = new Chocolate("Dairy Milk", 20);
        Hat hat = new Hat("Beanie", "Warm Beanie Hat", 100.0, 15.0);
        IItems hatAdapter = new HatAdapter(hat);

        cart.addItemToCart(biscuit);
        cart.addItemToCart(chocolate);
        cart.addItemToCart(hatAdapter);

        System.out.println("Cart Items:");
        for (IItems item : cart.getCartItems()) {
            System.out.println(item.getItemName() + ": $" + item.getItemPrice());
        }

        System.out.println("Total Cart Price: $" + cart.getCartPrice());
    }
}

