<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Authorization page</title>
	</head>
	
	<body>
	<h1>Welcome to logination page!</h1>
	<h3>Pls enter login and password:</h3>
	
	<form action="controller" method="post">
			<input type="hidden" name="command1" value="do_logination" /> Login: <br />
			<input type="text" name="login" value="" /><br /> Password: <br />
			<input type="password" name="password" value="" /><br /> 
			<input type="submit" value="Submit" /><br />
	</form>
	</body>
</html>