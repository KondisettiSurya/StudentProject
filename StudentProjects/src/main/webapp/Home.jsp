<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<%@include file="css.jsp" %>

</head>

<style>

a{

margin-left: 1rem;

}

h1{
     
    font-size: 3rem;
    margin-left:12rem;
    margin-bottom:3rem;
    font-family: 'Poppins', sans-serif;
    font-weight: 800;
    color: white;
    text-shadow:  3px 3px 9px black;

}

.banner-body
{

margin-left: 30rem;
margin-top: -25rem;
}


</style>
<body style="background-image: url('Images/Desktop - 3.jpg');">

<%@include file="Navbar1.jsp" %>

<img alt="Check the Connection" src="Images//pngwing.com(10).png" style="height: 38rem; margin-left: 6rem">

<div class="banner-body">

<h1>Welcome Admin</h1>

<a href="AddStudents.jsp"><button class="btn btn-outline-success btn-md">Add Student</button></a>

<a href="Marks.jsp"><button class="btn btn-outline-success btn-md">Add Students Marks</button></a>
<a href="AllStudents.jsp"><button class="btn btn-outline-primary btn-md">Registered Student</button></a>
<a href="AllMarks.jsp"><button class="btn btn-outline-primary btn-md">All Students List</button></a>
<a href="Admin.jsp"><button class="btn btn-outline-danger btn-md">Logout</button></a>

</div>

</body>
</html>