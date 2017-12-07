<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="vieport" content="width = device-width, initial-scale=1">

<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/full.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/login.css"/>">
<title>New Order</title>
</head>

<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="/AVS/user">AVS</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item active"><a class="nav-link" href="AVS/user/newRepair">New Repair
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="<c:url value = "inRepair"/>">In Repair</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="<c:url value = "describeRepair"/>">Finish Repair</a></li>
					
					<li class="nav-item"><a class="nav-link" href="<c:url value = "repaired"/>">Repaired</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="<c:url value = "/"/>">Log out</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>

	<div class = "wrapper">
	     
		<form:form method="post" modelAttribute="client" class="form-signin">
        
        <form:input path="firstName" class="form-control" placeholder="First Name"/> 
        
        <form:input path="lastName" class="form-control" placeholder="Last Name" />
        
        <form:input path="email" class="form-control" placeholder="Email" />
        
        <form:input path="streetAndLocalNumber" class="form-control" placeholder="Street and building number"/>
        
        <form:input path="city" class="form-control" placeholder="City" />
        
        <form:input path="postCode" class="form-control" placeholder="Post Code" />
         
        <form:input path="phone" class="form-control" placeholder="Phone"/>
       
        <form:input path="brand" class="form-control" placeholder="Brand"/> 
        
        <form:input path="model" class="form-control" placeholder="Model"/> 
        
        <form:input path="colour" class="form-control" placeholder="Colour"/> 
        
        <form:input path="deviceCondition" class="form-control" placeholder="Device Condition"/> 
        
        <form:input path="technician" class="form-control" placeholder="Technician"/> 
        
        <form:input path="type" class="form-control" placeholder="Type"/> 
        
        <form:input path="dateOfAdd" class="form-control" placeholder="Date: 01-01-2000"/>
        
        <form:textarea path="descriptionOfTheFault" class="form-control" placeholder="Description of the fault"/> <br><br>

			<input class="btn btn-lg btn-primary btn-block" type="submit" value="Save">
		</form:form>
	</div>



	<script src="<c:url value = "/resources/vendor/jquery/jquery.min.js"/>"></script>
	<script src="<c:url value = "/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
</body>
</html>
