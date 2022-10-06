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
	<h1> Edit a donation</h1>
	<form:form action="/donations/edit/${donation.id }" method="POST" modelAttribute="donation">
	<input type="hidden" name="_method" value="put" />
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
			<form:hidden path="donor" />

		<button type="submit"> Edit</button>
   </form:form>
   </div>
</body>
</html>