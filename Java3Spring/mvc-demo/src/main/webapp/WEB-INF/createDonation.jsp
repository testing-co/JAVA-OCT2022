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
	<h1> Add a donation</h1>
	<form method="POST" action="/donations/create/process">
		<div>
			<label> Item name: </label>
			<input type="text" name="itemName" />
		</div>
		<div>
			<label> Quantity: </label>
			<input type="number" name="quantity" />
		</div>
		<div>
			<label>Donor: </label>
			<input type="text" name="donor" />
		</div>
		<button type="submit"> Add </button>
	</form>
</body>
</html>