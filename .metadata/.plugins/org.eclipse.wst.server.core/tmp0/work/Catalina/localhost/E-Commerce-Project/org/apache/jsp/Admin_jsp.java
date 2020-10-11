/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.31
 * Generated at: 2020-10-11 05:33:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.IndianCart.Model.UserBean;
import com.IndianCart.Model.UserBean;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/Components/Common_JS_CSS.jsp", Long.valueOf(1602123270000L));
    _jspx_dependants.put("/Components/navbar.jsp", Long.valueOf(1602230443000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.IndianCart.Model.UserBean");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');

	UserBean ub = (UserBean) session.getAttribute("current-user");
	if (ub == null) {
		session.setAttribute("error_message", "You are not logged in, Please Login first!");
		response.sendRedirect("Login.jsp");
		return;
	} else {
		if (ub.getUserType().equals("Normal")) {
			session.setAttribute("error_message", "You do not have access to this page!");
			response.sendRedirect("Login.jsp");
			return;
		}
	}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>IndianCart - Admin Dashboard</title>\n");
      out.write("<!-- CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/Style.css\">\n");
      out.write("\n");
      out.write("<!-- BOOTSTRAP -->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<!-- JS -->\n");
      out.write("<script src=\"JS/Script.js\"></script>");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      out.write('\n');
      out.write('\n');
      out.write('\n');

	UserBean ub1 = (UserBean) session.getAttribute("current-user");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light custom-bg\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"#\">IndianCart</a>\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("\t\t\tdata-target=\"#navbarSupportedContent\"\n");
      out.write("\t\t\taria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n");
      out.write("\t\t\taria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t</button>\n");
      out.write("\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("\t\t\t<ul class=\"navbar-nav mr-auto\">\n");
      out.write("\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\"\n");
      out.write("\t\t\t\t\thref=\"index.jsp\">Home <span class=\"sr-only\">(current)</span>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> Categories </a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">Action</a> <a\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"dropdown-divider\"></div>\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t<ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t\t\t\t");

					if (ub1 == null) {
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\"\n");
      out.write("\t\t\t\t\thref=\"Login.jsp\">Login</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\"\n");
      out.write("\t\t\t\t\thref=\"Registration.jsp\">Register</a></li>\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"#\">");
      out.print(ub1.getUserName());
      out.write("</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\"\n");
      out.write("\t\t\t\t\thref=\"LogoutServlet\">Logout</a></li>\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\t<div class=\"container mt-5 admin\">\n");
      out.write("\t\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t<div class=\"col-md-4\"><div class=\"card\"><div class=\"card-body text-center\"><div class=\"container\"><img src=\"Images/users.png\" class=\"img-fluid\" width=\"100px\" height=\"100px\"/></div><h1>2345</h1><h1>Users</h1></div></div></div>\n");
      out.write("\t<div class=\"col-md-4\"><div class=\"card\"><div class=\"card-body text-center\"><div class=\"container\"><img src=\"Images/inventory.png\" class=\"img-fluid\" width=\"100px\" height=\"100px\"/></div><h1>2345</h1><h1>Categories</h1></div></div></div>\n");
      out.write("\t<div class=\"col-md-4\"><div class=\"card\"><div class=\"card-body text-center\"><div class=\"container\"><img src=\"Images/product.png\" class=\"img-fluid\" width=\"100px\" height=\"100px\"/></div><h1>2345</h1><h1>Products</h1></div></div></div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"row mt-3\">\n");
      out.write("\t<div class=\"col-md-4\"><div class=\"card\"><div class=\"card-body text-center\"><div class=\"container\"><img src=\"Images/distribution.png\" class=\"img-fluid\" width=\"100px\" height=\"100px\"/></div><h1>2345</h1><h1>Show Orders</h1></div></div></div>\n");
      out.write("\t<div class=\"col-md-4\"><div class=\"card\" data-toggle=\"modal\" data-target=\"#add-category-modal\"><div class=\"card-body text-center\"><div class=\"container\"><img src=\"Images/plus.png\" class=\"img-fluid\" width=\"100px\" height=\"100px\"/></div><h1>2345</h1><h1>Add Categories</h1></div></div></div>\n");
      out.write("\t<div class=\"col-md-4\"><div class=\"card\"><div class=\"card-body text-center\"><div class=\"container\"><img src=\"Images/add-to-basket.png\" class=\"img-fluid\" width=\"100px\" height=\"100px\"/></div><h1>2345</h1><h1>Add Products</h1></div></div></div>\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- Add-Categpry Modal -->\n");
      out.write("<button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#add-category-modal\">\n");
      out.write("  Launch demo modal\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"add-category-modal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-lg mt-5\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header custom-bg\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Fill Category Details</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <form>\n");
      out.write("        \t<div class=\"form-group\">\n");
      out.write("        \t\t<input type=\"text\" class=\"form-control\" name=\"catTitle\" placeholder=\"Enter category title\" required>\n");
      out.write("        \t</div>\n");
      out.write("        \t\n");
      out.write("        \t<div class=\"form-group\">\n");
      out.write("        \t\t<textarea class=\"form-control\" name=\"catDescription\" placeholder=\"Enter category description\" required style=\"height:250px\"></textarea>\n");
      out.write("        \t</div>\n");
      out.write("        \t\n");
      out.write("        \t<div class=\"container pl-0\">\n");
      out.write("        \t\t<button class=\"btn btn-outline-success mr-3\">Add Category</button>\n");
      out.write("        \t\t<button type=\"button\" class=\"btn btn-outline-secondary\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("        \t</div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
