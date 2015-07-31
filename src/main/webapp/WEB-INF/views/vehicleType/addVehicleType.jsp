<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<base href="<c:url value="/" />" />
</head>
<body bgcolor="lightgrey">
<h3>ADD VehicleType here</h3>
<form:form action="vehicleType/save" modelAttribute="vehicleType"
		method="POST">
Brand<br>
		<form:input path="brand" type="text" />
		<br>
Make<br>
		<form:input path="make" type="text" />
		<br>
Model<br>
		<form:input path="model" type="text" />
		<br>
Type<br>
		<form:input path="type" type="text" />
		<br>
		<input type="submit" value="Add" />
	</form:form>
</body>
</html>