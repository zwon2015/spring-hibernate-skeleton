<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" />
<title>Insert title here</title>
<base href="<c:url value="/" />" />
</head>
<body>
	<p>Please Fill out the your information below!!!</p>
	<form:form action="customer/save" modelAttribute="customer"
		method="POST">
Customer Name:<br>
		<form:input path="name" type="text" />
		<br>
Customer Phone:<br>
		<form:input path="phone" type="text" />
		<br>
Customer Email:<br>
		<div id="customer_email">
			<form:input path="email" type="text" />
		</div>
		<br>
Customer Street:<br>
		<form:input path="street" type="text" />
		<br>
Customer Zipcode:<br>
		<form:input path="zipcode" type="text" />
		<br>
Customer State:<br>
		<form:input path="state" type="text" />
		<br>
		<input type="submit" value="Add" />
		<br>
	</form:form>
</body>
</html>