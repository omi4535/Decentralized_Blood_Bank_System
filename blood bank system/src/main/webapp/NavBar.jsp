<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blood Bank Portal</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        .navbar {
    background-color: #333;
    color: #fff;
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 10px;
  }

  .navbar ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    display: flex;
  }

  .navbar ul li {
    margin-right: 15px;
  }

  .navbar ul li a {
    color: #fff;
    text-decoration: none;
  }

  .navbar ul li a:hover {
    text-decoration: underline;
  }
        
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="index.jsp">Blood Bank Portal</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Home</a>
                    </li>
                      <li class="nav-item">
                        <a class="nav-link" href="blood_groups_info.jsp">Blood Related Info</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="registration.jsp">Register</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="banks">Show All Banks</a>
                    </li>
                </ul>
                
            </div>
        </div>
    </nav>

</body>
</html>
