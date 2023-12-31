<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Blood Bank Entries</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<style>
.card {
	background-color: black;
}
.big-btn{
width: 100%;border: none;
      outline: none; text-align: left;
}
.custom-bg{
background-color:#000000;
}
</style>
<body style="background-color:#82bbed">
	<%@ include file="NavBar.jsp"%>
	<div class="container mt-2">
		<div class="row">
			<div class="col-md-6">
				<h1>Blood Bank Portal</h1>
			</div>
			<div class="col-md-6">
				<form class="form-inline float-right" action="search" method="post">
					<div class="form-group mr-3">
						<label for="location">Filter: </label> <select
							class="form-control" name="filter">
							<option value="">Select Filter</option>
							<option value="name">Name</option>
							<option value="region">Location</option>
							
						</select>
					</div>
					<input class="form-control mr-sm-2" type="search"
						placeholder="Search" aria-label="Search" name="key">
					<button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Search</button>
				</form>
			</div>
		</div>
	</div>

	<!--  <form method="post" action="details">-->
	
	<div class="container ">
		<c:forEach items="${bloodBanks}" var="bloodBank">
		<input type="hidden" name="curr_id" value="${bloodBank.id}">
			
		<a href="details?id=${bloodBank.id}">
			 <div class="row" >
				<div class="col">
					<div class=" card blood-bank-card border-danger mb-3 ">
						<div class="card-header">
							<h2 class="card-title">
								ID: ${bloodBank.id}<br> Name : ${bloodBank.name}
							</h2>
						</div>
						<div class="card-body text-danger">

							<p class="card-text">Address : ${bloodBank.address}</p>
							<p class="card-text">Region : ${bloodBank.region}</p>
							<p class="card-text">Contact : ${bloodBank.contactNumber}</p>
							<p class="card-text">Email: ${bloodBank.email}</p>
						</div>
					</div>
				</div>
					<!-- Repeat the above code for each blood bank -->
			</div>
				</a>
		</c:forEach>
	</div>

	<!-- </form>-->

	<!--  <table class="table table-bordered">
            
            <tbody>
                <c:forEach items="${bloodBanks}" var="bloodBank">
                    <tr>
                        <td>${bloodBank.name}</td>
                        <td>${bloodBank.address}</td>
                        <td>${bloodBank.region}</td>
                        <td>${bloodBank.contactNumber}</td>
                        <td>${bloodBank.email}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>-->
	</div>
	<%@ include file="footer.jsp"%>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
