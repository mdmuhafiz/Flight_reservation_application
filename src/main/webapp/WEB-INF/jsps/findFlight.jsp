<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Flight</title>
</head>
<body>
<h3>Find Flight | Flight</h3>
<hr>
<form action="findFlight" method="post">
<pre>
From           : <input type = "text" name = "from" />
To             : <input type = "text" name = "to" />
Departure Date : <input type = "text" name  = "departureDate" />
<input type = "submit" value="search">
</pre>
</form>
</body>
</html>