<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="createContact" modelAttribute="contactDTO"
		method="POST">
		<p><a href="viewAllContacts">View All Contacts</a></p>
		<table>
			<tr>
				<td><form:hidden path="contactId"/></td>
			</tr>
			<tr>
				<td>First Name :</td>
				<td><form:input path="fname" /></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><form:input path="lname" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><form:input path="gender" /></td>
			</tr>
			<tr>
				<td>Role :</td>
				<td><form:input path="role" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="reset" /></td>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>