<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<base href="<c:url value="/" />" />
</head>
<body>
<h1>Customer List</h1>

<table width="100%" border="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Phone</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<c:forEach items="${customers}" var="customer">

<tr>
<td>${customer.customerId}</td>
<td>${customer.name}</td>
<td>${customer.phone}</td>
<td><a href="customer/edit/${customer.customerId}">Edit</a></td>
<td><a href="customer/delete/${customer.customerId}">Delete</a></td>


</tr>
</c:forEach>

</table>
<form action="customer/add">
    <input type="submit" value="Add Customer">
</form>
</body>
</html>