<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Profile</title>
</head>
<body>
Welcome ${bu.name}
<br>
Current Account_balance : 

<form action="addaccount" method="post">

Account Number : <input type="text" name="account_no"><br>
Add Initial  Balance : <input type="text" name="account_balance">

<button>submit</button>

</form>
<hr>
<form action="update" method="post">

Account Number : <input type="text" name="account_no"><br>
Add Balance : <input type="text" name="account_balance"><br>
Amount to Deposit : <input type="text" name="amount_deposited"><br>
Amount to Pay Bills : <input type="text" name="amount_withdrawn"><br>
<button>submit</button>
</form>

<hr>
<h3>If you want to send money to someone</h3>
<form action="send" method="post">

Account Number : <input type="text" name="account_no"><br>
Sender's Account Number : <input type="text" name="saccount_no"><br>
Add amount to send : <input type="text" name="amount"><br>

<button>submit</button>
</form>


</body>


</html>