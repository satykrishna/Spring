<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Offer</title>
</head>
<body>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@taglib prefix="sql" uri="http://java.sun.com/jstl/sql"%>



	<sf:form action="${pageContext.request.contextPath}/doCreate"
		method="get" commandName="offer">
		<table>
			<tr>
				<td>name</td>
				<td><sf:input type="text"  path="name" name="name"/> 
				<br/> <sf:errors path="name" cssClass="error"></sf:errors> </td>
			</tr>
			<tr>
				<td>email</td>
				<td><sf:input type="text" path="email" name="email" /><br/> <sf:errors path="email" cssClass="error"></sf:errors> </td>
			</tr>
			<tr>
				<td>Your Offer</td>
				<td><sf:textarea type="text" name="text" path="text" cols="10" rows="10"></sf:textarea><br/> <sf:errors path="text" cssClass="error"></sf:errors> </td>
			</tr>
			<tr>
				<td><input type="submit"  value="submit"/></td>
			</tr>

		</table>

	</sf:form>
</body>
</html>