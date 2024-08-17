<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.aurionpro.entity.Customer" %>
    <%@ page import="com.aurionpro.model.BankAccountDao" %>
    <%@ page import="java.math.BigDecimal" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>New Transaction</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f0f8ff;
        }
        .container {
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            max-width: 600px;
            margin: auto;
        }
        h2 {
            color: #333333;
        }
        .form-group label {
            font-weight: bold;
        }
        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
            margin-right: 10px;
        }
        .alert-danger {
            margin-top: 20px;
        }
    </style>
    <script>
        function toggleReceiverAccount() {
            var transactionType = document.getElementById("transactionType").value;
            var receiverAccountField = document.getElementById("toAccountField");
            if (transactionType === "Transfer") {
                receiverAccountField.style.display = "block";
            } else {
                receiverAccountField.style.display = "none";
            }
        }

        function checkBalance() {
            var amount = parseFloat(document.getElementById("amount").value);
            var balance = parseFloat(document.getElementById("balance").value);

            if (amount > balance) {
                alert("Insufficient balance.");
                return false; // Prevent form submission
            }
            return true; // Allow form submission
        }
    </script>
</head>
<body>
    <div class="container mt-5">
        <h2>New Transaction</h2>
        <% 
            String errorMessage = (String) request.getAttribute("errorMessage");
            BigDecimal balance = (BigDecimal) request.getAttribute("balance");
        %>
        <% if (errorMessage != null) { %>
            <div class="alert alert-danger">
                <%= errorMessage %>
            </div>
        <% } %>
        <form action="NewTransactionController" method="post" onsubmit="return checkBalance()">
            <div class="form-group">
                <label for="transactionType">Type of Transaction:</label>
                <select class="form-control" id="transactionType" name="transactionType" onchange="toggleReceiverAccount()" required>
                    <option value="Credit">Credit</option>
                    <option value="Debit">Debit</option>
                    <option value="Transfer">Transfer</option>
                </select>
            </div>
            <div class="form-group" id="toAccountField" style="display:none;">
                <label for="toAccount">Receiver Account Number:</label>
                <input type="text" class="form-control" id="toAccount" name="toAccount">
            </div>
            <div class="form-group">
                <label for="amount">Amount:</label>
                <input type="number" class="form-control" id="amount" name="amount" required>
            </div>
            <input type="hidden" id="balance" value="<%= balance %>"> <!-- Displaying balance -->
            <button type="submit" class="btn btn-primary">Submit</button>
            <a href="customerHome.jsp" class="btn btn-secondary">Back</a>
        </form>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>