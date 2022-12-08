<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<%@include file="css.jsp" %>

<style>

.banner{
    background-image: url("Images/pexels-pixabay-261895(1).jpg");
    background-size: cover;
    background-position: center;
    color: white;
    object-fit: contain;
    height: 37.8rem;
}



h1{

 font-size: 3rem;
    margin-left: 20rem;
    padding-top: 15rem;
    font-family: 'Poppins', sans-serif;
    font-weight: 800;
    color: white;
    text-shadow:  3px 3px 9px black;
}

P{

    font-size: 1rem;
    margin-left: 60rem;
    font-family: 'Poppins', sans-serif;
    font-weight: 700;
    color: white;
    text-shadow:  3px 3px 9px black;

}
button {
	
	 font-size: 1rem;
     margin-left: 70rem;
     margin-top: 10rem;
}

</style>
</head>
<body>
<%@include file="Navbar.jsp"%>

<div class="banner">
<div class ="banner-title">
<a href="Admin.jsp"><button class="btn btn-primary btn-lg">Admin</button></a>
<h1>Welcome To Students Portal</h1>
<p>Login through Admin Portal</p>
</div>
</div>
</body>
</html>