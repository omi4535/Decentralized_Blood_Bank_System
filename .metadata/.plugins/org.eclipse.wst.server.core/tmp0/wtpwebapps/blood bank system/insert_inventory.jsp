<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Blood Inventory Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f8f8;
            margin: 0;
            padding: 0;
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

        h1 {
            color: #c03636;
            text-align: center;
            margin-bottom: 30px;
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            display: block;
            color: #333;
            font-weight: bold;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="date"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        button[type="submit"] {
            padding: 10px 20px;
            background-color: #c03636;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-weight: bold;
            transition: background-color 0.3s;
        }

        button[type="submit"]:hover {
            background-color: #a02c2c;
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
    %>
    <div class="containe">
        <h1>Blood Inventory Management</h1>
        <form action="addInventory.jsp" method="post">
            <div class="form-group">
                <label for="bankId">Bank ID:</label>
                <input type="text" id="bankId" name="bankId" required>
            </div>
            <div class="form-group">
                <label for="groupId">Group ID:</label>
                <input type="text" id="groupId" name="groupId" required>
            </div>
            <div class="form-group">
                <label for="availableUnits">Available Units:</label>
                <input type="text" id="availableUnits" name="availableUnits" required>
            </div>
            <div class="form-group">
                <label for="lastUpdatedDate">Last Updated Date:</label>
                <input type="date" id="lastUpdatedDate" name="lastUpdatedDate" required>
            </div>
            <div class="form-group">
                <label for="storageLocation">Storage Location:</label>
                <input type="text" id="storageLocation" name="storageLocation" required>
            </div>
            
            <button type="submit">Add Inventory</button>
        </form>
    </div>
     <%@ include file="footer.jsp"  %>
    
</body>
</html>

