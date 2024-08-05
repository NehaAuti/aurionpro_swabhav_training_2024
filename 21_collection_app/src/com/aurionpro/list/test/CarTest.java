package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        List<Car> cars = new ArrayList<>();

		        int numberOfCars = readNumberOfCars(scanner);
		        readCarDetails(cars, numberOfCars, scanner);
		        displayCarDetails(cars);

		        Car maxMileageCar = findMaxMileageCar(cars);
		        if (maxMileageCar != null) {
		            System.out.println("Car with maximum mileage: " + maxMileageCar);
		        }

		        scanner.close();
		    }

		    private static int readNumberOfCars(Scanner scanner) {
		        System.out.print("Enter the number of cars you want to add: ");
		        return scanner.nextInt();
		    }

		    private static void readCarDetails(List<Car> cars, int numberOfCars, Scanner scanner) {
		        for (int i = 0; i < numberOfCars; i++) {
		            System.out.println("Enter details for car " + (i + 1) + ":");

		            System.out.print("Enter Car ID: ");
		            int carId = scanner.nextInt();
		            scanner.nextLine();

		            System.out.print("Enter Company Name: ");
		            String companyName = scanner.nextLine();

		            System.out.print("Enter Price: ");
		            double price = scanner.nextDouble();

		            System.out.print("Enter Mileage: ");
		            double mileage = scanner.nextDouble();
		            scanner.nextLine(); // Consume newline

		            cars.add(new Car(carId, companyName, price, mileage));
		        }
		    }

		    private static void displayCarDetails(List<Car> cars) {
		        System.out.println("Car List:");
		        for (Car car : cars) {
		            System.out.println(car);
		        }
		    }

		    private static Car findMaxMileageCar(List<Car> cars) {
		        if (cars.isEmpty()) {
		            return null;
		        }

		        Car maxMileageCar = cars.get(0);
		        for (Car car : cars) {
		            if (car.getMileage() > maxMileageCar.getMileage()) {
		                maxMileageCar = car;
		            }
		        }
		        return maxMileageCar;
		    }
		}

		