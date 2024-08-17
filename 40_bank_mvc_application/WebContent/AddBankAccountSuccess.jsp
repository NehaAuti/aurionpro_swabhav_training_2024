<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Account Created</title>
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
</style>
</head>
<body>
    <div class="container mt-5">
        <h2>Bank Account Created</h2>
        <p>Your new bank account has been successfully created with the following account number: ${accountNumber}</p>
        <a href="adminHome.jsp" class="btn btn-primary">Back to Home</a>
    </div>
</body>
</html>