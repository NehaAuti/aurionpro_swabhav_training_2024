package com.aurionpro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.entity.Customer;
import com.aurionpro.model.CustomerDao;

@WebServlet("/SearchCustomerController")
public class SearchCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDao customerDao = new CustomerDao();

    public SearchCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        
		int customerId = Integer.parseInt(request.getParameter("customerId"));
        Customer customer = customerDao.getCustomerById(customerId);

        if (customer != null) {
            request.setAttribute("customer", customer);
            request.getRequestDispatcher("AddBankAccount.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "Customer not found");
            request.getRequestDispatcher("AddBankAccount.jsp").forward(request, response);
        }
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
