<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Bank Account</title>
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
    label {
        font-weight: bold;
    }
    .btn-primary {
        background-color: #007bff;
        border-color: #007bff;
    }
    .btn-secondary {
        background-color: #6c757d;
        border-color: #6c757d;
    }
</style>
<script>
    function validateDeposit() {
        var balance = parseFloat(document.getElementById('balance').value);
        if (isNaN(balance)) {
            alert('Initial deposit must be a number.');
            return false;
        }
        if (balance < 5000) {
            alert('Initial deposit cannot be less than 5000.');
            return false;
        }
        if (balance < 0) {
            alert('Initial deposit cannot be negative.');
            return false;
        }
        return true;
    }
</script>
</head>
<body>
    <div class="container mt-5">
        <h2>Add Bank Account</h2>
        <form action="AddBankAccountController" method="get">
            <div class="form-group">
                <label for="customerId">Customer ID:</label>
                <input type="text" class="form-control" id="customerId" name="customerId" required>
            </div>
            <button type="submit" class="btn btn-primary">Search</button>
            <a href="adminHome.jsp" class="btn btn-secondary">Cancel</a>
        </form>

        <c:if test="${not empty customer}">
            <div class="mt-5">
                <h3>Customer Details</h3>
                <p><strong>First Name:</strong> ${customer.customerFirstName}</p>
                <p><strong>Last Name:</strong> ${customer.customerLastName}</p>
                <p><strong>Email:</strong> ${customer.emailId}</p>

                <form action="AddBankAccountController" method="post" onsubmit="return validateDeposit();">
                    <input type="hidden" name="customerId" value="${customer.customerId}">
                    <div class="form-group">
                        <label for="accountType">Account Type:</label>
                        <input type="text" class="form-control" id="accountType" name="accountType" required>
                    </div>
                    <div class="form-group">
                        <label for="balance">Initial Deposit:</label>
                        <input type="number" class="form-control" id="balance" name="balance" step="0.01" min="5000" required>
                    </div>
                    <button type="submit" class="btn btn-success">Generate Account Number</button>
                </form>
            </div>
        </c:if>
        <c:if test="${not empty error}">
            <p class="text-danger">${error}</p>
        </c:if>
    </div>
</body>
</html>