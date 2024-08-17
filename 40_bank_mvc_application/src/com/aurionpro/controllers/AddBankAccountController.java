package com.aurionpro.controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.entity.BankAccount;
import com.aurionpro.entity.Customer;
import com.aurionpro.model.BankAccountDao;
import com.aurionpro.model.CustomerDao;
import com.aurionpro.model.DbUtil;

@WebServlet("/AddBankAccountController")
public class AddBankAccountController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BankAccountDao bankAccountDao = new BankAccountDao();
    public AddBankAccountController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 
    	        String customerIdParam = request.getParameter("customerId");
    	        int customerId = 0;
    	        try {
    	            if (customerIdParam != null && !customerIdParam.isEmpty()) {
    	                customerId = Integer.parseInt(customerIdParam);
    	                CustomerDao customerDao = new CustomerDao();
    	                Customer customer = customerDao.getCustomerById(customerId);
    	                request.setAttribute("customer", customer);
    	                request.getRequestDispatcher("AddBankAccount.jsp").forward(request, response);
    	            } else {
    	                request.setAttribute("error", "Customer ID is required.");
    	                request.getRequestDispatcher("AddBankAccount.jsp").forward(request, response);
    	            }
    	        } catch (NumberFormatException e) {
    	            request.setAttribute("error", "Invalid Customer ID format.");
    	            request.getRequestDispatcher("AddBankAccount.jsp").forward(request, response);
    	        }
    	    }

    	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	        String customerIdParam = request.getParameter("customerId");
    	        String accountType = request.getParameter("accountType");
    	        String balanceParam = request.getParameter("balance");
    	        int customerId = 0;
    	        BigDecimal balance;

    	        try {
    	            if (customerIdParam != null && !customerIdParam.isEmpty()) {
    	                customerId = Integer.parseInt(customerIdParam);
    	            } else {
    	                request.setAttribute("error", "Customer ID is required.");
    	                request.getRequestDispatcher("AddBankAccount.jsp").forward(request, response);
    	                return;
    	            }

    	            // Validate and convert balance
    	            try {
    	                balance = new BigDecimal(balanceParam);
    	                if (balance.compareTo(new BigDecimal("5000.00")) < 0) {
    	                    throw new IllegalArgumentException("Initial deposit cannot be less than 5000.");
    	                }
    	                if (balance.signum() == -1) {
    	                    throw new IllegalArgumentException("Initial deposit cannot be negative.");
    	                }
    	            } catch (NumberFormatException e) {
    	                request.setAttribute("error", "Invalid balance value.");
    	                request.getRequestDispatcher("AddBankAccount.jsp").forward(request, response);
    	                return;
    	            }

    	            // Add bank account
    	            String accountNumber = bankAccountDao.addBankAccount(customerId, accountType, balance.toString());
    	            request.setAttribute("accountNumber", accountNumber);
    	            request.getRequestDispatcher("AddBankAccountSuccess.jsp").forward(request, response);

    	        } catch (NumberFormatException e) {
    	            request.setAttribute("error", "Invalid Customer ID format.");
    	            request.getRequestDispatcher("AddBankAccount.jsp").forward(request, response);
    	        } catch (IllegalArgumentException e) {
    	            request.setAttribute("error", e.getMessage());
    	            request.getRequestDispatcher("AddBankAccount.jsp").forward(request, response);
    	        } catch (Exception e) {
    	            request.setAttribute("error", "Error adding bank account. Please try again.");
    	            request.getRequestDispatcher("AddBankAccount.jsp").forward(request, response);
    	        }
    	    }
    	}