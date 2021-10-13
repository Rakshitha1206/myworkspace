<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.html" %>
<h4>List of Names-Fourth</h4>
<%= session.isNew() %>
<%= session.getId() %>
<c:out value="${name} ${Location }"/>
<% session.invalidate(); %>
</body>
</html>