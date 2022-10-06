<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title> Donation Board</title>

</head>
<body>
   <div class="container mt-5">
	<h1> Create a user</h1>
	<form:form action="/users/process" method="POST" modelAttribute="newUser">
		<p>
			<form:label path="username">User name</form:label>
			<form:input path="username" />
			<form:errors style="color:red" path="username" />
		</p>
				<p>
			<form:label path="email">Email</form:label>
			<form:input path="email" />
			<form:errors style="color:red" path="email" />
		</p>	
		<button type="submit"> Add</button>
	</form:form>
   
   </div>
</body>
</html>