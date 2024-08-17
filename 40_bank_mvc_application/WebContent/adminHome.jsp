<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<!-- Custom CSS for styling -->
<style>
    body {
        background-color: #f0f8ff; /* Light pastel blue background */
    }
    .container {
        background-color: #ffffff; /* White background for the container */
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        padding: 30px;
    }
    .list-group-item-action {
        border-radius: 5px;
    }
    .list-group-item-action:hover {
        background-color: #007bff;
        color: white;
    }
    .btn-danger {
        border-radius: 5px;
    }
</style>
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">Welcome Admin</h2>
        <p class="text-center">Manage the bank system here.</p>
        <div class="list-group">
            <a href="AddBankAccountController" class="list-group-item list-group-item-action">Add Bank Account</a>
            <a href="AddCustomerController" class="list-group-item list-group-item-action">Add Customer</a>
            <a href="ViewCustomersController" class="list-group-item list-group-item-action">View Customers</a>
            <a href="ViewTransactionsController" class="list-group-item list-group-item-action">View Transactions</a>
        </div>
        <div class="mt-3 text-center">
            <a href="LogoutController" class="btn btn-danger">Logout</a>
        </div>
    </div>
</body>
</html>