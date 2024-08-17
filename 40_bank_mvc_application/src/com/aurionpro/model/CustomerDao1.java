package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aurionpro.entity.Customer;

public class CustomerDao1 {
	  private Connection connection;

	    public CustomerDao1() {
	        connection = DbUtil.getConnection();
	    }

	    public boolean addCustomer(Customer customer) {
	        String sql = "INSERT INTO customer (customerFirstName, customerLastName, emailId, password) VALUES (?, ?, ?, ?)";
	        try (PreparedStatement ps = connection.prepareStatement(sql)) {
	            ps.setString(1, customer.getCustomerFirstName());
	            ps.setString(2, customer.getCustomerLastName());
	            ps.setString(3, customer.getEmailId());
	            ps.setString(4, customer.getPassword());

	            int rowsAffected = ps.executeUpdate();
	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	}