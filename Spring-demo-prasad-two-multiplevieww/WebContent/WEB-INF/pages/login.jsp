<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login jsp file</title>
</head>
<body>

<form:form action="login" method="post" modelAttribute="loginForm">
 <form:input path="username" />
 <form:password path="password" />
 <input type="submit" value="OK" />
</form:form>



</body>
</html>