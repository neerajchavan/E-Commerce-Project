<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.IndianCart.Model.*"%>
<%@page import="com.IndianCart.Dao.ProductDao"%>
<%@page import="com.IndianCart.Dao.CategoryDao"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="Components/Common_JS_CSS.jsp"%>

</head>

<body>
	<%@include file="Components/navbar.jsp"%>
	<div class="row mt-3 mx-2">

		<%
			List<ProductBean> prodList = ProductDao.getAllProducts();
			List<CategoryBean> catList = CategoryDao.getCategory();
		%>

		<!-- Categories -->
		<div class="col-md-2">

			<div class="list-group">
				<a href="#" class="list-group-item active">
					All Products </a>

				<%
					for (CategoryBean category : catList) {
				%>
				<a href="#" class="list-group-item list-group-item-action "> <%=category.getCategoryTitle()%>
				</a>
				<%
					}
				%>

			</div>


		</div>


		<!-- Propducts -->
		<div class="col-md-8">
			<h1>
				No of Products:
				<%=prodList.size()%></h1>
			<%
				for (ProductBean product : prodList) {

					out.println(product.getProdPic() + "<br>");
					out.println(product.getProdTitle() + "<br><br>");

				}
			%>
		</div>

	</div>
</body>

</html>