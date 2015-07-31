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
<body  bgcolor="grey">
<h3>Information for All Vehicles</h3>
<table width="100%" border="1">
<tr>
<th>Vehicle ID</th>
<th>PlateNumber</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<c:forEach items="${vehicle}" var="vehicle">

<tr>
<td>${vehicle.vehicleId}</td>
<td>${vehicle.vehiclePlateNumber}</td>
<td><a href="rental/edit/${vehicle.vehicleId}">Edit</a></td>
<td><a href="rental/delete/${vehicle.vehicleId}">Delete</a></td>
</tr>

</c:forEach>

</table>
<a href="vehicle/add">Add</a>


</body>
</html>