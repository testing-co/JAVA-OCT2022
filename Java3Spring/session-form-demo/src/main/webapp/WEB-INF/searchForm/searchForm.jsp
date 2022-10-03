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
	<h1> Search keyword:  </h1>
		<form method="GET" action="/searchResult">
			<input type="text" name="keyword" />
			<button type="submit"> Search!</button>		
		</form>
	

</body>
</html>