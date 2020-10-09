<%@page import="com.IndianCart.Model.UserBean"%>


<%
UserBean ub = (UserBean) session.getAttribute("current-user");
if(ub == null){
	session.setAttribute("error_message","You are not logged in, Please Login first!");
	response.sendRedirect("Login.jsp");
	return;
}
else{
	if(ub.getUserType().equals("Normal")){
		session.setAttribute("error_message","You do not have access to this page!");
		response.sendRedirect("Login.jsp");
		return;	
	}
}

%>




<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IndianCart - Admin Dashboard</title>
<%@include file="Components/Common_JS_CSS.jsp"%>
</head>
<body>
	<%@include file="Components/navbar.jsp"%>
<h1>Admin Page.</h1>
</body>
</html>