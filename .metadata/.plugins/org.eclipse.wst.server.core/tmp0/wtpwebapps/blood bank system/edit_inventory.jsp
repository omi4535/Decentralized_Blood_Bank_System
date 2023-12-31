<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Inventory Information</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f1f1f1;
        }

        .container1 {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        h1 {
            text-align: center;
            margin-bottom: 20px;
        }

        form {
            margin-bottom: 20px;
        }

        label {
            font-weight: bold;
            display: block;
            margin-bottom: 10px;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }

        button[type="submit"] {
            background-color: #4CAF50;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }

        button[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body style="background-color:#82bbed">
 <%response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
 response.setHeader("Pragma", "no-cache");
 response.setHeader("Expires", "0");
    	if(session.getAttribute("admin_id")==null){
    		response.sendRedirect("login.jsp");
    	}
    %>
 <%@ include file="NavBar.jsp"  %>
<br><br>
    <div class="container1">
        <h1>Edit Inventory Information</h1>
       
     
        <c:forEach var="inventory" items="${inventories}">
			
            <c:if test="${inventory.inventoryId == idd}">
                <form action="updateInventory" method="POST">
                    <div class="inventory-entry">
                    	<input hidden name="in_id" value="${inventory.inventoryId}" />
                        <h3>Inventory ID: ${inventory.inventoryId}    &#160; &#160; &#160; &#160; &#160; &#160; &#160;  Blood Group: ${inventory.bloodGroup}</h3>
                            
                        <label for="availableUnits">Available Units:</label>
                        <input type="text" name="availableUnits" value="${inventory.availableUnits}" placeholder="Enter available units"><br><br>
                        <label for="lastUpdatedDate">Last Updated Date: &#160; &#160; &#160; &#160;</label>
                        <input type="date" name="lastUpdatedDate" value="${inventory.lastUpdatedDate}" placeholder="Enter last updated date"><br><br>
                        <label for="storageLocation">Storage Location:</label>
                        <input type="text" name="storageLocation" value="${inventory.storageLocation}" placeholder="Enter storage location"><br><br>
                    </div>
                    <button type="submit">Update Inventory</button>
                </form>
            </c:if>
        </c:forEach>
    </div>
    <br>
    
     <%@ include file="footer.jsp"  %>
</body>
</html>
