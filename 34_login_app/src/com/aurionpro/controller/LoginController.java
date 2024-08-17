package com.aurionpro.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 // Retrieve username and password from form submission
        String username = request.getParameter("nehaauti05@gmail.com");
        String password = request.getParameter("0512Neha");

        // Simple authentication check (for demonstration purposes)
        if ("admin".equals(username) && "password123".equals(password)) {
            // Successful login
            response.setContentType("text/html");
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h1>Welcome, " + username + "!</h1>");
            response.getWriter().println("<a href='index.html'>Go to Home</a>");
            response.getWriter().println("</body></html>");
        } else {
            // Login failed
            response.setContentType("text/html");
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h1>Invalid credentials, please try again.</h1>");
            response.getWriter().println("<a href='index.html'>Back to Login</a>");
            response.getWriter().println("</body></html>");
        }
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
