<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Registration page</title>
</head>
<body>

<h1>Welcome to registration page!</h1>

<h3>Pls enter required info below:</h3>

<form action="Registration" method="post">
		<input type="hidden" name="command1" value="register" /> Name: <br />
		<input type="text" name="name" value="" /><br /> Surname: <br />
		<input type="text" name="surname" value="" /><br /> Date of birth: <br />
		<input type="date" name="birthDate" value="" /><br /> Preferable contacts: <br />
		<input type="checkbox" name="contact" value="e-mail"/>e-mail<br />
		<input type="checkbox" name="contact" value="cell phone"/>cell phone<br />
		<input type="checkbox" name="contact" value="office phone"/>office phone<br />Enter your login: <br />
		<input type="text" name="login" value="" /><br />Enter your password:<br />
		<input type="password" name="password" value="" /><br />
		<input type="submit" value="Submit" /><br />
</form>

</body>
</html>