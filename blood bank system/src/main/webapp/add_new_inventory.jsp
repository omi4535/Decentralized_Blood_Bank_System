<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Inventory</title>
    <style>
        body {
            background-color: #f5f5f5;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
        }

        .container1 {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            margin: 0 auto;
            padding: 40px;
        }

        h1 {
            color: #c0392b;
            font-size: 24px;
            margin: 0 0 20px;
            text-align: center;
        }

        label {
            display: block;
            font-weight: bold;
            margin-bottom: 10px;
        }

        select,
        input[type="text"],
        input[type="date"],
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
            margin-bottom: 20px;
        }

        input[type="submit"] {
            background-color: #c0392b;
            color: #fff;
            border: none;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #a73224;
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
    <div class="container1">
        <h1>Add Inventory</h1>
        <form action="add_inventory" method="post">
            <label for="bloodGroup">Blood Group:</label>
            <select name="bloodGroup" required>
                <option value="A+">A+</option>
                <option value="A-">A-</option>
                <option value="B+">B+</option>
                <option value="B-">B-</option>
                <option value="AB+">AB+</option>
                <option value="AB-">AB-</option>
                <option value="O+">O+</option>
                <option value="O-">O-</option>
            </select>
            
            
            <label for="availableUnits">Available Units:</label>
            <input type="text" name="availableUnits"  required>
            
            <label for="lastUpdatedDate">Last Updated Date:</label>
            <input type="date" name="lastUpdatedDate"  required>
            
            <label for="storageLocation">Storage Location:</label>
            <input type="text" name="storageLocation" required>
            
            <input type="submit" value="Add Inventory">
        </form>
    </div>
    <br><br>
       <%@ include file="footer.jsp"  %>
</body>
</html>
    