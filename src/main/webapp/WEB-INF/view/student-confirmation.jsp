<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
<%@ page isELIgnored="false" %>
</head>
<body>
<h2>Confirmation Form</h2>
<br/><br/>
The student is confirmed : ${student.firstName} ${student.lastName}
<br/><br/>
County : ${student.country}
<br/><br/>
Favorite Language : ${student.favoriteLanguage}
<br/><br/>
Operating Systems :
<c:forEach var="temp" items="${student.operatingSystems}">
<ul>
    <li>${temp}</li>
</ul>
</c:forEach>

</body>
</html>