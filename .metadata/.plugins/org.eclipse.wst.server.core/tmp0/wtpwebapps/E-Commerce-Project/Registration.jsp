<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<%@include file="Components/Common_JS_CSS.jsp"%>
</head>
<body>
	<%@include file="Components/navbar.jsp"%>

	<div class="row mt-2">
		<div class="col-md-4 offset-md-4">
			<div class="card p-4">
				<div class="card-body">
					<h3 class="text-center">Sign Up</h3>
					<form>
						<div class="form-group">
							<label for="name">User Name</label> <input type="text"
								class="form-control" id="name" placeholder="Enter here"
								aria-describedby="emailHelp" placeholder="Enter email">
						</div>

						<div class="form-group">
							<label for="email">Email</label> <input type="email"
								class="form-control" id="email" placeholder="Enter here"
								aria-describedby="emailHelp" placeholder="Enter email">
						</div>

						<div class="form-group">
							<label for="pass">Password</label> <input type="password"
								class="form-control" id="pass" placeholder="Enter here"
								aria-describedby="emailHelp" placeholder="Enter email">
						</div>

						<div class="form-group">
							<label for="mobno">Mobile no</label> <input type="number"
								class="form-control" id="mobno" placeholder="Enter here"
								aria-describedby="emailHelp" placeholder="Enter email">
						</div>

						<div class="form-group">
							<label for="address">Address</label>
							<textarea class="form-control" placeholder="Enter your address"
								style="height: 160px"></textarea>
						</div>

						<div class="container text-center">
							<button class="btn btn-lg btn-outline-success">Register</button>
							<button class="btn btn-lg btn-outline-warning">Cancel</button>
						</div>
					</form>

				</div>
			</div>
		</div>
	</div>

</body>
</html>