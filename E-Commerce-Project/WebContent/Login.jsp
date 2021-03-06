<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IndianCart - Login</title>
<%@include file="Components/Common_JS_CSS.jsp"%>
</head>
<body>
	<%@include file="Components/navbar.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card mt-5">
					<div class="card-header custom-bg-200 login-text">
						<h3>Login</h3>
					</div>

					<div class="card-body">
						<%@include file="Components/Message.jsp"%>

						<form action="LoginServlet" method="post">
							<div class="form-group">

								<label for="exampleInputEmail1">Email address</label> <input
									type="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="email">
							</div>

							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" class="form-control" id="exampleInputPassword1"
									name="pass">
							</div>

							<div class="container ml-0 pl-0 mt-4">
								<button type="submit"
									class="btn btn-lg custom-bg mr-2 login-text">Login</button>
								<button type="submit" class="btn btn-lg ml-2 login-text">SignUp</button>
							</div>


						</form>
					</div>

				</div>
			</div>
		</div>
	</div>
</body>
</html>