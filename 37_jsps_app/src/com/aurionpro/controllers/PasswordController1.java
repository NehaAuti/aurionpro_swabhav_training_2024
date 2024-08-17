package com.aurionpro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PasswordController1")
public class PasswordController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PasswordController1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// Retrieve the session
        HttpSession session = request.getSession(false);
        
        // Get the username from the session
        String username = (session != null) ? (String) session.getAttribute("username") : "Unknown";
        
        // Get the password parameter
        String password = request.getParameter("password");

        // Display the username and password
        response.setContentType("text/html");
        response.getWriter().print("Username: " + username);
        response.getWriter().print("<br>Password: " + password);
        
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
