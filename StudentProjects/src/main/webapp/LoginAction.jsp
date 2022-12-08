<%

String username1 = request.getParameter("username");

String Password1 = request.getParameter("password");

if(username1.equalsIgnoreCase("Admin") && Password1.equalsIgnoreCase("Admin"))
	
{
	
	response.sendRedirect("Home.jsp");
	
}

else
{
	
	response.sendRedirect("Error.jsp");
	
}


%>