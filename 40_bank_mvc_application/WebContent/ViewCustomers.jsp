<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ page import="java.util.List" %>
<%@ page import="com.aurionpro.entity.Customer" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customers List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f0f8ff; /* Light pastel background */
        }
        .container {
            background-color: #ffffff; /* White background for the container */
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            margin-top: 50px;
        }
        h2 {
            color: #333333; /* Darker heading color */
        }
        .table {
            margin-top: 20px;
        }
        .btn-primary {
            margin-top: 30px; /* Adjust margin for better alignment */
        }
        .form-row {
            align-items: center; /* Vertically align form elements */
        }
        .form-group {
            margin-bottom: 0; /* Remove bottom margin for alignment */
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Customers List</h2>
        
        <form action="ViewCustomersController" method="get" class="mb-4">
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="customerId">Customer ID:</label>
                    <input type="text" class="form-control" id="customerId" name="customerId">
                </div>
                <div class="form-group col-md-4">
                    <label for="firstName">First Name:</label>
                    <input type="text" class="form-control" id="firstName" name="firstName">
                </div>
                <div class="form-group col-md-4">
                    <button type="submit" class="btn btn-primary">Search</button>
                </div>
            </div>
        </form>

        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Customer ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email ID</th>
                    <th>Balance</th> <!-- Added Balance column -->
                </tr>
            </thead>
            <tbody>
                <c:forEach var="customer" items="${customers}">
                    <tr>
                        <td>${customer.customerId}</td>
                        <td>${customer.customerFirstName}</td>
                        <td>${customer.customerLastName}</td>
                        <td>${customer.emailId}</td>
                        <td>${customer.balance}</td> <!-- Display balance -->
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="adminHome.jsp" class="btn btn-primary">Back to Admin Home</a>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>