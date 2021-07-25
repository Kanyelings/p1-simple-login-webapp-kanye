<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="/static/css/styes.css"/>
    </head>

    <body>
        <form action="login" method="post">
            <label for="username">Username:</label>
            <input name="username" type="text" /> <br>
            <label for="userpass">Password:</label>
            <input name="userpass" type="password" /> <br>
            <input type="submit" value="Login" />
        </form>
        <section>
        	<%=request.getAttribute("message") %>
        </section>
		<script type="text/javascript" src="/static/js/script.js"></script>
    </body>
</html>