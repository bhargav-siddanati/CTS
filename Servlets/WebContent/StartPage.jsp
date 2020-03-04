<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page  import = "java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello bro this is the new JSP page.</h1>
	<%!String name = "Bhargav";%>
	<%Date d = new Date();
	out.println("Hey "+  name +" Todays date is " + d); %>
	<%--@ include file="SecondJSPpage.jsp"--%>
	<jsp:forward page="SecondJSPpage.jsp" />
	
	 <!-- <a href="SecondJSPpage.jsp?id=10">Click here</a>  --><br>
	 Enter Name<input type="text" name="name1"><br>
	 <% application.setAttribute("name","name1"); %><br>
	 <a href="SecondJSPpage.jsp">hello</a>
	 
	

	
</body>
</html>