<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script></script>
</head>
<body>
	<p><a href="createContact">Create Contact</a></p>
	<table border = "1px solid black">
		<thead>
			<td>Sr. No</td>
			<td>Name</td>
			<td>Email</td>
			<td>Gender</td>
			<td>Role</td>
			<td>Actions</td>
		</thead>
		<tbody>
			<c:forEach items="${cdto}" var="c" varStatus="index">
				<tr>
					<td>${index.count}</td>
					<td><pre>${c.fname } ${c.lname }</pre></td>
					<td>${c.email }</td>
					<td>${c.gender }</td>
					<td>${c.role }</td>
					<td>
						<a href="editContactById?contactId=${c.contactId }">Edit</a> || 
						<a href="deleteContactById?contactId=${c.contactId }">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>