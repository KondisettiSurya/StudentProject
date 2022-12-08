<%@page import="Models.Students" %>
<%@page import="java.util.List"%>
<%@page import="DBConnection.StudentDb"%>
<%@page import="Dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>
<%@include file="css.jsp" %>
</head>
<body style="background: linear-gradient(245deg, #A5FEFE 0, #4F92F6 44%); background-repeat: no-repeat; height: 42rem;">
<%@include file="Navbar1.jsp" %>

<div class="container p-5">

<a href="Home.jsp"><button class="btn btn-outline-warning btn-md">Back</button></a>

<p class="text-center" style="font-family: sans-serif; font-size: 2.5rem">Students Details</p>

<table class="table table-hover" style="font-weight: 400;" >

<thead>

<tr>

<th>StudentName</th>
<th>Section</th>
<th>Class</th>
<th>Email</th>
<th>Password</th>
<th>FatherName</th>
<th>MotherName</th>
<th>RollNumber</th>
<th>Action</th>
</tr>

</thead>

<tbody>

<%

StudentDao dao = new StudentDao(StudentDb.getConn());

List<Students> list = dao.getAllStudents();

for(Students s : list)

{

%>

<tr>

<td><%=s.getStudentname()%></td>
<td><%=s.getSection()%></td>
<td><%=s.getClas()%></td>
<td><%=s.getEmail()%></td>
<td><%=s.getPassword()%></td>
<td><%=s.getFathername()%></td>
<td><%=s.getMothername()%></td>
<td><%=s.getRollnumber()%></td>
<td>

<a href="update.jsp?Rollnumber=<%=s.getRollnumber()%>"> <button class="btn btn-outline-success btn-sm">Update</button></a>

<a href="delete?Rollnumber=<%=s.getRollnumber()%>"><button class="btn btn-outline-danger btn-sm">delete</button></a>
</td>
</tr>

<%
}
%>

</tbody>

</table>
</div>

</body>
</html>