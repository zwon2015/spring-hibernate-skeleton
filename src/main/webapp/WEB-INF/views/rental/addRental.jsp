<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<base href="<c:url value="/" />" />
</head>
<body bgcolor="lightgrey">
	<p> Please Fill out the rental information below: </p>
	<form:form action="rental/save" modelAttribute="rental"
		method="POST">
Start Date:<br>
		<form:input path="StartDate" type="text" />
		<br>
Max Date:<br>
		<form:input path="maxDuration" type="text" />
		<br>
End Date:<br>
		<form:input path="endDate" type="text" />
		<br>
		<br>
		<input type="submit" value="Add" />
	</form:form>
</body>
</html>