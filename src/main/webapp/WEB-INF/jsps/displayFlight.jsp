<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flight</title>
</head>
<body>
<h3>Display Flight | Display</h3>
<hr>
<table border="1">
<tr>
<th>Airlines</th>
<th>Departure City</th>
<th>Arrival City</th>
<th>Departure Date</th>
<th>Select</th>

</tr>
<c:forEach var = "findFlight" items="${findFlight}">
<tr>
<td>${findFlight.operatingAirlines}</td>
<td>${findFlight.departureCity}</td>
<td>${findFlight.arrivalCity}</td>
<td>${findFlight.dateOfDeparture}</td>
<td><a href = "showCompleteReservation?id=${findFlight.id}">select</a></td>

</tr>
</c:forEach>

</table>
</body>
</html>