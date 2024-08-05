package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.CarInspection;
import com.aurionpro.structural.decorator.model.ICarService;
import com.aurionpro.structural.decorator.model.OilChange;
import com.aurionpro.structural.decorator.model.WheelAlign;

public class CarServiceDecoratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    ICarService basicInspection = new CarInspection();
	        ICarService oilChangeService = new OilChange(basicInspection);
	        ICarService fullService = new WheelAlign(oilChangeService);

	        System.out.println("Cost of basic inspection: $" + basicInspection.getCost());
	        System.out.println("Cost of inspection with oil change: $" + oilChangeService.getCost());
	        System.out.println("Cost of full service (inspection + oil change + wheel alignment): $" + fullService.getCost());

	}

}
