<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>E-cart register page</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<header>
		<h1>Sakura Online E-Cart Login And Registration Pages</h1>
	</header>

	<div class="containers">
	<form action="RegisterServlet" method="post">
			<h1>Register Here</h1>
			<label>Username</label><br>
			<input type="text" id="Username" name="username" placeholder="Username..."><br>
			<label>E-mail</label><br>
			<input type="email" id="Emial" name="email" placeholder="Email..."><br>
			<label>Password</label><br>
			<input type="password" id="Password" name="password" placeholder="Password..."><br><br>
			<button type="submit" href="welcome.jsp">Register</button>
	</form>
	<p><a href="index.html">Back To Home</a></p>
	</div>
		<%
		String error = request.getParameter("error");
		
		if(error != null && error.equals("1")){ %>
		
			<p style="color: red;">Registration failed. Please try again.</p>
			
		<% } %>
	
</body>
</html>