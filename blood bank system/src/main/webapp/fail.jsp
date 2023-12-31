<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Failed</title>
    <!-- Link Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        

        h1 {
            margin-bottom: 20px;
        }

        .btn-container {
            margin-top: 20px;
        }
    </style>
</head>

<body style="background-color:#82bbed">
 <%@ include file="NavBar.jsp"  %>
    <div class="container">
        <h1 class="text-center">Registration Failed</h1>
        <p class="text-center">Sorry, there was an error during the registration process. Please try again later.</p>

        <!-- Buttons to redirect to Home and Registration pages -->
        <div class="text-center btn-container">
            <a href="index.jsp" class="btn btn-primary">Home</a>
            <a href="login.jsp" class="btn btn-secondary">Login </a>
            <a href="registration.jsp" class="btn btn-secondary"> Register </a>
        </div>
    </div>

    <!-- Link Bootstrap JS (optional) -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
     <%@ include file="footer.jsp"  %>
</body>

</html>

</body>
</html>