package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DbConnectionForCompanyQuery {
	private Connection conn;

    // Constructor to initialize database connection
    public DbConnectionForCompanyQuery() {
        try {
            // Replace with your actual database URL, user, and password
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
            System.out.println("Connected to database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to list all products along with their supplier names
    public void listProductsWithSupplierNames() {
        String query = "SELECT product_name, supplier_name " +
                       "FROM products p " +
                       "JOIN suppliers s ON p.supplier_id = s.supplier_id";
        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("Product: " + rs.getString("product_name") +
                                   ", Supplier: " + rs.getString("supplier_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to get all orders with their details
    public void getAllOrdersWithDetails() {
        String query = "SELECT o.order_id, o.order_date, product_name, od.quantity, od.price " +
                       "FROM orders o " +
                       "JOIN order_details od ON o.order_id = od.order_id " +
                       "JOIN products p ON od.order_details_product_id = p.product_id";
        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("OrderID: " + rs.getInt("order_id") +
                                   ", OrderDate: " + rs.getDate("order_date") +
                                   ", Product: " + rs.getString("product_name") +
                                   ", Quantity: " + rs.getInt("quantity") +
                                   ", Price: " + rs.getDouble("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to find all suppliers who have supplied a specific product
    public void findSuppliersForProduct() {
        String query = "SELECT s.supplier_id, s.supplier_name, s.contact_info, s.address " +
                       "FROM suppliers s " +
                       "JOIN products p ON s.supplier_id = p.supplier_id " +
                       "WHERE p.product_id = 1";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
           
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println("SupplierID: " + rs.getInt("supplier_id") +
                                       ", Name: " + rs.getString("supplier_name") +
                                       ", Contact: " + rs.getString("contact_info") +
                                       ", Address: " + rs.getString("address"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to list all products and their current inventory levels
    public void listProductsWithInventoryLevels() {
        String query = "SELECT p.product_name, i.quantity_on_hand,i.inventory_id " +
                       "FROM products p " +
                       "JOIN inventry i ON p.product_id = i.inventry_product_id";
        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("Product: " + rs.getString("product_name") +
                                   ", Quantity On Hand: " + rs.getInt("quantity_on_hand"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to find all orders placed within the last month
    public void findOrdersInLastMonth() {
        String query = "SELECT order_id, order_date " +
                       "FROM orders " +
                       "WHERE order_date >= NOW() - INTERVAL 1 MONTH";
        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("OrderID: " + rs.getInt("order_id") +
                                   ", OrderDate: " + rs.getDate("order_date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to get total quantity ordered for each product
    public void getTotalQuantityOrdered() {
        String query = "SELECT product_name, SUM(od.quantity) AS total_quantity_ordered " +
                       "FROM order_details od " +
                       "JOIN products p ON od.order_details_product_id = p.product_id " +
                       "GROUP BY p.product_id, p.product_name";
        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("Product: " + rs.getString("product_name") +
                                   ", Total Quantity Ordered: " + rs.getInt("total_quantity_ordered"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve all orders along with the total amount spent for each order
    public void retrieveOrdersWithTotalAmount() {
        String query = "SELECT o.order_id, o.order_date, SUM(od.quantity * od.price) AS total_amount_spent " +
                       "FROM orders o " +
                       "JOIN order_details od ON o.order_id = od.order_id " +
                       "GROUP BY o.order_id, o.order_date";
        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("OrderID: " + rs.getInt("order_id") +
                                   ", OrderDate: " + rs.getDate("order_date") +
                                   ", Total Amount Spent: " + rs.getDouble("total_amount_spent"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to find products supplied by more than one supplier
    public void findProductsSuppliedByMultipleSuppliers() {
        String query = "SELECT p.product_id, product_name, COUNT(DISTINCT p.supplier_id) AS number_of_suppliers " +
                       "FROM products p " +
                       "GROUP BY p.product_id, p.product_name " +
                       "HAVING COUNT(DISTINCT p.supplier_id) > 1";
        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("ProductID: " + rs.getInt("product_id") +
                                   ", Product: " + rs.getString("product_name") +
                                   ", Number of Suppliers: " + rs.getInt("number_of_suppliers"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to get the average inventory level for each product
    public void getAverageInventoryLevel() {
        String query = "SELECT product_name, AVG(i.quantity_on_hand) AS average_inventory_level " +
                       "FROM products p " +
                       "JOIN inventry i ON p.product_id = i.inventry_product_id " +
                       "GROUP BY p.product_id, p.product_name";
        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("Product: " + rs.getString("product_name") +
                                   ", Average Inventory Level: " + rs.getDouble("average_inventory_level"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to list suppliers who have not supplied any products
    public void listSuppliersWithNoProducts() {
        String query = "SELECT s.supplier_id, s.supplier_name, s.contact_info, s.address " +
                       "FROM suppliers s " +
                       "LEFT JOIN products p ON s.supplier_id = p.supplier_id " +
                       "WHERE p.supplier_id IS NULL";
        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("SupplierID: " + rs.getInt("supplier_id") +
                                   ", Name: " + rs.getString("supplier_name") +
                                   ", Contact: " + rs.getString("contact_info") +
                                   ", Address: " + rs.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to close the database connection
    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}