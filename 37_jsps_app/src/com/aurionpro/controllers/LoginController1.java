package com.aurionpro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginController1")
public class LoginController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginController1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Retrieve the username from the request
        String username = request.getParameter("username");

        // Create or retrieve the session
        HttpSession session = request.getSession();
        session.setAttribute("username", username);

        // Generate the HTML form for password input
        response.setContentType("text/html");
        response.getWriter().print("<form action='PasswordController' method='post'>");
        response.getWriter().print("Password: <input type='password' name='password'><br>");
        response.getWriter().print("<input type='submit' value='Go'></form>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
