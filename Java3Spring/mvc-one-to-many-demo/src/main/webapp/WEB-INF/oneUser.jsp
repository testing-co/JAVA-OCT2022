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
		<h1> <c:out value="${user.username }" /></h1>
		<h5> Email : <c:out value="${user.email }" /></h5>
		<ul>
			<c:forEach var="eachDonation" items="${ user.sentDonations}">
				<li> ${eachDonation.itemName } - ${eachDonation.quantity } </li>
			</c:forEach>
		</ul>
   </div>
</body>
</html>