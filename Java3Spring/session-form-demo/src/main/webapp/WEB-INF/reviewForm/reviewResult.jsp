<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Demo</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="container mt-5" >
<h1 class="red-text"> Review Result</h1>
	<table class="table">
		<tr>
			<td>Reviewer:</td>
			<td><c:out value="${ reviewer}"></c:out></td>
		</tr>
		<tr>
			<td>Product:</td>
			<td><c:out value="${ productInSession}"></c:out></td>
		</tr>
		<tr>
			<td>Rating:</td>
			<td><c:out value="${ rating}"></c:out></td>
		</tr>
		<tr>
			<td>Comments:</td>
			<td><c:out value="${ comments}"></c:out></td>
		</tr>


	</table>
</div>

</body>
</html>