<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<style>
table{
marign-left:auto;
marign-right:auto;
border:2px soild black;
text-align:center;
border-collapse:collapse;
}
th,td,tr{
border:2px soild black;
h2{
text-align:center;
}
</style>
</head>
<body>
<h2>Student Details</h2>
<table border="1">
	<tr>
		<th>Sl.No</th>
		<th>Name</th>
		<th>Mark Scored</th>
	</tr>
<c:forEach items="${foundStudent}" var="eachStudent">
		<tr>
			<td>${eachStudent.id}</td>
			<td>${eachStudent.name}</td>
			<c:if test="${eachStudent.markScored<80}">
			<td style="color:#ff0000">${eachStudent.markScored}</td>
			</c:if>
			<c:if test="${eachStudent.markScored>=80}">
			<td>${eachStudent.markScored}</td>
			</c:if>
		</tr>
</c:forEach>
</table>
</body>
</html>