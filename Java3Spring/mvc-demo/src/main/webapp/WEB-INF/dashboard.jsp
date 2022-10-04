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
	<h1> Donation Board</h1>
	<p> <a href="/donations/new"> Add a donation</a> </p>
	<table>
		<thead>
			<tr>
				<th> ID </th>
				<th> Item name </th>
				<th> Quantity </th>
				<th> Donor </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="eachDonation" items="${donationList }">
				<tr>
					<td>${eachDonation.id } </td>
					<td> 
					<a href="/donations/${eachDonation.id }">
					<c:out value="${eachDonation.itemName }"/></a>
					</td>
					<td> ${eachDonation.quantity }</td>
					<td> <c:out value="${eachDonation.donor }" /></td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>