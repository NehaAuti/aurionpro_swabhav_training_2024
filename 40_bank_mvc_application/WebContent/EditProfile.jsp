<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Profile</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
    body {
        background-color: #f0f8ff; /* Light pastel color for background */
    }
    .container {
        background-color: #ffffff; /* White background for container */
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        padding: 20px;
        max-width: 600px; /* Limit the width of the container */
        margin: auto;
    }
    h2 {
        color: #333333; /* Darker color for heading */
    }
    .form-group label {
        font-weight: bold;
    }
    .btn-primary {
        background-color: #007bff;
        border-color: #007bff;
        margin-right: 10px;
    }
    .alert-info {
        margin-top: 20px;
    }
</style>
<script>
    function validatePassword() {
        var password = document.getElementById('password').value;
        var errorMsg = '';

        var minLength = /.{8,}/;
        var uppercase = /[A-Z]/;
        var lowercase = /[a-z]/;
        var specialChar = /[!@#$%^&*(),.?":{}|<>]/;

        if (!minLength.test(password)) {
            errorMsg += 'Password must be at least 8 characters long.\n';
        }
        if (!uppercase.test(password)) {
            errorMsg += 'Password must contain at least one uppercase letter.\n';
        }
        if (!lowercase.test(password)) {
            errorMsg += 'Password must contain at least one lowercase letter.\n';
        }
        if (!specialChar.test(password)) {
            errorMsg += 'Password must contain at least one special character.\n';
        }

        if (errorMsg) {
            alert(errorMsg);
            return false; // Prevent form submission
        }
        return true; // Allow form submission
    }
</script>
</head>
<body>
    <div class="container mt-5">
        <h2>Edit Profile</h2>
        
        <!-- Form to search for a customer by ID -->
        <form action="EditProfileController" method="get">
            <div class="form-group">
                <label for="searchCustomerId">Customer ID</label>
                <input type="number" class="form-control" id="searchCustomerId" name="customerId" required>
            </div>
            <button type="submit" class="btn btn-primary">Load Customer</button>
        </form>
        <hr>
        
        <!-- Form to update customer details -->
        <form action="EditProfileController" method="post" onsubmit="return validatePassword()">
            <!-- Field for customer ID -->
            <div class="form-group">
                <label for="customerId">Customer ID</label>
                <input type="number" class="form-control" id="customerId" name="customerId" value="${customer.customerId}" readonly required>
            </div>
            
            <!-- Field for first name -->
            <div class="form-group">
                <label for="customerFirstName">Customer First Name</label>
                <input type="text" class="form-control" id="customerFirstName" name="customerFirstName" value="${customer.customerFirstName}" required>
            </div>
            
            <!-- Field for last name -->
            <div class="form-group">
                <label for="customerLastName">Customer Last Name</label>
                <input type="text" class="form-control" id="customerLastName" name="customerLastName" value="${customer.customerLastName}" required>
            </div>
            
            <!-- Field for current password -->
            <div class="form-group">
                <label for="currentPassword">Current Password</label>
                <input type="password" class="form-control" id="currentPassword" name="currentPassword" required>
            </div>
            
            <!-- Field for new password -->
            <div class="form-group">
                <label for="password">New Password</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            
            <!-- Submit button -->
            <button type="submit" class="btn btn-primary">Update</button>
            
            <!-- Cancel button -->
            <a href="customerHome.jsp" class="btn btn-secondary">Back</a>
        </form>
        
        <!-- Display any messages (e.g., errors or success messages) -->
        <c:if test="${not empty message}">
            <div class="alert alert-info mt-3">${message}</div>
        </c:if>
    </div>
</body>
</html>