<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IndianCart - Checkout</title>
<%@include file="Components/Common_JS_CSS.jsp"%>

</head>
<body>
	<%@include file="Components/navbar.jsp"%>
	<div class="container">
		<div class="row mt-5">

			<div class="col-md-6">
				<!-- cart -->
				<div class="card">
					<div class="card-body">
						<h3 class="text-center mb-5">Your selected items</h3>
						<div class="cart-body"></div>
					</div>
				</div>
			</div>

			<div class="col-md-6">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center mb-5">Enter your details</h3>
						<form action="#">
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input
									type="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp"> <small id="emailHelp"
									class="form-text text-muted">We'll never share your
									email with anyone else.</small>
							</div>

							<div class="form-group">
								<label for="name">Your Name</label> <input type="text"
									class="form-control" id="name" aria-describedby="emailHelp">
							</div>

							<div class="form-group">
								<label for="exampleFormControlTextarea1">Your Shipping
									Address</label>
								<textarea class="form-control" id="exampleFormControlTextarea1"
									rows="3"></textarea>
							</div>

							<div class="container text-center">
								<button class="btn btn-outline-success">Order Now</button>
								<button class="btn btn-outline-primary">Continue
									Shopping</button>
							</div>

						</form>

					</div>
				</div>

			</div>
		</div>
	</div>

	<%@include file="Components/Common_Modals.jsp"%>

</body>
</html>