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
		<h1> 1:n Donations</h1>
		<p> <a href="/users/new"> Create a new user</a>|
		<a href="/donations/new"> Create a new donation</a></p>
	<table>
		<thead>
			<tr>
				<th> ID </th>
				<th> Item name </th>
				<th> Quantity </th>
				<th> Donor </th>
				<th colspan=2> Actions </th> 
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
					<td> <c:out value="${eachDonation.donor.username }" /></td>
					<td>
					<a href="/donations/${eachDonation.id }" > View</a> |
					<a href="/donations/edit/${eachDonation.id }" > Edit</a> |
					</td>
					<td>
					<form action="/donations/delete/${eachDonation.id }" method="POST">
						<input type="hidden" name="_method" value="delete" />
						<button type="submit">Delete</button>
					</form>
					
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>   
	
	<h1> User table</h1>
		<table>
		<thead>
			<tr>
				<th> ID </th>
				<th> Username </th>
				<th> email </th>
				<th> Number of donations </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="eachUser" items="${userList }">
				<tr>
					<td>${eachUser.id } </td>
					<td> 
					<c:out value="${eachUser.username }"/>
					</td>
					<td> ${eachUser.email }</td>
					<td> ${eachUser.sentDonations.size() }</td>
					<td> 
						<a href="/users/${eachUser.id }"> View</a>
					
					</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>   
   </div>
</body>
</html>