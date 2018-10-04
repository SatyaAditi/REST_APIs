<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ChaseRunners:HomePage</title>
</head>
<body>
<h1 align=center> Welcome to ChaseRunners Banking Application </h1><br>

<hr>
<h3>Already have an account,please sign in</h3>
<form action="profile" method="post">
Name : <input type="text" name="name">
Password : <input type="password" name="password">
<button type="submit">submit</button>

</form>
<hr>

<h3>Or Sign Up</h3>
<form action="NewUserCreation.jsp">

<button type="submit">submit</button>
</form>

</body>
</html>