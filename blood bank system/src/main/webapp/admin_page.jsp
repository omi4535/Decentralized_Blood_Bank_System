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

        .container {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        h1 {
            color: #333;
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
            background-color: #4caf50;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-weight: bold;
        }

        .button:hover {
            background-color: #45a049;
        }

        .button-red {
            background-color: #f44336;
        }

        .button-red:hover {
            background-color: #d32f2f;
        }

        .button-blue {
            background-color: #2196f3;
        }

        .button-blue:hover {
            background-color: #1976d2;
        }


        .containe {
            max-width: 600px;
            margin: 30px auto;
            padding: 20px;
            background-color: #fff;  
            
            
            border: 1px solid #ccc;
            border-radius: 4px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>
 

     <div class="container">
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
                <tr>
                	 <td>${bloodInventory.inventoryId}</td>
                    <td>${bloodInventory.bloodBankId}</td>
                    <td>${bloodInventory.bloodGroup}</td>
                    <td>${bloodInventory.availableUnits}</td>
                    <td>${bloodInventory.lastUpdatedDate}</td>
                    <td>${bloodInventory.storageLocation}</td>
                     <td>${bloodInventory.editor}</td>
                    <td>
                    <form action="edit_set_id" method="post">
                    	<input hidden name="in_id1" value="${bloodInventory.inventoryId}" />
                        <button class="button button-blue">Edit</button>
                      </form>
                       <form action="delete_inventory" method="post">
                       <input hidden name="in_id" value="${bloodInventory.inventoryId}" />
                        <button class="button button-red">Delete</button>
                    </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
       <form action="add_new_inventory.jsp" method="post"><button class="button">Add New Blood Inventory</button></form>
    </div>
     <%@ include file="footer.jsp"  %>
    
</body>
</html>