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
	<h1>Donation details</h1>
	<table>
		<tr>
			<td>Item name:</td>
			<td><c:out value="${donation.itemName }" /></td>
		</tr>
		<tr>
			<td>Quantity:</td>
			<td><c:out value="${donation.quantity }" /></td>
		</tr>
		<tr>
			<td>Donor:</td>
			<td><c:out value="${donation.donor }" /></td>
		</tr>
	</table>
</body>
</html>