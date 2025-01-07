<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>E-cart login page</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<header>
		<h1>Sakura Online E-Cart Login And Registration Pages</h1>
	</header>

	<div class="containers">
		<form action="LoginServlet" method="post">
			<h1>Login Here</h1>
			<br>
			<br> <label>Username</label><br> <input type="text"
				id="username" name="Username" placeholder="Username..."><br>
			<br> <label>Password</label><br> <input type="password"
				id="password" name="Password" placeholder="Password..."><br>
			<br>
			<button type="submit" herf="welcome.jsp">Login</button>
		</form>

		<p>
			<a href="index.html">Back To Home</a>
		</p>
		
		<% String error = request.getParameter("error");
	        if(error !=null && error.equals("1")){ %>
	        
        <p style="color:red;">Invalid Username or Password.Please Try again!</p>
        
        <% } %>
        
        <%
		String Register = request.getParameter("registration");
		
		if(Register != null && Register.equals("success")){ %>
		
			<p style="color: orange;;">Registration Successful. Please Login.</p>
			
		<% } %>
	</div>


</body>
</html>