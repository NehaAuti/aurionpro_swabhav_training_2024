package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.DbConnectionForCompanyQuery;

public class DbConnectionForCompanyQueryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DbConnectionForCompanyQuery db = new DbConnectionForCompanyQuery();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Choose an option:");
	            System.out.println("1: List all products along with their supplier names");
	            System.out.println("2: Get all orders with their details");
	            System.out.println("3: Find all suppliers who have supplied a specific product");
	            System.out.println("4: List all products and their current inventory levels");
	            System.out.println("5: Find all orders placed within the last month");
	            System.out.println("6: Get total quantity ordered for each product");
	            System.out.println("7: Retrieve all orders along with the total amount spent for each order");
	            System.out.println("8: Find products supplied by more than one supplier");
	            System.out.println("9: Get the average inventory level for each product");
	            System.out.println("10: List suppliers who have not supplied any products");
	            System.out.println("0: Exit");

	            int option = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (option) {
	                case 1:
	                    db.listProductsWithSupplierNames();
	                    break;
	                case 2:
	                    db.getAllOrdersWithDetails();
	                    break;
	                case 3:
	                    db.findSuppliersForProduct();
	                    break;
	                case 4:
	                    db.listProductsWithInventoryLevels();
	                    break;
	                case 5:
	                    db.findOrdersInLastMonth();
	                    break;
	                case 6:
	                    db.getTotalQuantityOrdered();
	                    break;
	                case 7:
	                    db.retrieveOrdersWithTotalAmount();
	                    break;
	                case 8:
	                    db.findProductsSuppliedByMultipleSuppliers();
	                    break;
	                case 9:
	                    db.getAverageInventoryLevel();
	                    break;
	                case 10:
	                    db.listSuppliersWithNoProducts();
	                    break;
	                case 0:
	                    db.closeConnection();
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	                    break;
	            }
	        }
	    }
	}