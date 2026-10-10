<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Budget & Payment Management</title>
    <!-- Corrected Bootstrap CSS Link for styling -->
    <link href="https://jsdelivr.net" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow p-4 mx-auto" style="max-width: 500px;">
        <h3 class="text-center text-primary mb-4">Add Budget & Payment</h3>

        <!-- Form to send data to the Backend Servlet -->
        <form action="PaymentServlet" method="POST">
            <div class="mb-3">
                <label class="form-label">Payment ID:</label>
                <input type="text" name="paymentId" class="form-control" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Wedding ID:</label>
                <input type="text" name="weddingId" class="form-control" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Total Budget Estimate (Rs):</label>
                <input type="number" name="totalBudget" class="form-control" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Advance Amount Paid (Rs):</label>
                <input type="number" name="amountPaid" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary w-100">Save Payment</button>
        </form>

    </div>
</div>
</body>
</html>
