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
<body bgcolor="grey">
<h5>All vehicleType</h5>

<table width="100%" border="1">
<tr>
<th>Vehicle Type ID</th>
<th>Brand</th>
<th>Make</th>
<th>Model</th>
<th>Type</th>
</tr>

<c:forEach items="${vehicleTypes}" var="vehicleType">

<tr>
<td>${vehicleType.vehicleTypeId}</td>
<td>${vehicleType.brand}</td>
<td>${vehicleType.make}</td>
<td>${vehicleType.model}</td>
<td>${vehicleType.type}</td>
<td><a href="vehicleType/edit/${vehicleType.vehicleTypeId}">Edit</a></td>
<td><a href="vehicleType/delete/${vehicleType.vehicleTypeId}">Delete</a></td>
</tr>

</c:forEach>

</table>
<a href="vehicleType/add">Add</a>
</body>
</html>