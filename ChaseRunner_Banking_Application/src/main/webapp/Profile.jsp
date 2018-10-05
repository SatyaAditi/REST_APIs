<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Profile</title>
</head>
<body>
<h3>Welcome ${bu.name}</h3>
<br>
Account_no: ${ad.account_no}
Current Account_balance : ${ad.account_balance}


<form action="addaccount" method="post">

Account Number : <input type="text" name="account_no" ><br>
Add Initial  Balance : <input type="text" name="account_balance">

<button>submit</button><br>
</form>


<form action="ProfileUpdates.jsp">
<button>To deposit money</button><br>

</form>

<form action="Profileupdateswithdraw.jsp">
<button>To pay bills</button><br>

</form>

<hr>
<h3>If you want to send money to someone</h3>
<form action="send.jsp">
<button>To send money</button><br>
</form>
</body>


</html>