<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<%@include file="css.jsp"%>
</head>
<body style="background-color: #80DEEA;">
	<%@include file="Navbar.jsp"%>





<section class="vh-100" style="background-color: #9A616D;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col col-xl-10">
        <div class="card" style="border-radius: 1rem;">
          <div class="row g-0">
            <div class="col-md-6 col-lg-5 d-none d-md-block">
              <img src="https://images.pexels.com/photos/5428150/pexels-photo-5428150.jpeg?auto=compress&cs=tinysrgb&w=600"
                alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;" />
            </div>
            <div class="col-md-6 col-lg-7 d-flex align-items-center">
              <div class="card-body p-4 p-lg-5 text-black">

               	   <form action="LoginAction.jsp" method="post">

							<div class="mb-3">
								<label class="form-label">Username</label> <input type="text"
									class="form-control" name="username">
							</div>
							
							<div class="mb-3">
								<label class="form-label">Password</label> <input type="password"
									class="form-control" name="password">
							</div>
							
							
							<button class="btn btn-outline-success btn-lg" style="margin-left: 10rem; margin-top: 2rem;">Login</button><br><br>


                  <a class="small text-muted" href="#!">Forgot password?</a>
                  <a href="#!" class="small text-muted">Terms of use.</a>
                  <a href="#!" class="small text-muted">Privacy policy</a>
                </form>

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>



</body>
</html>