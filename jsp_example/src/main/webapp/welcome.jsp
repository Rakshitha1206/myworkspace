<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= session.isNew() %>
<%= session.getId() %>

<% String location ="Chennai"; %>
<%! String name = "Ramesh"; %>
<% out.println("Hello"); %>
<% out.println("I am from JSP"); %>

<table>
	<tr>
		<td></td>
		<td></td>
		<td></td>
	</tr>
</table>

</body>
</html>