<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<style type="text/css">
.error
{
color:red;
form-style:italic;
}


</style>
</head>


<body>
<h1>Register Form</h1>

<form:form action="userregister" method="post" modelAttribute="user">


<div>
<form:label path="fname">Username:</form:label>
<form:input path="fname"/>
<form:errors path="fname" cssClass="error"></form:errors>
</div><br>

<div>
<form:label path="lname">Lastname:</form:label>
<form:input path="lname"/>
<form:errors path="lname" cssClass="error"></form:errors>
</div><br>


<div>
<form:label path="email">User email:</form:label>
<form:input path="email"/>
<form:errors path="email" cssClass="error"></form:errors>
</div><br>

<div>
<form:label path="jDate">Start Date:</form:label>
<form:input path="jDate" type="date"/>
<form:errors path="jDate" cssClass="error"></form:errors>
</div><br>

<div>
<form:label path="gender">Select Gender:</form:label>

<form:radiobutton path="gender" value="Male" label="Male"></form:radiobutton>
<form:radiobutton path="gender" value="Female" label="Female"></form:radiobutton>

<form:errors path="gender" cssClass="error"></form:errors>
</div><br>

<div>
<form:label path="fromCity">From:</form:label>
<form:input path="fromCity" />
<form:errors path="fromCity" cssClass="error"></form:errors>
</div><br><br>




<div>
<form:label path="toCity">To:</form:label>
<form:input path="toCity" />
<form:errors path="toCity" cssClass="error"></form:errors>
</div><br>

<div>
<form:label path="food">Select Gender:</form:label>

<form:radiobutton path="food" value="Breakfast" label="Breakfast"></form:radiobutton>
<form:radiobutton path="food" value="Lunch" label="Lunch"></form:radiobutton>
<form:radiobutton path="food" value="Dinner" label="Dinner"></form:radiobutton>

<form:errors path="food" cssClass="error"></form:errors>
</div><br>

<div>
<form:label path="food">Select Gender:</form:label>

<form:radiobutton path="seat" value="m1" label="M1"></form:radiobutton>
<form:radiobutton path="seat" value="m2" label="M2"></form:radiobutton>
<form:radiobutton path="seat" value="u1" label="U1"></form:radiobutton>
<form:radiobutton path="seat" value="u2" label="U2"></form:radiobutton>
<form:radiobutton path="seat" value="l1" label="L1"></form:radiobutton>
<form:radiobutton path="seat" value="l2" label="L2"></form:radiobutton>

<form:errors path="food" cssClass="error"></form:errors>
</div><br>

<input type="submit" value="register">

</form:form>

</body>
</html>