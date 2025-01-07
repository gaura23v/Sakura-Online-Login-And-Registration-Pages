package com.company.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.company.dao.UserDAOImp;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static UserDAOImp userDAO = new UserDAOImp();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username = request.getParameter("Username");
		String Password = request.getParameter("Password");
		
		if(userDAO.isValidUser(Username,Password)) {
			HttpSession session = request.getSession();
			session.setAttribute("Username",Username);
			response.sendRedirect("welcome.jsp");
			System.out.println("successfully loged in");
			}
		else {
			 response.sendRedirect("login.jsp?error=1");
			 System.out.println("Error Occured during Login In loginservlet");
		}
	}

}
