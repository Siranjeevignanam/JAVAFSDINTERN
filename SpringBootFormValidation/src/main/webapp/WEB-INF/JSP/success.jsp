<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="c" %>
       
       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Submitted</title>
</head>
<body>

<h1>user data submitted with validations</h1>
First Name:${user.fname}<br><br>
Last Name:${user.lname}<br><br>
Gender:${user.gender}<br><br>

Food:<ul>
<c:forEach var="food" items="${user.food}">
<li>${food}</li>}<br><br>}<br><br>
</c:forEach>
</ul>

Leaving from:${user.fromCity}<br><br>
Going to:${user.toCity}<br><br>
Journey date:${user.jdate}<br><br>
Seat no:
<ul>

<c:forEach var="seats" items="${user.seat}">
<li>${seats}</li>
</c:forEach> <br><br>
</ul>



</body>
</html>