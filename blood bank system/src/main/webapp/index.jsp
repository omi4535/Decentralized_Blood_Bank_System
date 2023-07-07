<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blood Bank Portal</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <%@ include file="NavBar.jsp"  %>

    <div class="container mt-4">
        <h1>Welcome to the Blood Bank Portal</h1>
        <p>Choose an option from the navigation bar to proceed.</p>
    </div>
    
    <form method="post" action="banks">
    	<button type="submit"> show all banks</button>
    </form>
    <a href="login.jsp"> <button>admin login</button></a>
    
     <%@ include file="footer.jsp"  %>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
