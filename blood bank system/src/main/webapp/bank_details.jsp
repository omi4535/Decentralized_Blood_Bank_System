<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Blood Bank Registration Details</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body style="background-color:#82bbed">
<%@ include file="NavBar.jsp"%>
    <div class="container">
        <h1>Blood Bank  Details</h1>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Field</th>
                    <th>Value</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Blood Bank Name</td>
                    <td>${curr_bank.getName()}</td>
                </tr>
                  <tr>
                    <td>Storage Capacity</td>
                    <td>${curr_bank.getStorageCapacity()}</td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>${curr_bank.getAddress()}</td>
                </tr>
              
                
                <tr>
                    <td>Contact</td>
                    <td>${curr_bank.getContactNumber()}</td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>${curr_bank.getEmail()}</td>
                </tr>
                
                
                 <tr>
                    <td>Operational Hours</td>
                    <td>${curr_bank.getOperationalHours()}</td>
                </tr>
                 <tr>
                    <td>Special Services</td>
                    <td>${curr_bank.getSpecialServices()}</td>
                </tr>
                 <tr>
                    <td>Contact Person Name</td>
                    <td>${curr_bank.getContactPersonName()}</td>
                </tr>
                 <tr>
                    <td>Contact Person Designation</td>
                    <td>${curr_bank.getContactPersonDesignation()}</td>
                </tr>
                
                 <tr>
                    <td>Contact Person Phone</td>
                    <td>${curr_bank.getContactPersonPhone()}</td>
                </tr>
                 <tr>
                    <td>Contact Person Email</td>
                    <td>${curr_bank.getContactPersonEmail()}</td>
                </tr>
                 <tr>
                    <td>Certification Details</td>
                    <td>${curr_bank.getCertificationDetails()}</td>
                </tr>
                 <tr>
                    <td>Accreditation Details</td>
                    <td>${curr_bank.getAccreditationDetails()}</td>
                </tr>
                
                  <tr>
                    <td>Blood Components Handled</td>
                    <td>${curr_bank.getBloodComponentsHandled()}</td>
                </tr>
                  <tr>
                    <td>Testing Facilities</td>
                    <td>${curr_bank.getTestingFacilities()}</td>
                </tr>
                  <tr>
                    <td>Transfusion Services</td>
                    <td>${curr_bank.getTransfusionServices()}</td>
                </tr>
                  <tr>
                    <td>Other Activities</td>
                    <td>${curr_bank.getAccreditationDetails()}</td>
                </tr>
                  <tr>
                    <td>Additional Information</td>
                    <td>${curr_bank.getAdditionalInformation()}</td>
                </tr>
               
                
                <!-- Add more rows as needed for other fields -->
            </tbody>
        </table>
    </div>
    <%@ include file="footer.jsp"%>
</body>
</html>
