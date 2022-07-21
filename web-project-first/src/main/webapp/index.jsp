<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<body>
<h2>Welcom to the app!</h2>
<h4>Authorize or register to continue:</h4>

<form action="controller" method="post">
	<input type="hidden" name="command" value="go_to_logination_page" />
	<input type="submit" value="Logination" />
</form>

<br/>

<form action="controller" method="post">
	<input type="hidden" name="command" value="go_to_registration_page" />
	<input type="submit" value="Registration" />
</form>
		
</body>
</html>
