<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<base href="<c:url value="/" />" />
<body bgcolor="lightgrey">
	<h3>Please Inside the information for Vehicle here</h3>
	<form:form action="vehicle/save" modelAttribute="vehicle" method="POST">
	<form:errors path="*" element="div" cssClass="error"/>
	<br>
Vehicle Plate Number<br/>
		<form:input path="vehiclePlateNumber" type="text" />
		<br>
		Vehicle Type <br/>
		
		<form:select path="vehicleType" items="${vehicleTypes}" itemLabel="fullType" itemValue="vehicleTypeId" />
		
		<br/>	
		
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>