package com.aurionpro.test;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> randomNoSupplier = () -> (int) (Math.random()*100);
	//	int random = randomNoSupplier.get();
		System.out.println(randomNoSupplier.get());

}
}
