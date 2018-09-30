<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="adduser">
   Enter name: <input type="text" name="name"><br>
   Enter id:  <input type="text"   name="id"><br>
   Enter amount:  <input type="text"   name="amount"><br>
    <input type="submit" name="submit" ><br>
    


</form>


<hr>
<form action="getuser">
 Enter the id of the user you wish to see : <input type="text" name="id"><br>
 
<input type="submit" name="submit" ><br>

</form>

</body>
</html>