<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
<title> Customer Form </title>
<style>
    .error {color:red}
</style>
</head>
<body>

<em>Fill out the form. Asterisk(*) means required.</em>

<form:form action="processForm" modelAttribute="customer">

First name : <form:input path="firstName"/>
<br/>
<br/>
Last name(*) : <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
<br/>
<br/>

No. od Free Passes(*) : <form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"/>
<br/>
<br/>

Postal Code : <form:input path="pinCode" />
<form:errors path="pinCode" cssClass="error"/>
<br/>
<br/>

Course Code : <form:input path="courseCode" />
<form:errors path="courseCode" cssClass="error"/>
<br/>
<br/>



<input type="submit" value="Submit"/>
</form:form>
</body>
</html>