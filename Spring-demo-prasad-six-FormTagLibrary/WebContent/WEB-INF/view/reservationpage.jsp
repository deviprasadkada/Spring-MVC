<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation page</title>
</head>
<body>
hi i am reservation page jsp 
<form:form action="submitForm" modelAttribute="reservation">  
        First name: <form:input path="firstName" />         
        <br><br>  
        Last name: <form:input path="lastName" />  
        <br><br>
        <br>
        Gender: 
        Male:<form:radiobutton path="gender" value="Male"/>
        Female:<form:radiobutton path="gender" value="Female"/>  
        Meals:
        Breakfast:<form:checkbox path="food" value="BreakFast"/>
        Lunch:<form:checkbox path="food" value="Lunch"/>
        Dinner:<form:checkbox path="food" value="Dinner"/>
        City:<form:select path="city">
        Kansas City:<form:option value="Kansas City" label="Kansas City"/>
        Jersey City:<form:option value="Jersey City" label="Jersey City"/>
        Chicago City:<form:option value="Chicago City" label="Chicago City"/>
        dallas City:<form:option value="Dallas City" label="Dallas City"/>
		        
        </form:select>
        <input type="submit" value="Submit" />      
    </form:form>  
</body>
</html>