<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
<%@ page isELIgnored="false" %>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

First name : <form:input path="firstName"/>
<br/>
<br/>
Last name : <form:input path="lastName"/>
<br/>
<br/>

country:
<form:select path="country">
    <form:options items="${student.listOfCountries}" />
</form:select >
<br/>
<br/>

Favorite Language:

Java <form:radiobutton path="favoriteLanguage" value="Java"/>
Python <form:radiobutton path="favoriteLanguage" value="Python"/>
C# <form:radiobutton path="favoriteLanguage" value="C#"/>
PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>

<br/>
<br/>
Operating Systems:

Java <form:checkbox path="operatingSystems" value="Linux"/>
Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>


<br/>
<br/>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>