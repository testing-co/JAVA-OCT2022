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
   <p> <a href="/"> Back</a> </p>
		<h3> Donation: ${donation.itemName }</h3>
		<h3> Quantity: ${donation.quantity }</h3>
		<h3> Donor name: ${donation.donor.username }</h3>
		<h3> Donor contact info: ${donation.donor.email }</h3>
   </div>
</body>
</html>