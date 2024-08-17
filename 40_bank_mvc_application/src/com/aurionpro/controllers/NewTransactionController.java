package com.aurionpro.controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aurionpro.entity.Customer;
import com.aurionpro.entity.Transaction;
import com.aurionpro.model.PassbookDao;
import com.aurionpro.model.TransactionDao;
@WebServlet("/NewTransactionController")

public class NewTransactionController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private PassbookDao passbookDao = new PassbookDao();

    public NewTransactionController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("customer") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        // Get logged-in customer account number
        Customer customer = (Customer) session.getAttribute("customer");
        int customerId = customer.getCustomerId(); // Assuming getCustomerId() is the method to get the ID

        // Fetch customer account numbers
        List<String> accountNumbers = passbookDao.getAccountNumbersByCustomerId(customerId);
        if (accountNumbers.isEmpty()) {
            request.setAttribute("errorMessage", "No account found for the customer.");
            request.getRequestDispatcher("NewTransaction.jsp").forward(request, response);
            return;
        }

        String fromAccount = accountNumbers.get(0); // Assuming you get the first account number

        // Get the balance and pass it to JSP
        BigDecimal balance = passbookDao.getBalanceByAccountNumber(fromAccount);
        request.setAttribute("balance", balance);

        // Forward to JSP
        request.getRequestDispatcher("NewTransaction.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("customer") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        // Get parameters from request
        String transactionType = request.getParameter("transactionType");
        String toAccount = request.getParameter("toAccount");
        String amountStr = request.getParameter("amount");

        // Validate input parameters
        if (transactionType == null || amountStr == null) {
            request.setAttribute("errorMessage", "All fields are required.");
            request.getRequestDispatcher("NewTransaction.jsp").forward(request, response);
            return;
        }

        if (transactionType.equalsIgnoreCase("Transfer") && (toAccount == null || toAccount.isEmpty() || toAccount.equals("0"))) {
            request.setAttribute("errorMessage", "Receiver account number is required for transfers.");
            request.getRequestDispatcher("NewTransaction.jsp").forward(request, response);
            return;
        }

        BigDecimal amount;
        try {
            amount = new BigDecimal(amountStr);
        } catch (NumberFormatException e) {
            request.setAttribute("errorMessage", "Invalid amount format.");
            request.getRequestDispatcher("NewTransaction.jsp").forward(request, response);
            return;
        }

        // Get logged-in customer account number
        Customer customer = (Customer) session.getAttribute("customer");
        int customerId = customer.getCustomerId(); // Assuming getCustomerId() is the method to get the ID

        // Fetch customer account numbers
        List<String> accountNumbers = passbookDao.getAccountNumbersByCustomerId(customerId);
        if (accountNumbers.isEmpty()) {
            request.setAttribute("errorMessage", "No account found for the customer.");
            request.getRequestDispatcher("NewTransaction.jsp").forward(request, response);
            return;
        }

        String fromAccount = accountNumbers.get(0); // Assuming you get the first account number

        // Check if the balance is sufficient
        BigDecimal balance = passbookDao.getBalanceByAccountNumber(fromAccount);
        if (amount.compareTo(balance) > 0 && !transactionType.equalsIgnoreCase("Transfer")) {
            request.setAttribute("errorMessage", "Insufficient balance.");
            request.setAttribute("balance", balance);
            request.getRequestDispatcher("NewTransaction.jsp").forward(request, response);
            return;
        }

        // Create a new Transaction object
        Transaction transaction = new Transaction();
        transaction.setSenderAccno(fromAccount);
        transaction.setReceiverAccno(transactionType.equalsIgnoreCase("Transfer") ? toAccount : "0");
        transaction.setTransactionType(transactionType);
        transaction.setAmount(amount);
        transaction.setTransactionDate(new Date(System.currentTimeMillis()));

        // Save the transaction
        passbookDao.saveTransaction(transaction);

        // Redirect to customer home page
        response.sendRedirect("customerHome.jsp");
    }
}