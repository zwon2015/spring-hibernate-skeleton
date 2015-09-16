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
					<li><a href="./">MainPage</a></li>
					<li><a href="customer">Customer</a></li>
					<li><a href="rental">Rental</a></li>
					<li class="active"><a href="vehicle">Vehicle</a></li>
					<li><a href="vehicleType">Vehicle Type</a></li>
					<li><a href="reservation">Reservation</a></li>

				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>

	<div class="container">
		<h3>Please Fill out the VehiclesType info below:</h3>
		<br>
		<form:form action="vehicleType/save" modelAttribute="vehicleType"
			method="POST">
			<b>Brand:</b>
			<form:input path="brand" type="text" /><br>
			<b>Make:</b>
			<form:input path="make" type="text"/><br>
			<b>Model:</b>
			<form:input path="model" type="text" /> <br>
			<b>Type:</b>
			<form:input path="type" type="text"/>
			<br><br>
			<input type="submit" value="Add"/>
			
		</form:form>

	</div>
	<!-- /.container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>
