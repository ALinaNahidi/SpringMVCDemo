<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
<%@ page isELIgnored="false" %>
<title> Customer Confirmation form </title>
</head>
<body>
<h2>Customer Confirmation Form</h2>
<br/><br/>
The customer is confirmed : ${customer.firstName} ${customer.lastName}
<br/><br/>
No. of Free Passes: ${customer.freePasses}
<br/><br/>
Postal Code: ${customer.pinCode}
<br/><br/>
Course Code: ${customer.courseCode}
</body>
</html>