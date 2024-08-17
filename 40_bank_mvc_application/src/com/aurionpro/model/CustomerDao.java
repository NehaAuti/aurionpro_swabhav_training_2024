package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.entity.Customer;

public class CustomerDao {
    private Connection connection;

    public CustomerDao() {
        this.connection = DbUtil.getConnection();
    }

    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        String sql = "SELECT * FROM customer";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setCustomerId(resultSet.getInt("customer_id"));
                customer.setCustomerFirstName(resultSet.getString("customer_first_name"));
                customer.setCustomerLastName(resultSet.getString("customer_last_name"));
                customer.setEmailId(resultSet.getString("email_id"));
                customer.setPassword(resultSet.getString("password"));
                customer.setBalance(resultSet.getDouble("balance"));  // Set balance
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public boolean addCustomer(Customer customer) {
        String sql = "INSERT INTO customer (customer_first_name, customer_last_name, email_id, password, balance) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, customer.getCustomerFirstName());
            ps.setString(2, customer.getCustomerLastName());
            ps.setString(3, customer.getEmailId());
            ps.setString(4, customer.getPassword());
            ps.setDouble(5, customer.getBalance());  // Insert balance

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Customer getCustomerById(int customerId) {
        String sql = "SELECT * FROM customer WHERE customer_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, customerId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Customer customer = new Customer();
                customer.setCustomerId(rs.getInt("customer_id"));
                customer.setCustomerFirstName(rs.getString("customer_first_name"));
                customer.setCustomerLastName(rs.getString("customer_last_name"));
                customer.setEmailId(rs.getString("email_id"));
                customer.setPassword(rs.getString("password"));
                customer.setBalance(rs.getDouble("balance"));  // Get balance
                return customer;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean updateCustomer(Customer customer) {
        String query = "UPDATE customer SET customer_first_name = ?, customer_last_name = ?, password = ? WHERE customer_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, customer.getCustomerFirstName());
            stmt.setString(2, customer.getCustomerLastName());
            stmt.setString(3, customer.getPassword());
            stmt.setInt(4, customer.getCustomerId());

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Customer> getCustomersByFirstName(String firstName) {
        List<Customer> customers = new ArrayList<>();
        String sql = "SELECT * FROM customer WHERE customer_first_name LIKE ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, "%" + firstName + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setCustomerId(rs.getInt("customer_id"));
                customer.setCustomerFirstName(rs.getString("customer_first_name"));
                customer.setCustomerLastName(rs.getString("customer_last_name"));
                customer.setEmailId(rs.getString("email_id"));
                customer.setPassword(rs.getString("password"));
                customer.setBalance(rs.getDouble("balance"));
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    // New method to check if email already exists
    public boolean emailExists(String email) {
        String sql = "SELECT COUNT(*) FROM customer WHERE email_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}