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
<style type="text/css">
.show {
	display: block;
	visibility: visible;
}

.firstRow4RunnersHomePage {
	border: 10px solid #fff;
	float: left;
	height: 300px;
	width: 300px;
	margin: 20px;
	overflow: hidden;
	-webkit-box-shadow: 5px 5px 5px #111;
	box-shadow: 5px 5px 5px #111;
}

#homePageHeaderOne {
	font-style: italic;
	color: grey;
}

.homePageHeaderOne {
	font-style: italic;
	color: grey;
}

.hidden {
	display: none;
	visibility: hidden;
}

.4RunnerImageHover{
	opacity: 0.5;
}

#redBanner {
	background-color: red;
	height: 50px;
	width: 1100px;
	padding: 5px;
	border: 1px solid black;
	padding: 20px;
}

#div2 {
	background-color: green;
}

#wait {
	background-color: blue;
	height: 100px;
	width: 300px;
	display: none;
}
#cartAddedImage{
	
position: absolute;
    top: 15px;
    right: 0px;
    height: 100px;
	width: 100px;
	
	

}
</style>
</head>


<body ng-app>

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


			<div id="">
			
			</div>
			<br></br>
			<div id="redBanner" class="show">

				<a href="#myPopupDialog" alt="cartAddedImage" data-rel="popup"
					data-position-to="window" data-transition="fade"
					class="ui-btn ui-corner-all ui-shadow ui-btn-inline hidden"><img
					src="https://www.brcats.com/sites/all/themes/cats/images/cart-ico.png"></a>



				<!-- 			<img alt="leftSideImg" -->
<!-- 				class="hidden" id="cartAddedImage" -->
<!-- 				src="https://www.brcats.com/sites/all/themes/cats/images/cart-ico.png" /> -->
			</div>
			<!-- <div id="divTestArea1">
					<a href="javascript:void(0);" onclick="AddBox();">Add box</a>
					<div class="test">This is a box</div>
				</div> -->
		</div>
	</nav>

	<div class="container">

		<div class="starter-template">
			<h1 id="homePageHeaderOne" class="homePageHeaderOne">
				<b> <i></i>White Four Runners 2016<i></i></b>
			</h1>
			<%-- <img alt=""
				src='<c:import url="http://image.made-in-china.com/43f34j00lsgtnuYzvrcP/3-5mm-AV-Jack-Mini-Camera-520tvl-0-008-Low-Lux-Mini-Size-11-5x11-5x17mm-MC900DA-E-.jpg"></c:import>'>
					 --%>

			<input type="button" id="button1" italic="false"
				class="homePageHeaderOne" style="color: red"
				value="Win those SUV's for free" /><br></br>
			<input type="button" id="freeButtonHomePage" value="FREE"
				style="color: red" /><br></br>	
		</div>
		<div id="div11" >
			<img alt="leftSideImg"
				class="hidden" id="addToCartImage"
				src="http://simonhedley.com/wp-content/uploads/addtocart.jpg" />
		</div>
		<div id="div12" class="hidden">
		<b style="font-style: italic; padding-bottom: 50%;"> ADDED TO CART</b>
		</div>
		<div id="frontPage-image-dropdown" class="frontPage-image-dropdown">

			<!-- <select id="hot2016" class="hottestTop4Cars" data-imagesrc="http://fordduty.com/wp-content/uploads/2015/02/2016-toyota-4runner.jpg" />
				</select> -->
			 
				<img alt="leftSideImg"
				class="firstRow4RunnersHomePage 4RunnerImageHover show" id="leftSideImg4RunnerWhite"
				src="http://fordduty.com/wp-content/uploads/2015/02/2016-toyota-4runner.jpg" />
			<img alt="rightSideImg" class="firstRow4RunnersHomePage 4RunnerImageHover show"
				id="rightSideImg4RunnerWhite" 
				src="https://s-media-cache-ak0.pinimg.com/originals/8d/92/c6/8d92c6c0a2bac1dcd831763dea8a9d46.jpg">
			<img alt="topViewSideImg" class="firstRow4RunnersHomePage 4RunnerImageHover show"
				id="topSideImg4RunnerWhite"
				src="https://i.ytimg.com/vi/zs6sflvjZuI/hqdefault.jpg" /> <img
				alt="frontSideImg" class="firstRow4RunnersHomePage 4RunnerImageHover show"
				id="FrontSideImg4RunnerWhite"
				src="http://o.aolcdn.com/dims-shared/dims3/GLOB/legacy_thumbnail/750x422/quality/95/http://www.blogcdn.com/slideshows/images/slides/260/712/0/S2607120/slug/l/03-2014-toyota-4runner-limited-review-1.jpg">


		</div>
		<div>
		<input type="button" id="zoomImage" value="Show Bigger" class="hidden"
				style="color: red" />
		</div>
	</div>
	<!-- /.container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->

	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/script.js"></script>
</body>
</html>
