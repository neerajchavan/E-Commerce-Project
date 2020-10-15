<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.IndianCart.Model.*"%>
<%@page import="com.IndianCart.Dao.ProductDao"%>
<%@page import="com.IndianCart.Dao.CategoryDao"%>
<%@page import="com.IndianCart.Helper.TenWordsHelper"%>
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

			<div class="list-group mt-4">
				<a href="#"
					class="list-group-item list-group-item-action list-group-item-secondary active">
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


		<!-- Products -->
		<div class="col-md-8">
			<div class="row mt-4">
				<div class="col-md-12">
					<div class="card-deck">
						<%
							for (ProductBean product : prodList) {
						%>

						<div class="card">
						
						<div class="container text-center">
						<img class="card-img-top m-2" style="max-height:140px; max-width:100%; width:auto;" src="Images/Products-img/<%=product.getProdPic() %>" alt="Product Image">
						</div>
							
							
							<div class="card-body">
								<h5 class="card-title"><%=product.getProdTitle()%></h5>
								<p class="card-text"><%=TenWordsHelper.getTenWords(product.getProdDescription())%></p>
							</div>

							<div class="card-footer">
								<button class="btn btn-outline-secondary">Add to Cart</button>
								<button class="btn custom-bg">
									₹
									<%=product.getProdPrice()%></button>
							</div>
						</div>

						<%
							}
						%>
					</div>
				</div>
			</div>


		</div>

	</div>
</body>

</html>