  package com.IndianCart.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.IndianCart.Dao.RegisterDao;
import com.IndianCart.Model.UserBean;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		UserBean ub = new UserBean();
		ub.setUserName(request.getParameter("name"));
		ub.setUserEmail(request.getParameter("email"));
		ub.setUserPass(request.getParameter("pass"));
		ub.setUserMobno(request.getParameter("mobno"));
		ub.setUserAddress(request.getParameter("addr"));

		int i = RegisterDao.registerUser(ub);

		if (i > 0) {
			HttpSession session = request.getSession();
			session.setAttribute("message", "Registration Successful!");
			response.sendRedirect("Registration.jsp");
		} else {
			out.println("Registration Failed! Try Again!");
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.include(request, response);
		}
	}

}
