<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello this is security page</h1>
<sec:authorize access='hasAuthority("ADMIN")'>
<a href="/Ecommerce/admin"> click here to go to admin page</a>
</sec:authorize><br><br>

<sec:authorize access='hasAuthority("USER")'>
<a href="/Ecommerce/user"> click here to go to user page</a>
</sec:authorize>

</body>
</html>