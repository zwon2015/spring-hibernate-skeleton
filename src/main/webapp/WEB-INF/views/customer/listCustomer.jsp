<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">


<base href="<c:url value="/" />" />

<link href="resources/css/bootstrap.min.css" rel="stylesheet">


<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="./">Main page</a></li>
					<li class="active"><a href="customer">Customer</a></li>
					<li><a href="rental">Rental</a></li>
					<li><a href="vehicle">Vehicle</a></li>
					<li><a href="vehicleType">Vehicle Type</a></li>
					<li><a href="reservation">Reservation</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>

	<div class="container">

		<h1>Customers List</h1>
		<table width="100%" border="1">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Phone</th>
				<th>State</th>
				<th>Street</th>
				<th>Zip-code</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>

			<c:forEach items="${customers}" var="cus">
				<tr>
					<td>${cus.customerId}</td>
					<td>${cus.name}</td>
					<td>${cus.phone}</td>
					<td>${cus.state}</td>
					<td>${cus.street}</td>
					<td>${cus.zipcode}</td>
					<td><a href="customer/edit/${cus.customerId}">Edit</a></td>
					<td><a href="customer/delete/${cus.customerId}">Delete</a></td>
				</tr>
			</c:forEach>


		</table>

	</div>
	<!-- /.container -->
	<br>
	<div style="text-align: center;">
		<a href="customer/add">Add Customer</a>
	</div>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>
