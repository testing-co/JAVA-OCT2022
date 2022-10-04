<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Demo</title>
</head>
<body>
	<h1>Add a donation</h1>
	<form:form method="POST" action="/donations/new" modelAttribute="newDonation">
		<p>
			<form:label path="itemName">Item name</form:label>
			<form:input path="itemName" />
			<form:errors style="color:red" path="itemName" />
		</p>
		<p>
			<form:label path="quantity">Quantity</form:label>
			<form:input type="number" path="quantity" />
			<form:errors path="quantity" style="color:red"/>
		</p>
		<p>
			<form:label path="donor">Donor </form:label>
			<form:input path="donor" />
			<form:errors path="donor" style="color:red"/>
		</p>
		<button type="submit"> Add</button>
	</form:form>
</body>
</html>