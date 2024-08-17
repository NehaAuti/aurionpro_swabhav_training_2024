package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aurionpro.entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDao {

    private Connection connection;

    public UserDao() {
        connection = DbUtil.getConnection();
    }

    public boolean validateCustomer(String email, String password) {
        boolean isValid = false;
        String sql = "SELECT * FROM customer WHERE email_id = ? AND password = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, email);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    isValid = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Log exception
        }
        return isValid;
    }

    // Get customer name by email
    public String getCustomerNameByEmail(String email) {
        String customerName = null;
        String sql = "SELECT CONCAT(customer_first_name, ' ', customer_last_name) AS full_name FROM customer WHERE email_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, email);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    customerName = rs.getString("full_name");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Log exception
        }
        return customerName;
    }


        // Validate customer login
        public Customer getCustomerByEmailAndPassword(String email, String password) {
            Customer customer = null;
            String sql = "SELECT * FROM customer WHERE email_id = ? AND password = ?";
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, email);
                ps.setString(2, password);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        customer = new Customer();
                        customer.setCustomerId(rs.getInt("customer_id"));
                        customer.setCustomerFirstName(rs.getString("customer_first_name"));
                        customer.setCustomerLastName(rs.getString("customer_last_name"));
                        customer.setEmailId(rs.getString("email_id"));
                        customer.setPassword(rs.getString("password"));
                        // Set additional fields if needed
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Log exception
            }
            return customer;
        }

        // Validate admin login
        public boolean validateAdmin(String username, String password) {
            boolean isValid = false;
            String sql = "SELECT * FROM users WHERE username = ? AND password = ? AND role = 'admin'";
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setString(1, username);
                ps.setString(2, password);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        isValid = true;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Log exception
            }
            return isValid;
        }
    }
