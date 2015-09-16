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

<title>Starter Template for Bootstrap</title>

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
					<li class="active"><a href="./">MainPage</a></li>
					<li><a href="customer">Customer</a></li>
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

		<div class="starter-template">
			<h1>You are in Main Page</h1>
			<%-- <img alt=""
				src='<c:import url="http://image.made-in-china.com/43f34j00lsgtnuYzvrcP/3-5mm-AV-Jack-Mini-Camera-520tvl-0-008-Low-Lux-Mini-Size-11-5x11-5x17mm-MC900DA-E-.jpg"></c:import>'>
				 --%>
			<img alt=""
				src="http://image.made-in-china.com/43f34j00lsgtnuYzvrcP/3-5mm-AV-Jack-Mini-Camera-520tvl-0-008-Low-Lux-Mini-Size-11-5x11-5x17mm-MC900DA-E-.jpg">
		</div>

	</div>
	<!-- /.container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>
