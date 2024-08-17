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

@WebServlet("/EditProfileController")
public class EditProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDao customerDao = new CustomerDao();

    public EditProfileController() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customerIdStr = request.getParameter("customerId");

        if (customerIdStr != null && !customerIdStr.isEmpty()) {
            int customerId = Integer.parseInt(customerIdStr);
            
            Customer customer = customerDao.getCustomerById(customerId);
            if (customer != null) {
                request.setAttribute("customer", customer);
            } else {
                request.setAttribute("message", "Customer not found.");
            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("EditProfile.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customerIdStr = request.getParameter("customerId");
        String firstName = request.getParameter("customerFirstName");
        String lastName = request.getParameter("customerLastName");
        String currentPassword = request.getParameter("currentPassword");
        String newPassword = request.getParameter("password");

        String errorMsg = "";

        // Validate passwords
        if (currentPassword.length() < 8) {
            errorMsg += "Current password must be at least 8 characters long.<br/>";
        }
        if (newPassword.length() < 8) {
            errorMsg += "New password must be at least 8 characters long.<br/>";
        }
        if (!newPassword.matches(".*[A-Z].*")) {
            errorMsg += "New password must contain at least one uppercase letter.<br/>";
        }
        if (!newPassword.matches(".*[a-z].*")) {
            errorMsg += "New password must contain at least one lowercase letter.<br/>";
        }
        if (!newPassword.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            errorMsg += "New password must contain at least one special character.<br/>";
        }

        if (!errorMsg.isEmpty()) {
            // Set error message and forward back to the form
            request.setAttribute("message", errorMsg);
            request.setAttribute("customerId", customerIdStr);
            request.setAttribute("customerFirstName", firstName);
            request.setAttribute("customerLastName", lastName);
            request.getRequestDispatcher("EditProfile.jsp").forward(request, response);
            return;
        }

        if (customerIdStr != null && !customerIdStr.isEmpty()) {
            int customerId = Integer.parseInt(customerIdStr);

            Customer customer = customerDao.getCustomerById(customerId);
            if (customer != null) {
                // Check current password
                if (customer.getPassword().equals(currentPassword)) {
                    customer.setCustomerFirstName(firstName);
                    customer.setCustomerLastName(lastName);
                    customer.setPassword(newPassword);

                    boolean isUpdated = customerDao.updateCustomer(customer);

                    if (isUpdated) {
                        request.setAttribute("message", "Profile updated successfully.");
                    } else {
                        request.setAttribute("message", "Error updating profile. Please try again.");
                    }
                } else {
                    request.setAttribute("message", "Current password is incorrect.");
                }
            } else {
                request.setAttribute("message", "Invalid customer ID.");
            }
        } else {
            request.setAttribute("message", "Invalid customer ID.");
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("EditProfile.jsp");
        dispatcher.forward(request, response);
    }
}