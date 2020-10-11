package com.IndianCart.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.IndianCart.Dao.AddCategoryDao;
import com.IndianCart.Model.CategoryBean;

public class ProductOperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProductOperationServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String operation = request.getParameter("operation");
		System.out.println("Operation value: " + operation);

		if (operation.equals("addCategory")) {
			// Fetching Category Data

			String cTitle = request.getParameter("catTitle");
			String cDescription = request.getParameter("catDescription");

			CategoryBean category = new CategoryBean();
			category.setCategoryTitle(cTitle);
			category.setCategoryDescription(cDescription);

			int i = AddCategoryDao.addCategory(category);

			

			if (i>0) {
				HttpSession session = request.getSession();
				session.setAttribute("message", "Product Category Added Succesfully!");
				response.sendRedirect("Admin.jsp");
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("error_message", "Something went wrong! Category not added, please try again later.");
				response.sendRedirect("Admin.jsp");
			}

		} else if (operation.equals("addProduct")) {

		}

	}

}