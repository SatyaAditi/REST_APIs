<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Banking Application</h1>

<form action="UserLoginView.jsp">
<button><h4>To Sign up</h4></button>

</form>

<hr>
<form action="signin" method="post">
<h3>Already have an account,please sign in</h3><br>
Name: <input type="text" name="name"><br>
password: <input type="password" name="password">
<button><h4>Sign in</h4></button>
</form>
</body>
</html>