<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Blood Group Information</title>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 20px;
	background-color: #f2f2f2;
}

h1 {
margin:10px auto;
	text-align: center;
	color: #333;
}

table {
	text-align: center;
	width: 66.67%;
	margin: auto;
	border-collapse: collapse;
	margin-top: 20px;
	background-color: #fff;
	box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
}

th, td {
	padding: 10px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}

th {
	background-color: #f5f5f5;
	font-weight: bold;
	color: #333;
}

.info-section {
	margin-top: 30px;
	padding: 20px;
	background-color: #fff;
	box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
}

.info-section h2 {
	color: #333;
	margin-bottom: 10px;
}

.info-section p {
	color: #666;
	line-height: 1.5;
}

table {
	width: 66.67%;
	margin: 0 auto;
	border-collapse: collapse;
}

th {
	background-color: #E74C3C; /* Red color for table header */
	color: #FFFFFF; /* White text color for table header */
	text-align: center;
	padding: 10px;
	border: 1px solid #CCCCCC;
}

tr {
	background-color: #ffcccc;
	text-align: center;
	padding: 10px;
	border: 1px solid #CCCCCC;
	/* Light gray border color for table cells */
}

tr:nth-child(even) {
	background-color: #F2F2F2;
	/* Light gray background color for even rows */
}

tr:hover {
	background-color: #ff4d4d;
	/* Yellow background color for hover effect on rows */
}

.info-container {
	width: 86%;
	margin: 20px auto;
	
	background-color: #F8F8F8;
	padding: 20px;
	margin-top:10dp;
	border: 1px solid #CCCCCC;
	border-radius: 5px;
}

.info-container h2 {
text-align: center;
	color: #E74C3C;
	font-size: 24px;
	margin-bottom: 10px;
}

.info-container p {
	color: #333333;
	font-size: 16px;
	line-height: 1.5;
}
</style>
</head>
<body style="background-color:#82bbed">
	<%@ include file="NavBar.jsp"%>
	
	<h1>Blood Group Information</h1>

	<table>
		<tr>
			<th>Group Name</th>
			<th>Rh Factor</th>
			<th>Compatibility</th>
			<th>Description</th>
		</tr>
		<tr>
			<td>A+</td>
			<td>+</td>
			<td>A+, AB+</td>
			<td>Universal recipient</td>
		</tr>
		<tr>
			<td>A-</td>
			<td>-</td>
			<td>A+, A-, AB+, AB-</td>
			<td>Can receive A-, O-</td>
		</tr>
		<tr>
			<td>B+</td>
			<td>+</td>
			<td>B+, AB+</td>
			<td>Universal recipient</td>
		</tr>
		<tr>
			<td>B-</td>
			<td>-</td>
			<td>B+, B-, AB+, AB-</td>
			<td>Can receive B-, O-</td>
		</tr>
		<tr>
			<td>AB+</td>
			<td>+</td>
			<td>AB+</td>
			<td>Universal recipient</td>
		</tr>
		<tr>
			<td>AB-</td>
			<td>-</td>
			<td>AB+, AB-</td>
			<td>Can receive AB-, A-, B-, O-</td>
		</tr>
		<tr>
			<td>O+</td>
			<td>+</td>
			<td>O+, A+, B+, AB+</td>
			<td>Universal donor</td>
		</tr>
		<tr>
			<td>O-</td>
			<td>-</td>
			<td>All blood groups</td>
			<td>Universal donor</td>
		</tr>
	</table>

	<div class="info-container">
		<h2>About Blood Groups</h2>
		<p>Blood groups are determined by the presence or absence of
			certain antigens on the surface of red blood cells. The two most
			important antigens are A and B, and the presence or absence of these
			antigens, along with the Rh factor, determines a person's blood
			group.</p>
		<p>The Rh factor refers to the presence or absence of the Rh
			antigen on the red blood cells. If the Rh antigen is present, the
			blood group is positive (+), and if it is absent, the blood group is
			negative (-).</p>
		<p>Blood group compatibility is essential for safe blood
			transfusions. Individuals with certain blood groups can receive blood
			only from compatible donors. The table above shows the compatibility
			of each blood group.</p>
		<p>Knowing your blood group is important in emergencies, medical
			treatments, and blood donations. It helps ensure that patients
			receive the right type of blood and that donors can contribute
			safely.</p>

		<h2>Donating Blood</h2>
		<p>Blood donation is a voluntary act that saves lives. If you are
			eligible to donate blood, consider becoming a blood donor. Here are
			some essential things to know:</p>
		<ul>
			<li>You must be in good health and meet the eligibility criteria
				set by blood banks.</li>
			<li>Donated blood can be used for various medical conditions,
				including surgeries, accidents, and medical treatments.</li>
			<li>Donating blood is safe and the process is quick and
				painless.</li>
			<li>After donating blood, your body replenishes the blood volume
				within a short period.</li>
			<li>One donation can save up to three lives!</li>
		</ul>
		<h2>Blood Group Facts</h2>
		<p>Here are some interesting facts about blood groups:</p>
		<ul>
			<li>O-negative blood is known as the universal donor, as it can
				be given to patients with any blood group.</li>
			<li>AB-positive blood is known as the universal recipient, as it
				can receive blood from donors of any blood group.</li>
			<li>Blood type is inherited from our parents, and different
				combinations of A, B, and O alleles determine the blood group.</li>
			<li>Blood groups can vary across different populations and
				ethnicities.</li>
			<li>Knowing your blood group can be crucial in case of
				emergencies when blood transfusions are required.</li>
		</ul>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>
