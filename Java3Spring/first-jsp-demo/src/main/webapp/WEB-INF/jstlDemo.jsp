<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Demo for rendering data</h1>
	<h3>
		Name: ${jspName }
		<c:out value="${jspName }" />
	</h3>
	<h3>Age: ${jspAge }</h3>
	<h3>Is Hungry?: ${jspHungry }</h3>

	<p>
		<c:out value="${hackerScript }" />
	</p>
	<h1>If-statement</h1>
	<c:if test="${jspHungry == true }">
		<p>I am hungry</p>
	</c:if>
	
	<h1>If-else statement</h1>
	<c:choose>
		<c:when test="${jspAge >50 }">
			<p> You are older than 50 years old </p>
		</c:when>
		<c:otherwise>
			<p> You are younger than 50 years old </p>
		</c:otherwise>
	</c:choose>
	
	<h1>For-loop</h1>

	<ul>
		<c:forEach var="eachSkill" items="${ jspSkills}">
			<li> ${eachSkill }</li>
		</c:forEach>
	</ul>
	
	
</body>
</html>


