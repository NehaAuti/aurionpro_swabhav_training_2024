package com.aurionpro.controllers;

import java.io.IOException;


import java.sql.Connection;
import java.sql.Date;
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
import com.aurionpro.entity.Transaction;
import com.aurionpro.model.DbUtil;
import com.aurionpro.model.TransactionDao;

@WebServlet("/ViewTransactionsController")
public class ViewTransactionsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TransactionDao transactionDao = new TransactionDao();
    public ViewTransactionsController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String transactionType = request.getParameter("transactionType");
	        String startDateParam = request.getParameter("startDate");
	        String endDateParam = request.getParameter("endDate");
	        String sortOrder = request.getParameter("sortOrder");

	        Date startDate = null;
	        Date endDate = null;
	        if (startDateParam != null && !startDateParam.isEmpty()) {
	            startDate = Date.valueOf(startDateParam);
	        }
	        if (endDateParam != null && !endDateParam.isEmpty()) {
	            endDate = Date.valueOf(endDateParam);
	        }

	        List<Transaction> transactions = transactionDao.getTransactions(transactionType, startDate, endDate, sortOrder);
	        request.setAttribute("transactions", transactions);
	        request.getRequestDispatcher("ViewTransactions.jsp").forward(request, response);
	    }

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

	