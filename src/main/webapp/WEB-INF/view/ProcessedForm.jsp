<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false" %>
</head>
<body>
<h2>This is Hello World Form</h2>
<br/><br/>
Welcome: <%= request.getParameter("studentName") %>
<br/><br/>

${message}

</body>
</html>