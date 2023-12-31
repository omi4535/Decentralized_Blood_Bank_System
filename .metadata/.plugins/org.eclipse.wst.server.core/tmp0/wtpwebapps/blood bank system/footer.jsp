<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Blood Bank Portal</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>

*,
*:before,
*:after {
  -webkit-box-sizing: border-box;
  -moz-box-sizing:    border-box;
  box-sizing:         border-box;
}

html {
  height: 100%;
}

body {
  position: relative;
  margin: 0;
  padding-bottom: 4rem;
  min-height: 100%;
  font-family: "Helvetica Neue", Arial, sans-serif;
}

.footer {
	background-color: #f8f9fa;
	padding: 20px;
	position: relative;
	right: 0;
	bottom: 0;
	left: 0;
	padding: 1rem;
	background-color: #efefef;
	text-align: center;
}

.footer-links a {
	color: #333;
	margin-right: 10px;
}

.footer-info {
	color: #777;
	font-size: 14px;
}
</style>
</head>
<body>


	<footer class="footer">
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<div class="footer-links">
						<a href="index.jsp">Home</a> 
						<a href="registration.jsp">Register</a>
						<a href="All_banks.jsp">Show All Banks</a>
					</div>
				</div>
				<div class="col-md-6">
					<div class="footer-info">
						&copy; 2023 Blood Bank Portal. All rights reserved. <br>
						Designed and developed by Omkar Dhage.
					</div>
				</div>
			</div>
		</div>
	</footer>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
