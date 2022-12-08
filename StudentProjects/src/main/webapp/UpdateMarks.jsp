
<%@page import="Models.Marks"%>
<%@page import="Dao.MarksDao"%>
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
<title>Update Marks</title>
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
							Marks</p>

						<hr size="10px" style="color: red;">


						<%
						int Rollnumber = Integer.parseInt(request.getParameter("Rollnumber"));

						MarksDao dao = new MarksDao(StudentDb.getConn());
						
						Marks m = dao.getByMarksId(Rollnumber);
						
						%>



						<form action="update" method="post">


						

							<div class="mb-3">
								<label class="form-label">English</label> <input type="text"
									class="form-control" name="English"
									value=" <%=m.getEnglish()%> ">
							</div>


							<div class="mb-3">
								<label class="form-label">Hindi</label> <input type="text"
									class="form-control" name="Hindi"
									value=" <%=m.getHindi()%> ">
							</div>
							<div class="mb-3">
								<label class="form-label">Telugu</label> <input type="text"
									class="form-control" name="Telugu"
									value=" <%=m.getTelugu()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Maths</label> <input type="text"
									class="form-control" name="Maths" value="<%=m.getMaths()%>">
							</div>
							<div class="mb-3">
								<label class="form-label">Science</label> <input type="text"
									class="form-control" name="Science" value=" <%=m.getScience()%> ">
							</div>
							<div class="mb-3">
								<label class="form-label">Social</label> <input type="text"
									class="form-control" name="Social" value=" <%=m.getSocial()%>">
							</div>
							


							<input type="hidden" name="Rollnumber" value="<%=m.getRollnumber()%>">

							<button class="btn btn-outline-success"
								style="margin-left: 15rem;">Update Marks</button>
						</form>
					</div>

				</div>

			</div>
		</div>

	</div>



</body>
</html>