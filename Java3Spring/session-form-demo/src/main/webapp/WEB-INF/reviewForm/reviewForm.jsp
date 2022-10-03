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
	<h1> Review form</h1>
	<form action="/process/review" method="POST">
		<div>
			<label> Product </label>
			<input type="text" name="product" />
		</div>
		<div>
			<label> Rating </label>
			<input type="number" name="rating" />
		</div>
		<div>
			<label> Comments </label>
			<textarea name="comments"></textarea>
		</div>
	
		<button type="submit"> Submit</button>
	</form>
</body>
</html>