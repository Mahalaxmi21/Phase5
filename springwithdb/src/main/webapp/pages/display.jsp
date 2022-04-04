<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.example.demo.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%   List<Student> ss=(List<Student>)request.getAttribute("list");%>
<table border="1">
<tr><th>Student id</th><th>Student name</th><th>Student email</th></tr>
<%for(Student stu:ss) {%>
<tr><td><%=stu.getSid() %></td><td><%=stu.getName() %></td><td><%=stu.getEmail() %></td></tr>

<%} %>
</table>

</body>
</html>