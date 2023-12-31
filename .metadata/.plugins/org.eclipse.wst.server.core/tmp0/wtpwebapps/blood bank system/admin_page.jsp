<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Blood Inventory Admin</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #b9132f;
            margin-bottom: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 10px;
            border: 1px solid #ccc;
        }

        th {
            background-color: #f2f2f2;
            text-align: left;
        }

        .button {
            display: inline-block;
            padding: 8px 12px;
            background-color: #b9132f;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-weight: bold;
        }

        .button:hover {
            background-color: #870f25;
        }

        .button-red {
            background-color: #e74c3c;
        }

        .button-red:hover {
            background-color: #c0392b;
        }

        .button-blue {
            background-color: #3498db;
        }

        .button-blue:hover {
            background-color: #2980b9;
        }

        .container1 {
            max-width: 1000px;
            margin: 30px auto;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .blood-bank {
            margin-top: 30px;
            padding: 20px;
            background-color: #eee;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .blood-bank h2 {
            color: #b9132f;
            margin-bottom: 10px;
        }

        .blood-bank p {
            color: #555;
            margin-bottom: 10px;
        }

        .blood-bank .button {
            margin-top: 10px;
        }
    </style>
</head>
<body style="background-color:#82bbed">
    <%@ include file="NavBar.jsp"  %>
    <%response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Expires", "0");
    	if(session.getAttribute("admin_id")==null){
    		response.sendRedirect("login.jsp");
    	}
    	int i=0;
    	
    %>
    <div class="container1">
        <h1>Blood Inventory Admin</h1>
        <table>
            <tr>
            	<th>Inventory Id</th>
                <th>Bank ID</th>
                <th>Blood Group </th>
                <th>Available Units</th>
                <th>Last Updated Date</th>
                <th>Storage Location</th>
                <th>Editor id</th>
                <th>Actions</th>
            </tr>
            <c:forEach items="${inventories}" var="bloodInventory">
                <%i++; %>
                <tr>
                	<td>${bloodInventory.inventoryId}</td>
                    <td>${bloodInventory.bloodBankId}</td>
                    <td>${bloodInventory.bloodGroup}</td>
                    <td>${bloodInventory.availableUnits}</td>
                    <td>${bloodInventory.lastUpdatedDate}</td>
                    <td>${bloodInventory.storageLocation}</td>
                    <td>${bloodInventory.editor}</td>
                    <td class="button_col" style="text-align: center;">
                        <div class="button-container">
                            <form action="edit_set_id" method="post">
                                <input hidden name="in_id1" value="${bloodInventory.inventoryId}" />
                                <button class="button button-blue">Edit</button>
                            </form>
                            <form action="delete_inventory" method="post">
                                <input hidden name="in_id" value="${bloodInventory.inventoryId}" />
                                <button class="button button-red">Delete</button>
                            </form>
                        </div>
                    </td>
                </tr>
            </c:forEach>
            <c:if test="${i}==0">
            	<h2>
            		no data avaliable
            	</h2>
            </c:if>
        </table>
        <br>
        <form action="add_new_inventory.jsp" method="post">
            <button class="button" style="display: block; margin: 0 auto;">Add New Blood Inventory</button>
        </form>

        <div class="blood-bank">
            <h2>Blood Bank Information</h2>
            <p>Name: ABC Blood Bank</p>
            <p>Address: 123 Main Street, City</p>
            <p>Contact: +1 123 456 7890</p>
            <button class="button">Visit Blood Bank Website</button>
        </div>
    </div>
    <%@ include file="footer.jsp"  %>
</body>
</html>

