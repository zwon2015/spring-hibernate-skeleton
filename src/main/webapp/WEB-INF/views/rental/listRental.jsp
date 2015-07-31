<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<base href="<c:url value="/" />" />
</head>
<body>
<h1>Rental List  :</h1>

<table width="100%" border="1">
<tr>
<th>ID</th>
<th>Start Date</th>
<th>End Date</th>
<th>Max Duration</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<c:forEach items="${rental}" var="rental">

<tr>
<td>${rental.rentalId}</td>
<td><fmt:formatDate value="${rental.startDate}" pattern="yyyy-MM-dd" /></td>
<td><fmt:formatDate value="${rental.endDate}" pattern="yyyy-MM-dd" /></td>
<td><fmt:formatDate value="${rental.maxDuration}" pattern="yyyy-MM-dd" /></td>
<td><a href="rental/edit/${rental.rentalId}">Edit</a></td>
<td><a href="rental/delete/${rental.rentalId}">Delete</a></td>
</tr>

</c:forEach>

</table>
<form action="rental/add">
    <input type="submit" value="Add Rental">
</form>

</body>
</html>