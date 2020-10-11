<%@page import="com.IndianCart.Model.UserBean"%>


<%
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
	<div class="container mt-5 admin">
	
	<div class="row">
	<div class="col-md-4"><div class="card"><div class="card-body text-center"><div class="container"><img src="Images/users.png" class="img-fluid" width="100px" height="100px"/></div><h1>2345</h1><h1>Users</h1></div></div></div>
	<div class="col-md-4"><div class="card"><div class="card-body text-center"><div class="container"><img src="Images/inventory.png" class="img-fluid" width="100px" height="100px"/></div><h1>2345</h1><h1>Categories</h1></div></div></div>
	<div class="col-md-4"><div class="card"><div class="card-body text-center"><div class="container"><img src="Images/product.png" class="img-fluid" width="100px" height="100px"/></div><h1>2345</h1><h1>Products</h1></div></div></div>
	</div>
	
	<div class="row mt-3">
	<div class="col-md-4"><div class="card"><div class="card-body text-center"><div class="container"><img src="Images/distribution.png" class="img-fluid" width="100px" height="100px"/></div><h1>2345</h1><h1>Show Orders</h1></div></div></div>
	<div class="col-md-4"><div class="card" data-toggle="modal" data-target="#add-category-modal"><div class="card-body text-center"><div class="container"><img src="Images/plus.png" class="img-fluid" width="100px" height="100px"/></div><h1>2345</h1><h1>Add Categories</h1></div></div></div>
	<div class="col-md-4"><div class="card"><div class="card-body text-center"><div class="container"><img src="Images/add-to-basket.png" class="img-fluid" width="100px" height="100px"/></div><h1>2345</h1><h1>Add Products</h1></div></div></div>
	
	</div>
	</div>
	
	<!-- Add-Categpry Modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#add-category-modal">
  Launch demo modal
</button>

<!-- Modal -->
<div class="modal fade" id="add-category-modal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg mt-5" role="document">
    <div class="modal-content">
      <div class="modal-header custom-bg">
        <h5 class="modal-title" id="exampleModalLabel">Fill Category Details</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <form>
        	<div class="form-group">
        		<input type="text" class="form-control" name="catTitle" placeholder="Enter category title" required>
        	</div>
        	
        	<div class="form-group">
        		<textarea class="form-control" name="catDescription" placeholder="Enter category description" required style="height:250px"></textarea>
        	</div>
        	
        	<div class="container pl-0">
        		<button class="btn btn-outline-success mr-3">Add Category</button>
        		<button type="button" class="btn btn-outline-secondary" data-dismiss="modal">Cancel</button>
        	</div>
        </form>
      </div>
    </div>
  </div>
</div>
</body>
</html>