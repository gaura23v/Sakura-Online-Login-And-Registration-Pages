package com.company.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.company.Util.User;
import com.company.dao.UserDAOImp;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDAOImp userDAO = new UserDAOImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username = request.getParameter("username");
		System.out.println(Username);
		String Email = request.getParameter("email");
		System.out.println(Email);
		String Password = request.getParameter("password");
		System.out.println(Password);
		
		User user = new User();
		user.setUsername(Username);
		user.setEmail(Email);
		user.setPassword(Password);
		
		if(userDAO.registerData(user)) {
		   response.sendRedirect("login.jsp?registration=success");
		}
		else {
			response.sendRedirect("register.jsp?error=1");
		}
	}

}
