<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blood Bank Portal</title>
    
 <style>
  #nav {
    width: 100%;
    color: black;
    position: relative;
    top: 10%;
    text-align: center;
    font-family: "Neuton", serif;
    line-height: 50px;
  }

  header {
    overflow: hidden;
    height: 100vh;
    width: 100%;
    background-size: cover;
    position: relative;
    background-attachment: fixed;
  }

  #nav .header-list {
    display: flex; /* Added */
    justify-content: flex-end; /* Changed */
  }

  .header-list ul {
    margin: 0; /* Added */
    padding: 0; /* Added */
  }

  .header-list ul li {
    list-style: none;
    display: inline-block;
    padding: 8px 15px;
    position: relative;
  }

  .header-list ul li a {
    color: black;
    font-size: 24px;
    text-decoration: none;
    font-family: "Fredoka One", cursive;
  }

  .header-list ul li::after {
    content: "";
    height: 2px;
    background: #cd5c5c;
    display: block;
    margin: auto;
    transition: 0.5s;
    width: 0%;
  }

  .header-list ul li:hover::after {
    width: 100%;
  }

  #nav .fa {
    display: none;
  }
</style>

    
  <!--    <style>
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
        
    </style>-->
</head>
<body style=" background-color:#5899f5;">
    <!--  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
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
    </nav>-->
    
     <div id="nav">
        <div class="header-list" id="headerl">
         
          <ul>
            <li>
              <a href="index.jsp">Home</a>
            </li>
            <li><a class="scroll" href="registration.jsp">Register</a></li>
            <li><a href="blood_groups_info.jsp">Blood Related Info</a></li>
            <li><a href="login.jsp" target="_blank">Admin Login</a></li>
          </ul>
        </div>
      </div>

</body>
</html>
