<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Register Form</h1>
	<form action="" method="post">
		<label>Student Id: </label> <input type="text" name="id" pattern="[0-9A-Z]{10}" placeholder="12A34B5678" required/><br><br>
		<label>Student Name: </label> <input type="text" name="sname" placeholder="Name" /><br><br>
		<label>Student Branch: </label> <input type="text" name="branch" placeholder="CSE" /><br><br>
		<input type="submit" name="insert" />
	</form>
	<br>
	<a href="GetAllDetailsPage.jsp">Get All Details of Students</a>
</body>
</html>