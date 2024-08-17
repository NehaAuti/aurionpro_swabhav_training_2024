package com.aurionpro.controllers;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.entity.Customer;
import com.aurionpro.model.CustomerDao;
import com.aurionpro.model.CustomerDao1;

@WebServlet("/AddCustomerController")
public class AddCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDao customerDao = new CustomerDao();
	private CustomerDao1 customerDao1 = new CustomerDao1();
    public AddCustomerController() {
        super();
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        double balance;

        // Validate first name and last name
        if (firstName == null || lastName == null || !firstName.matches("[A-Za-z]+") || !lastName.matches("[A-Za-z]+")) {
            request.setAttribute("message", "First name and last name must contain only letters.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("AddCustomer.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // Validate email
        if (email == null || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            request.setAttribute("message", "Email must be in a valid format and contain only allowed characters.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("AddCustomer.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // Check if email already exists
        if (customerDao.emailExists(email)) { // Assuming emailExists method exists in CustomerDao1
            request.setAttribute("message", "Email ID is already registered.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("AddCustomer.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // Validate password
        if (password == null || !password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")) {
            request.setAttribute("message", "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one digit, and one special character.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("AddCustomer.jsp");
            dispatcher.forward(request, response);
            return;
        }

        try {
            String balanceStr = request.getParameter("balance");
            if (balanceStr == null) {
                throw new NumberFormatException();
            }
            balance = Double.parseDouble(balanceStr);
            if (balance < 5000) {
                request.setAttribute("message", "Balance must be at least 5000.");
                RequestDispatcher dispatcher = request.getRequestDispatcher("AddCustomer.jsp");
                dispatcher.forward(request, response);
                return;
            }
        } catch (NumberFormatException e) {
            request.setAttribute("message", "Invalid balance value.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("AddCustomer.jsp");
            dispatcher.forward(request, response);
            return;
        }

        Customer newCustomer = new Customer();
        newCustomer.setCustomerFirstName(firstName);
        newCustomer.setCustomerLastName(lastName);
        newCustomer.setEmailId(email);
        newCustomer.setPassword(password);
        newCustomer.setBalance(balance);

        // Check if customerDao is not null and add customer
        if (customerDao != null) {
            boolean isAdded = customerDao.addCustomer(newCustomer);
            if (isAdded) {
                request.setAttribute("message", "Customer added successfully!");
                RequestDispatcher dispatcher = request.getRequestDispatcher("adminHome.jsp");
                dispatcher.forward(request, response);
            } else {
                request.setAttribute("message", "Error adding customer. Please try again.");
                RequestDispatcher dispatcher = request.getRequestDispatcher("AddCustomer.jsp");
                dispatcher.forward(request, response);
            }
        } else {
            throw new ServletException("CustomerDao is not initialized.");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}