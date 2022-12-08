<%@page import="Models.Marks" %>
<%@page import="java.util.List"%>
<%@page import="DBConnection.StudentDb"%>
<%@page import="Dao.MarksDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Marks</title>
<%@include file="css.jsp" %>
</head>
<body style="background: linear-gradient(245deg, #A5FEFE 0, #4F92F6 44%); background-repeat: no-repeat; height: 42rem;">

<%@include file="Navbar1.jsp" %>

<div class="container p-5">

<a href="Home.jsp"><button class="btn btn-outline-warning btn-md">Back</button></a>

<p class="text-center" style="font-family: sans-serif; font-size: 2.5rem">Marks Details</p>

<table class="table table-hover" style="font-weight: 700;">

<thead>

<tr>

<th>RollNumber</th>
<th>English</th>
<th>Hindi</th>
<th>Telugu</th>
<th>Maths</th>
<th>Science</th>
<th>Social</th>
<th>TotalMarks<th>
<th>Percentage</th>
<th>Action</th>
</tr>

</thead>

<tbody>

<%

MarksDao dao = new MarksDao(StudentDb.getConn());

 List<Marks> list = dao.getAllMarks();
 
 for(Marks m : list)
 {
%>


<tr>

<td><%=m.getRollnumber()%></td>
<td><%=m.getEnglish() %></td>
<td><%=m.getHindi() %></td>
<td><%=m.getTelugu() %></td>
<td><%=m.getMaths() %></td>
<td><%=m.getScience() %></td>
<td><%=m.getSocial() %></td>
<td><% int sum =m.getEnglish()+m.getHindi()+m.getTelugu()+m.getMaths()+m.getScience()+m.getSocial(); out.println(sum);%><td>
<td><% out.println((sum*100)/600);%></td>
<td>
<a href="UpdateMarks.jsp?Rollnumber=<%=m.getRollnumber()%>"> <button class="btn btn-outline-success btn-sm" style="font-weight: 700;">Update</button></a>

<a href="deletemark?Rollnumber=<%=m.getRollnumber()%>"><button class="btn btn-outline-danger btn-sm" style="font-weight: 700;">delete</button></a>

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