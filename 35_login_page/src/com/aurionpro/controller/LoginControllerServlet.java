package com.aurionpro.controller;

import java.io.IOException; 
import java.io.PrintWriter; 
 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
 
/** 
 * Servlet implementation class LoginControllerServlet 
 */ 
@WebServlet("/LoginControllerServlet") 
public class LoginControllerServlet extends HttpServlet { 
 private static final long serialVersionUID = 1L; 
        
    /** 
     * @see HttpServlet#HttpServlet() 
     */ 
    public LoginControllerServlet() { 
        super(); 
        // TODO Auto-generated constructor stub 
    } 
 
 /** 
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) 
  */ 
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
   
//   response.setContentType("text/html"); 
//   PrintWriter writer = response.getWriter(); 
//    
//   String username = request.getParameter("username"); 
//      String password = request.getParameter("password"); 
//       
//      if ("admin".equals(username) && "password123".equals(password)) { 
//             response.getWriter().println("<h2>Login successful!</h2>"); 
//         } else { 
//             response.getWriter().println("<h2>Login failed. Invalid username or password.</h2>"); 
//         } 
 
         
  response.getWriter().append("Served at: ").append(request.getContextPath()); 
 } 
 
 /** 
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) 
  */ 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
  // TODO Auto-generated method stub 
   
   response.setContentType("text/html"); 
   PrintWriter writer = response.getWriter(); 
    
      String username = request.getParameter("username"); 
      String password = request.getParameter("password"); 
       
      if ("admin".equals(username) && "password123".equals(password)) { 
             response.getWriter().println("<h2>Login successful!</h2>"); 
         } else { 
             response.getWriter().println("<h2>Login failed. Invalid username or password.</h2>"); 
         } 
 
//  doGet(request, response); 
 } 
 
}