package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.GoldenHat;
import com.aurionpro.structural.decorator.model.IHat;
import com.aurionpro.structural.decorator.model.PremiumHat;
import com.aurionpro.structural.decorator.model.RibbonedHat;
import com.aurionpro.structural.decorator.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		IHat standardHat = new StandardHat();
        IHat premiumHat = new PremiumHat();

        IHat goldenStandardHat = new GoldenHat(standardHat);
        IHat ribbonedPremiumHat = new RibbonedHat(premiumHat);

        System.out.println(goldenStandardHat.getName() + ": $" + goldenStandardHat.getPrice() + " - " + goldenStandardHat.getDescription());
        System.out.println(ribbonedPremiumHat.getName() + ": $" + ribbonedPremiumHat.getPrice() + " - " + ribbonedPremiumHat.getDescription());
    }
}