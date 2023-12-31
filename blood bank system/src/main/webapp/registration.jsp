<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Blood Bank Registration</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<style>

.form_regi {
	color: #8B0000;
}

.containe {
	max-width: 700px;
	margin: 20px auto;
	padding: 30px;
	border-radius: 5px;
	background-color: #ffffff;
	box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.1);
}

h2 {
	margin-bottom: 30px;
	text-align: center;
}

.custom-button {
    background-color: #F5F5F5;
    color: #fff;
    border: none;
    padding: 10px 20px;
    font-size: 16px;
    transition: background-color 0.3s ease;
}

.custom-button:hover {
    background-color: #0056b3;
    cursor: pointer;
}

.custom-button:not(:hover) {
    background-color: #F5F5F5;
    opacity: 0.7;
    cursor: default;
    color: #000; /* Change text color to black */
}

.btn-register {
	background-color: #000000;
	color: #fff;
	border: none;
	padding: 10px 20px;
	font-size: 16px;
	transition: background-color 0.3s ease;
}

.btn-register:hover {
	background-color: #c82333;
	color:#ffffff
}

.btn-back{
background-color: #6c2020;
}
.form {
	background-color: #D50000;
}
</style>
</head>

<body style="background-color:#82bbed">
<%response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
 %>
<%@ include file="NavBar.jsp"%>

	<div class="containe">
		<div class="form_regi">
			<h2>Blood Bank Registration</h2>
			<form method="post" action="register">
				<div class="form-group">
					<label for="name">Blood Bank Name:</label> <input type="text"
						class="form-control" name="name" required>
				</div>
				<div class="form-group">
					<label for="address">Address:</label> <input type="text"
						class="form-control" name="address" required>
				</div>
				<div class="form-group">
					<label for="region">Region:</label> <input type="text"
						class="form-control" name="region" required>
				</div>
				<div class="form-group">
					<label for="contactNumber">Contact Number:</label> <input
						type="tel" class="form-control" name="contactNumber" required>
				</div>
				<div class="form-group">
					<label for="email">Email:</label> <input type="email"
						class="form-control" name="email" required>
				</div>
				<div class="form-group">
					<label for="operationalHours">Operational Hours:</label> <input
						type="text" class="form-control" name="operationalHours" required>
				</div>
				<div class="form-group">
					<label for="specialServices">Special Services:</label> <input
						type="text" class="form-control" name="specialServices" required>
				</div>
				<div class="form-group">
					<label for="contactPersonName">Contact Person Name:</label> <input
						type="text" class="form-control" name="contactPersonName" required>
				</div>
				<div class="form-group">
					<label for="contactPersonDesignation">Contact Person
						Designation:</label> <input type="text" class="form-control"
						name="contactPersonDesignation" required>
				</div>
				<div class="form-group">
					<label for="contactPersonPhone">Contact Person Phone:</label> <input
						type="tel" class="form-control" name="contactPersonPhone" required>
				</div>
				<div class="form-group">
					<label for="contactPersonEmail">Contact Person Email:</label> <input
						type="email" class="form-control" name="contactPersonEmail"
						required>
				</div>
				<div class="form-group">
					<label for="certificationDetails">Certification Details:</label> <input
						type="text" class="form-control" name="certificationDetails"
						required>
				</div>
				<div class="form-group">
					<label for="accreditationDetails">Accreditation Details:</label> <input
						type="text" class="form-control" name="accreditationDetails"
						required>
				</div>
				<div class="form-group">
					<label for="storageCapacity">Storage Capacity:</label> <input
						type="number" class="form-control" name="storageCapacity" required>
				</div>
				<div class="form-group">
					<label for="bloodComponentsHandled">Blood Components
						Handled:</label> <input type="text" class="form-control"
						name="bloodComponentsHandled" required>
				</div>
				<div class="form-group">
					<label for="testingFacilities">Testing Facilities:</label> <input
						type="text" class="form-control" name="testingFacilities" required>
				</div>
				<div class="form-group">
					<label for="transfusionServices">Transfusion Services:</label> <input
						type="text" class="form-control" name="transfusionServices"
						required>
				</div>
				<div class="form-group">
					<label for="otherActivities">Other Activities:</label> <input
						type="text" class="form-control" name="otherActivities" required>
				</div>
				<div class="form-group">
					<label for="additionalInformation">Additional Information:</label>
					<textarea class="form-control" name="additionalInformation"
						rows="3"></textarea>
				</div>
				<div class="text-center">
					<button type="submit" class=" custom-button btn btn-register  btn-back">Register</button>
				</div>
			</form>
		</div>

	</div>

	<%@ include file="footer.jsp"%>


	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>

</html>
