<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UpdateData" method="get">
		<label>Student Id: </label> <input type="text" value=<%=request.getParameter("id") %> name="ids" /><br><br>
		<label>Student Name: </label> <input type="text" name="sname" placeholder="Name" /><br><br>
		<label>Student Branch: </label> <input type="text" name="branch" placeholder="CSE" /><br><br>
		<input type="submit" name="insert" />
	</form>
</body>
</html>