<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@taglib prefix="sql" uri="http://java.sun.com/jstl/sql"%>

	<table>
	<th>
		<td> Name </td>
		<td> Email </td>
		<td> Text </td>
	 </th>
		<c:forEach var="eachOffer" items="${offers}">
			<tr>
				<td>${eachOffer.name} </td>
				<td>${eachOffer.email}</td>
				<td>${eachOffer.text }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>