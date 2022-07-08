<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<body>
<h2>Welcom to the app!</h2>
<h4>Authorize or register to continue:</h4>

<form action="Controller" method="post">
	<input type="hidden" name="command" value="authorization" />
	<input type="submit" value="Authorization" />
</form>

<br/>

<form action="Controller" method="post">
	<input type="hidden" name="command" value="registration" />
	<input type="submit" value="Registration" />
</form>
		
</body>
</html>
