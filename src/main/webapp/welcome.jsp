<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<%
	//retrive the session Object
	HttpSession session1 = request.getSession(false);
	
	//check if the session is not null nad also Username is Notnull
	if (session1 != null && session1.getAttribute("Username") != null){
		String username = (String) session1.getAttribute("Username");
		
	%>
	
	<header>
		<h1>Sakura Online E-Cart Login And Registration Pages</h1>
	</header>
	
	<div class="containers">
		<h1>Welcome! <%= username.toUpperCase() %></h1>
		<p>Hello this is myLogi page for my Java based Online E-cart
			Application.</p>
		<p>This Page will be created with the HTML, CSS, JSP, Servlet,
			JDBC.</p>
		<p>When ever you want to Exit the Welcome page Click bellow </p>	
		<form action="logout" method="get">
		<button> Logout</button>
		</form>
		
		<% 
		   } else{
			   //redirect to login page
			response.sendRedirect("login.jsp");
		  }
		%>
		
		
	</div>
</body>
</html>