
<%@page import="DBConnection.StudentDb"%>
<%@page import="Models.Students"%>
<%@page import="Dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Students</title>
<%@include file="css.jsp"%>
</head>
<body style="background-color: #80DEEA;">
	<%@include file="Navbar.jsp"%>


	<div class="Container p-4">

		<div class="row">

			<div class="col-md-6 offset-md-3">

				<div class="card shadow-lg">

					<div class="card-body" style="font-family: serif; font-weight: 700;">
                        
                        <img alt="Check the connection" src="Images/pngwing.com(8).png" style="height: 13rem; width: 18rem; margin-left: 9.5rem;">
						<p class="fs-3 text-center" style="color: green">Update
							Students</p>

						<hr size="10px" style="color: red;">


						<%
						int Rollnumber = Integer.parseInt(request.getParameter("Rollnumber"));

						StudentDao dao = new StudentDao(StudentDb.getConn());

						Students s = dao.getByStudentId(Rollnumber);
						%>



						<form action="updateuser" method="post">


						

							<div class="mb-3">
								<label class="form-label">Studentname</label> <input type="text"
									class="form-control" name="Studentname"
									value=" <%=s.getStudentname()%> ">
							</div>


							<div class="mb-3">
								<label class="form-label">Section</label> <input type="text"
									class="form-control" name="Section"
									value=" <%=s.getSection()%> ">
							</div>
							<div class="mb-3">
								<label class="form-label">Class</label> <input type="text"
									class="form-control" name="Clas"
									value=" <%=s.getClas()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Email</label> <input type="email"
									class="form-control" name="Email" value="<%=s.getEmail()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Password</label> <input type="text"
									class="form-control" name="Password" value=" <%=s.getPassword()%> ">
							</div>
							<div class="mb-3">
								<label class="form-label">Fathername</label> <input type="text"
									class="form-control" name="Fathername" value=" <%=s.getFathername()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Mothername</label> <input type="text"
									class="form-control" name="Mothername"
									value=" <%=s.getMothername()%>">
							</div>
							


							<input type="hidden" name="Rollnumber" value="<%=s.getRollnumber()%>">

							<button class="btn btn-outline-success"
								style="margin-left: 15rem;">Update Student</button>
						</form>
					</div>

				</div>

			</div>
		</div>

	</div>



</body>
</html>