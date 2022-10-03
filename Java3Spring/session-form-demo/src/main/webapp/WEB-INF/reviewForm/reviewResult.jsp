<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Demo</title>
</head>
<body>
<h1> Review Result</h1>
	<table>
		<tr>
			<td>Product:</td>
			<td><c:out value="${ product}"></c:out></td>
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


</body>
</html>