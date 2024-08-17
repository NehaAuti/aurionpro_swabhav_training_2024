package com.aurionpro.controllers;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.entity.Customer;
import com.aurionpro.model.CustomerDao;
import com.aurionpro.model.DbUtil;

@WebServlet("/ViewCustomersController")
public class ViewCustomersController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CustomerDao customerDao = new CustomerDao();


    public ViewCustomersController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    

    	String customerIdParam = request.getParameter("customerId");
        String firstNameParam = request.getParameter("firstName");

        List<Customer> customers;

        if (customerIdParam != null && !customerIdParam.isEmpty()) {
            int customerId = Integer.parseInt(customerIdParam);
            customers = new ArrayList<>();
            Customer customer = customerDao.getCustomerById(customerId);
            if (customer != null) {
                customers.add(customer);
            }
        } else if (firstNameParam != null && !firstNameParam.isEmpty()) {
            customers = customerDao.getCustomersByFirstName(firstNameParam);
        } else {
            customers = customerDao.getAllCustomers();
        }

        request.setAttribute("customers", customers);
        request.getRequestDispatcher("ViewCustomers.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}