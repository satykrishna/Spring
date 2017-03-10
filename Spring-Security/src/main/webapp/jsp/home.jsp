<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SATYA</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@taglib prefix="sql" uri="http://java.sun.com/jstl/sql"%>
	<!-- spring security taglib is required for below taglib -->
	<%@taglib uri="http://www.springframework.org/security/tags"
		prefix="sec"%>

	<p>
		<a href="${pageContext.request.contextPath}/offers"> Offers List</a>
	</p>
	<p>
		<a href="${pageContext.request.contextPath}/createOffer">Create
			New Offer</a>
	</p>
	<p>
		<sec:authorize access="!isAuthenticated()">
			<a
				href="${pageContext.request.contextPath }/login">Login</a>
		</sec:authorize>
	<p>
	<p>
		<sec:authorize access="isAuthenticated()">
			<a
				href="${pageContext.request.contextPath }/j_spring_security_logout">Logout</a>
		</sec:authorize>
	<p>
		<sec:authorize access="hasRole('admin')">
		<a href="${pageContext.request.contextPath }/admin">Admin</a>
		</sec:authorize>

	</p>
</body>
</html>