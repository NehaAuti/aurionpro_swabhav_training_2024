package com.aurionpro.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.entity.Customer;
import com.aurionpro.entity.Passbook;
import com.aurionpro.model.PassbookDao;


@WebServlet("/PassbookController")
public class PassbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PassbookDao passbookDao = new PassbookDao();
    public PassbookController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession(false);
		    if (session == null || session.getAttribute("customer") == null) {
		        response.sendRedirect("login.jsp");
		        return;
		    }

		    Customer customer = (Customer) session.getAttribute("customer");
		    List<String> accountNumbers = passbookDao.getAccountNumbersByCustomerId(customer.getCustomerId());

		    String receiverAccountNumber = request.getParameter("receiverAccountNumber");
		    String startDateParam = request.getParameter("startDate");
		    String endDateParam = request.getParameter("endDate");
		    String sortOrder = request.getParameter("sortOrder");
		    String accountStatus = request.getParameter("accountStatus");

		    Date startDate = null;
		    Date endDate = null;
		    if (startDateParam != null && !startDateParam.isEmpty()) {
		        startDate = Date.valueOf(startDateParam);
		    }
		    if (endDateParam != null && !endDateParam.isEmpty()) {
		        endDate = Date.valueOf(endDateParam);
		    }

		    List<Passbook> transactions = passbookDao.getTransactionsByAccounts(accountNumbers, receiverAccountNumber, startDate, endDate, sortOrder, accountStatus);
		    request.setAttribute("passbookEntries", transactions);
		    request.getRequestDispatcher("passbook.jsp").forward(request, response);
		}
	
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        doGet(request, response);
	    }
	}