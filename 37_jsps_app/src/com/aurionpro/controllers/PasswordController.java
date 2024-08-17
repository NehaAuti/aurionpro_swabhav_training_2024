package com.aurionpro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PasswordController")
public class PasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public PasswordController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

        // Get the cookie array from the request
        Cookie[] cookies = request.getCookies();

        // Directly access the first cookie (assuming it's always the username cookie)
        String username = cookies[1].getValue();
        
        // Get the password parameter
        String password = request.getParameter("password");

        // Display the username and password
        response.getWriter().print("Username: " + username);
        response.getWriter().print("<br>Password: " + password);
		
		
//		Cookie cookies[] =request.getCookies();
		//String username = request.getParameter("username");
		
	//	String password = request.getParameter("password");		
		//for(int i=0;i<cookies;i++)
//		System.out.println(cookies[0].getName());
//		response.getWriter().print("Username"+cookies[0].getValue());
//		response.getWriter().print("Password"+password);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
