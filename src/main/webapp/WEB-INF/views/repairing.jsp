<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="vieport" content="width = device-width, initial-scale=1">

<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css"/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/full.css"/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/login.css"/>">
<title>Finalize repair</title>
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
				<li class="nav-item active"><a class="nav-link"
					href="newRepair">New Repair <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<c:url value = "inRepair"/>">In Repair</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<c:url value = "repairing"/>">Repair</a></li>

				<li class="nav-item"><a class="nav-link"
					href="<c:url value = "repaired"/>">Repaired</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<c:url value = "/"/>">Log out</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<div class="wrapper">

		<form:form method="post" modelAttribute="repairs" class="form-signin">

			<form:input path="technician" class="form-control"
				placeholder="Technician" />

			<form:input path="workCosts" class="form-control"
				placeholder="Work costs" />

			<form:input path="partsCosts" class="form-control"
				placeholder="Parts costs" />

			<form:input path="parts" class="form-control"
				placeholder="Parts used" />

			<form:input path="dateOfRepair" class="form-control"
				placeholder="Date of repair" />

			<form:select path="client" items="${clients}" class="form-control"
				itemLabel="lastName" itemValue="id" />

		  	<form:select path="status" items="${status}" class="form-control"
				itemLabel="status" itemValue="id" />

			<form:textarea path="descriptionOfRepair" class="form-control"
				placeholder="Description of repair" />
			<br>
			<br>

			<input class="btn btn-lg btn-primary btn-block" type="submit"
				value="Save">
		</form:form>

	</div>



	<script src="<c:url value = "/resources/vendor/jquery/jquery.min.js"/>"></script>
	<script
		src="<c:url value = "/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
</body>
</html>
