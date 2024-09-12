<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h3>Registration Form | Register Here For Booking your Flight</h3>
<hr>
<form action="saveRegistration" method="post">
<pre>
First Name   : <input type = "text" name = "firstName" />
Last  Name   : <input type = "text" name = "lastName" />
Email        : <input type = "email" name = "email" />
Password     : <input type = "password" name = "password" />
<input type = "submit" value="Register">
</pre>
</form>
</body>
</html>
