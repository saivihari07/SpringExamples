<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>

	<c:if test="${param.error != null }">
		<i style="color: red"><h3>Invalid login credentials</h3></i>
	</c:if>
	<c:if test="${param.logout != null }">
		<i style="color: green">successfully logged out</i>
	</c:if>
	<h1>Login page</h1>
	<form:form>
		Username: <input type="text" name="username">
		<br>
		Password: <input type="password" name="password">
		<br>

		<input type="submit" value="Login">
	</form:form>

</body>
</html>