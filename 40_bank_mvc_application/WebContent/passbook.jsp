<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Passbook</title>
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
            margin-top: 50px;
        }
        h2 {
            color: #333333;
        }
        .table {
            margin-top: 20px;
        }
        .btn-primary {
            margin-top: 0;
        }
        .filter-group {
            display: flex;
            align-items: center;
            flex-wrap: wrap;
            gap: 10px; /* Space between inputs and button */
        }
        .filter-group .form-group {
            margin: 0; /* Remove margins */
        }
        .filter-group .form-control {
            max-width: 150px; /* Adjust width as needed */
            width: auto;
        }
        .filter-group .btn-primary {
            height: calc(2.25rem + 2px); /* Match height of inputs */
            line-height: 1.5; /* Align text vertically */
            padding: 0.375rem 0.75rem; /* Adjust padding */
            font-size: 0.875rem; /* Adjust font size */
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Passbook Transactions</h2>
        <form id="filterForm" action="PassbookController" method="get">
            <div class="filter-group">
                <div class="form-group">
                    <label for="receiverAccountNumber" class="sr-only">Receiver Account Number:</label>
                    <input type="text" class="form-control" id="receiverAccountNumber" name="receiverAccountNumber" placeholder="Receiver Account Number">
                </div>
                <div class="form-group">
                    <label for="startDate" class="sr-only">Start Date:</label>
                    <input type="date" class="form-control" id="startDate" name="startDate">
                </div>
                <div class="form-group">
                    <label for="endDate" class="sr-only">End Date:</label>
                    <input type="date" class="form-control" id="endDate" name="endDate">
                </div>
                <div class="form-group">
                    <label for="accountStatus" class="sr-only">Account Status:</label>
                    <select class="form-control" id="accountStatus" name="accountStatus" onchange="showStatusMessage()">
                        <option value="">All Statuses</option>
                        <option value="active">Active</option>
                        <option value="inactive">Inactive</option>
                    </select>
                </div>
                <button type="submit" class="btn btn-primary">Search</button>
            </div>
        </form>
        <table class="table table-bordered mt-4">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Sender Account</th>
                    <th>Receiver Account</th>
                    <th>Transaction Type</th>
                    <th>Amount</th>
                    <th>Date</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="entry" items="${passbookEntries}">
                    <tr>
                        <td>${entry.id}</td>
                        <td>${entry.senderAccno}</td>
                        <td>${entry.receiverAccno}</td>
                        <td>${entry.transactionType}</td>
                        <td>${entry.amount}</td>
                        <td>${entry.transactionDate}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="customerHome.jsp" class="btn btn-primary">Back to Customer Home</a>
    </div>

    <!-- JavaScript to show pop-up message -->
    <script>
        function showStatusMessage() {
            var status = document.getElementById("accountStatus").value;
            if (status) {
                var message = (status === 'active') ? 'You have selected Active accounts.' : 'You have selected Inactive accounts.';
                alert(message);
            }
        }
    </script>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>