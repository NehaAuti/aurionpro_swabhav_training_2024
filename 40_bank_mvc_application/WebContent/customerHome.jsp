<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.aurionpro.entity.Customer" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #e6f7ff;
        }
        .container {
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 30px;
        }
        .list-group-item-action:hover {
            background-color: #007bff;
            color: white;
        }
    </style>
</head>
<body>

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="customerHome.jsp">Banking System</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link" href="customerHome.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="ViewTransactionsController">Passbook</a></li>
                <li class="nav-item"><a class="nav-link" href="NewTransactionController">New Transaction</a></li>
                <li class="nav-item"><a class="nav-link" href="EditProfileController">Edit Profile</a></li>
                <li class="nav-item"><a class="nav-link text-danger" href="LogoutController">Logout</a></li>
            </ul>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link disabled">Welcome, <%= ((Customer) session.getAttribute("customer")).getCustomerFirstName() %></a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="container mt-5">
        <h2 class="text-center">Customer Home</h2>
        <div class="list-group">
            <a href="PassbookController" class="list-group-item list-group-item-action">Passbook</a>
            <a href="NewTransactionController" class="list-group-item list-group-item-action">New Transaction</a>
            <a href="EditProfileController" class="list-group-item list-group-item-action">Edit Profile</a>
        </div>
        <div class="mt-3 text-center">
            <a href="LogoutController" class="btn btn-danger">Logout</a>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>