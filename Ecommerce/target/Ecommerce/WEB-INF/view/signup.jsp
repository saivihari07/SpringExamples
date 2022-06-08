<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/process-signup" modelAttribute="signup" method="POST">
	
		Username: <form:input path="username"/><br><br>
		Password: <form:password path="password"/><br><br>
		
		<input type="submit" value="SignUp">
		
	</form:form>
</body>
</html>