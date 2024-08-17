package com.aurionpro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.entity.Customer;
import com.aurionpro.model.UserDao;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao = new UserDao();
    public LoginController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        String role = request.getParameter("role");

	        if ("admin".equals(role)) {
	            // Admin login
	            if (userDao.validateAdmin(username, password)) {
	                HttpSession session = request.getSession();
	                session.setAttribute("role", "admin");
	                response.sendRedirect("adminHome.jsp");
	            } else {
	                request.setAttribute("errorMessage", "Invalid admin credentials");
	                request.getRequestDispatcher("login.jsp").forward(request, response);
	            }
	        } else if ("customer".equals(role)) {
	            // Customer login
	            Customer customer = userDao.getCustomerByEmailAndPassword(username, password);
	            if (customer != null) {
	                HttpSession session = request.getSession();
	                session.setAttribute("customer", customer);
	                response.sendRedirect("customerHome.jsp");
	            } else {
	                request.setAttribute("errorMessage", "Invalid customer credentials");
	                request.getRequestDispatcher("login.jsp").forward(request, response);
	            }
	        } else {
	            request.setAttribute("errorMessage", "Invalid role selected");
	            request.getRequestDispatcher("login.jsp").forward(request, response);
	        }
	    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
