<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head style="background-color:#82bbed">
    <title>Create Administrator Profile - Blood Bank</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }
        
        .container {
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #fff;
        }
        
        h2 {
            text-align: center;
            margin-bottom: 30px;
        }
        
        .form-group label {
            font-weight: bold;
        }
        
        .form-group input {
            padding: 10px;
        }
        
        .form-group button {
            padding: 10px 20px;
            background-color: #dc3545;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        
        .form-group button:hover {
            background-color: #c82333;
        }
        
        .error-message {
            color: #dc3545;
            font-size: 14px;
            margin-top: 5px;
        }
    </style>
</head>

<body>
 
<% 
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");

	if(session.getAttribute("registered")==null || (boolean)session.getAttribute("registered")==false ){
		response.sendRedirect("login.jsp");
	}
%>

<div class="container">
        <h2>Create Administrator Profile - Blood Bank</h2>
        <form action="register_admin" method="post">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" name="name" name="name" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" name="email" name="email" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" name="username" name="username" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" name="password" name="password" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="confirm_password">Confirm Password:</label>
                <input type="password" name="confirm_password" name="confirm_password" class="form-control" required>
                <p class="error-message">
                    <% if (request.getParameter("password_error") != null) { %>
                        <%= request.getParameter("password_error") %>
                    <% } %>
                </p>
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-danger">Create Profile</button>
            </div>
        </form>
    </div>
    
</body>

</html>


   