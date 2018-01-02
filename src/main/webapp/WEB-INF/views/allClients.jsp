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

<link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/table.css"/>">
<title>Finalize repair</title>
</head>

<body>

 <center>
<div class="table">
    
    <div class="row header">
      <div class="cell">
       #
      </div>
      <div class="cell">
        <b>Client</b>
      </div>
      <div class="cell">
        <b>Date</b>
      </div>
      <div class="cell">
        <b>Device</b>
      </div>
      <div class="cell">
        <b>Contact</b>
      </div>
      <div class="cell">
        <b>Description</b>
      </div>
      <div class="cell">
        <b>Status</b>
      </div>
      <div class="cell">
        <b>Action</b>
      </div>
    </div>
    <c:forEach items="${clients}" var="client">
    <div class="row">
      <div class="cell">
      <b>${client.id}</b>
      </div>
      <div class="cell">
       <b>${client.firstName} ${client.lastName}</b>
      </div>
      <div class="cell">
      <b>${client.dateOfAdd}</b>
      </div>
      <div class="cell">
       <b>${client.brand} ${client.model} ${client.colour}</b> 
      </div>
      <div class="cell">
       <b>${client.phone} ${client.email}</b>
      </div>
      <div class="cell">
        <b>${client.descriptionOfTheFault}</b>
      </div>
      <div class="cell">
       <b>${client.status.status}</b>
      </div>
      <div class="cell">
      <b></b>
      </div>
      
      
    </div> 
    </c:forEach>
   
    </div>
</center>
 
 
<script src="<c:url value = "/resources/vendor/jquery/jquery.min.js"/>"></script>
	<script src="<c:url value = "/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
</body>
</html>