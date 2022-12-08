<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Marks Obtained</title>
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
						<p class="fs-3 text-center" style="color: green">Marks Obtained</p>

                        <hr size="10px" style="color: red;" >

						<form action="addmarks" method="post">

							<div class="mb-3">
								<label class="form-label">Rollnumber</label> <input type="text"
									class="form-control" name="Rollnumber">
							</div>
							<div class="mb-3">
								<label class="form-label">English</label> <input type="text"
									class="form-control" name="English">
							</div>
							<div class="mb-3">
								<label class="form-label">Hindi</label> <input type="text"
									class="form-control" name="Hindi">
							</div>
							<div class="mb-3">
								<label class="form-label">Telugu</label> <input type="text"
									class="form-control" name="Telugu">
							</div>
							<div class="mb-3">
								<label class="form-label">Maths</label> <input type="text"
									class="form-control" name="Maths">
							</div>
							<div class="mb-3">
								<label class="form-label">Science</label> <input type="text"
									class="form-control" name="Science">
							</div>
							<div class="mb-3">
								<label class="form-label">Social</label> <input type="text"
									class="form-control" name="Social">
							</div>
							
						
	
							<button class="btn btn-outline-success" style="margin-left: 15rem;">Add Marks</button>
						</form>
					</div>

				</div>

			</div>
		</div>

	</div>



</body>
</html>