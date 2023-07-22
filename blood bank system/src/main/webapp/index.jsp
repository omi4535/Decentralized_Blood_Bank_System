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
<style>
	.container h1 {
	 font-family: "Fredoka One", cursive;
	font-weight: bold;
	}
	h3{
	 font-family: "Fredoka One", cursive;
	font-weight: bold;
	}
	
	 .button {
	 font-family: "Fredoka One", cursive;
	font-style: Italic;
  display: inline-block;
  border-radius: 4px;
  background-color: #ab1a0f;
  border: none;
  color: #FFFFFF;
  text-align: center;
  
 font-size: 18px;
  padding: 10px;
 
  transition: all 0.5s;
  cursor: pointer;
 margin-top: 30px;
  
  margin-bottom: 15px;
  margin-left: 150px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}

.slogo{
margin-left:80px;}
</style>
<body>
    <%@ include file="NavBar.jsp"  %>
 <%@ include file="back_video.jsp"  %>
    <div class="container mt-4">
        <h1>Welcome to the</h1>
        <h1>Blood Bank Portal</h1>
        <br>
        <h3 class="slogo">Every Drop Counts :</h3><h3 > Your Gift of Blood Their Chance To Live </h3>
    </div>
    
    <form method="post" action="banks">
    	<button class="button"type="submit"><span> Find Banks</span></button>
    </form>
    
    <a href="registration.jsp"> <button class="button admin"><span>Register A Bank</span></button></a>
    <br><br><br><br><br><br>
    <!--   <%@ include file="footer.jsp"  %>
-->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
