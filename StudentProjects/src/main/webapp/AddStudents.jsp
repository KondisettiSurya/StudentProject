<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Students</title>
<%@include file="css.jsp"%>
</head>
<body style="background-color: #80DEEA;">
	<%@include file="Navbar.jsp"%>


	<div class="Container p-4">

		<div class="row">

			<div class="col-md-6 offset-md-3">

				<div class="card shadow-lg">
                      
					<div class="card-body" style="font-family: serif; font-weight: 700;">
                       
                        <img alt="Check the connection" src="Images/pngwing.com(9).png" style="height: 13rem; width: 18rem; margin-left: 10rem;">
                        
						<p class="fs-3 text-center" style="color: green">Add Students</p>

                        <hr size="10px" style="color: red;" >

						<form action="register" method="post" >

							<div class="mb-3">
								<label class="form-label">Student Name</label> <input type="text"
									class="form-control" name="Studentname">
							</div>
							
							<div class="mb-3">
								<label class="form-label">Section</label> <input type="text"
									class="form-control" name="Section">
							</div>
								<div class="mb-3">
								<label class="form-label">Class</label> <input type="text"
									class="form-control" name="Clas">
							</div>
							
							<div class="mb-3">
								<label class="form-label">Email</label> <input type="email"
									class="form-control" name="Email">
							</div>
							
							<div class="mb-3">
								<label class="form-label">Password</label> <input type="password"
									class="form-control" name="Password">
							</div>
							<div class="mb-3">
								<label class="form-label">Father Name</label> <input type="text"
									class="form-control" name="Fathername">
							</div>
							<div class="mb-3">
								<label class="form-label">Mother Name</label> <input type="text"
									class="form-control" name="Mothername">
							</div>
							<div class="mb-3">
								<label class="form-label">Roll Number</label> <input type="text"
									class="form-control" name="Rollnumber">
							</div>
						
	
							<button class="btn btn-outline-success" style="margin-left: 15rem;">Add Student</button>
						</form>
					</div>

				</div>

			</div>
		</div>

	</div>



</body>
</html>