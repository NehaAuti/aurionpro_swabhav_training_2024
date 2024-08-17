<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
     <title>Add Customer</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<!-- Custom CSS -->
<style>
    body {
        background-color: #f8f9fa;
        font-family: Arial, sans-serif;
    }
    .container {
        margin-top: 50px;
        max-width: 500px;
        padding: 20px;
        background-color: white;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        border-radius: 8px;
    }
    .form-group label {
        font-weight: bold;
    }
    .form-control {
        border-radius: 5px;
    }
    .btn-primary {
        background-color: #007bff;
        border: none;
    }
    .btn-primary:hover {
        background-color: #0056b3;
    }
    .message {
        color: red;
        font-weight: bold;
    }
</style>
<script>
    function validateForm() {
        var firstName = document.getElementById('firstName').value;
        var lastName = document.getElementById('lastName').value;
        var email = document.getElementById('email').value;
        var password = document.getElementById('password').value;
        var balance = parseFloat(document.getElementById('balance').value);

        // Validate first name and last name
        var nameRegex = /^[A-Za-z]+$/;
        if (!nameRegex.test(firstName) || !nameRegex.test(lastName)) {
            alert('First name and last name must contain only letters.');
            return false;
        }

        // Validate email
        var emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
        if (!emailRegex.test(email)) {
            alert('Email must be in a valid format and contain only allowed characters.');
            return false;
        }

        // Validate password
        var passwordRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
        if (!passwordRegex.test(password)) {
            alert('Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one digit, and one special character.');
            return false;
        }

        // Validate balance
        if (isNaN(balance) || balance < 5000) {
            alert('Balance must be a number and cannot be less than 5000.');
            return false;
        }

        return true;
    }
</script>
</head>
<body>
    <div class="container">
        <h2 class="text-center">Add New Customer</h2>
        <form action="AddCustomerController" method="post" onsubmit="return validateForm();">
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" class="form-control" name="firstName" id="firstName" required>
            </div>
            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" class="form-control" name="lastName" id="lastName" required>
            </div>
            <div class="form-group">
                <label for="email">Email ID:</label>
                <input type="email" class="form-control" name="email" id="email" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control" name="password" id="password" required>
            </div>
            <div class="form-group">
                <label for="balance">Balance:</label>
                <input type="number" class="form-control" name="balance" id="balance" step="0.01" min="5000" value="5000" required>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Add Customer</button>
        </form>
        <p class="message mt-3"><%= request.getAttribute("message") != null ? request.getAttribute("message") : "" %></p>
        <a href="adminHome.jsp" class="btn btn-primary">Back to Admin Home</a>
    </div>
    <!-- Bootstrap JS and dependencies (optional but recommended) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>