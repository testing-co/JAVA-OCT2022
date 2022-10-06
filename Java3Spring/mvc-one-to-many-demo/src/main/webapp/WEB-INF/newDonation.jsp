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
	<h1> Create a donation</h1>
	<form:form action="/donations/process" method="POST" modelAttribute="newDonation">
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
			<form:label path="donor"> Pick a donor </form:label>
		<form:select path="donor">
			<c:forEach var="eachUser" items="${userList }">
				<form:option value="${eachUser.id }"> ${eachUser.username } - ${eachUser.email }</form:option>
			</c:forEach>
		</form:select>
		<form:errors path="donor" style="color:red"/>
		<button type="submit"> Add</button>
   </form:form>
   </div>
</body>
</html>