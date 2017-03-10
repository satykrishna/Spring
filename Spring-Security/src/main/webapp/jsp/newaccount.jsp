<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add New User </title>
<script defer type="text/javascript" src="${pageContext.request.contextPath }/resources/scripts/jquery.js"></script>
<script defer type="text/javascript" src="${pageContext.request.contextPath }/resources/scripts/validation.js"></script>
</head>
<body>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@taglib prefix="sql" uri="http://java.sun.com/jstl/sql"%>
	<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>

	

<h2>Create a new account to login</h2>

	<sf:form action="${pageContext.request.contextPath}/createAccount"
		method="get" commandName="user" id="details">
		<table>
			<tr>
				<td>name</td>
				<td><sf:input type="text"  path="username" name="username"/> 
				<br/>
				
				<div><sf:errors path="username" cssClass="error"></sf:errors></div>
				  </td>
			</tr>
			<tr>
				<td>email</td>
				<td><sf:input type="text" path="email" name="email" /><br/> 
				<div><sf:errors path="email" cssClass="error"></sf:errors> </td></div>
			</tr>
			<tr>
				<td>password</td>
				<td><sf:input type="text" path="password" name="password" /><br/> 
			<div>	<sf:errors path="password" cssClass="error"></sf:errors> </td></div>
			</tr>
			<tr>
				<td>Confirm password</td>
				<td><input type="text"  name="confirmPassword" /><br/> </td>
				<td> <div id="matchPass"></div></td>
			</tr>
			<tr>
				<td><input type="submit"  value="create account"/></td>
			</tr>

		</table>

	</sf:form>
</body>
</html>