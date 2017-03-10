<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/resources/css/main.css"
	type="text/css" rel="stylesheet">
<title>Login</title>
</head>
<body onload='document.f.j_username.focus();'>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@taglib prefix="sql" uri="http://java.sun.com/jstl/sql"%>
	
	<c:if test="${param.error != null }">
		<span class="loginError"> login Failed, check user name and password are correct</span>
	
	</c:if>
	<form name='f'
		action='${pageContext.request.contextPath}/j_spring_security_check'
		method='POST'>
		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='j_username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
		</table>
		
		  <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>	
	</form>
</body>

<p> <a href = '<c:url value="/newaccount"/>'> Create New Login Account </a></p>

</html>