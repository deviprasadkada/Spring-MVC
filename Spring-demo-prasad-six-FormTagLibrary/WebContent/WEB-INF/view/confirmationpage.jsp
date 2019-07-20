<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Page</title>
</head>
<body>
<h1> hi this is confirmqation page jsp</h1>

<p>Your reservation is confirmed successfully. Please, re-check the details.</p>  
First Name : ${reservation.firstName} <br>  
Last Name : ${reservation.lastName}<br>
Gender: ${reservation.gender}<br>
Food: ${reservation.food}<br>
Meals:   
<ul>  
<c:forEach var="meal" items="${reservation.food}">  
<li>${meal}</li>  
</c:forEach>  
</ul> 
<br><br>
City:${reservation.city }

</body>
</html>