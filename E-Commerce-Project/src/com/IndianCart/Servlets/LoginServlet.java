package com.IndianCart.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.IndianCart.Dao.LoginDao;
import com.IndianCart.Model.UserBean;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		UserBean ub = new UserBean();
		ub.setUserEmail(request.getParameter("email"));
		ub.setUserPass(request.getParameter("pass"));
		
		boolean b = LoginDao.validateLogin(ub);
		HttpSession session;
		
		if (b) {
			session = request.getSession();
			session.setAttribute("message", "Welcome!");
			response.sendRedirect("Login.jsp");
			return;
		} else {
			session = request.getSession();
			session.setAttribute("error_message", "Invalid Email/Password!");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
		
	}

}
