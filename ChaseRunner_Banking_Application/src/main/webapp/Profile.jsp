<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Profile</title>
</head>
<body>
<h3>Welcome ${bu.email}</h3>
<br>
<form action="accountinfo" method="post">
<input type="hidden" value=${bu.email} name="user_email">
<button type="submit">To view account info</button>

</form>



<hr>

<form action="updatedeposit" method="post">
<input type="hidden" value=${bu.email} name="user_email">
Amount to Deposit : <input type="text" name="amount_deposited" ><br>

<button>submit</button>

</form>
<hr>
<form action="updatewithdraw" method="post">
Where are you paying bills : <input type="text" name="reason">
<input type="hidden" value=${bu.email} name="user_email1">
Amount to pay : <input type="text" name="amount_withdrawn">
<button> submit </button>
</form>
<hr>
<h3>If you want to send money to someone</h3>

<form action="send" method="post">

<input type="hidden" value=${bu.email} name="user_email2">
Sender's Account Number : <input type="text" name="saccount_no"><br>
Add amount to send : <input type="text" name="amount"><br>

<button>submit</button>
</form>


</body>


</html>