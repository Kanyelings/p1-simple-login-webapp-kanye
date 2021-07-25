<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/styes.css"/>


</head>
<body>
	<main>
		<section>
			<div class="hero">
				<h3>Welcome</h3>
				<p>This is small user reg and login application with a HashMap database </p>
			</div>
		</section>
		<section>
			Do you have an account? Login here: <br>
			<a href="login.jsp">Login</a>
		</section>
		<section>
			New? Register here: <br>
			<a href="register.jsp">Register</a>
		</section>
	</main>

<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/script.js"></script>
</body>
</html>