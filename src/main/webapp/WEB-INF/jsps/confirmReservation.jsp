<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirm Reservation</title>
</head>
<body>
<h3>Confirm Reservation | Reservation</h3>
<hr>
<pre>
Airlines:${flight.operatingAirlines}<br/>
Departure City:${flight.departureCity}<br/>
Arrival City : ${flight.arrivalCity}<br/>
Departure Date : ${flight.dateOfDeparture}<br/>
Departure Time:${flight.estimatedDepartureTime}<br/>
</pre>
<h3>Passenger Details | Passenger</h3>
<hr>
<form action="confirmReservation" method="post">
<pre>
First  Name  : <input type = "text" name = "firstName" />
Last   Name  : <input type = "text" name = "lastName" />
Middle Name  : <input type = "text" name = "middleName" />
Email        : <input type = "email" name = "email" />
Phone        : <input type = "phone" name = "phone" />
<input type = "hidden" name = "id" value="${flight.id}" />
<h3>Payment Details | Payment</h3>
<hr>
Card Name    : <input type = "text" name = "nameOnCard" />
Card Number  : <input type = "text" name="cardNumber" />
CVV          : <input type = "text" name="cvv" />
Expiry Date  : <input type = "text" name="expiryDate" />
<input type = "submit" value="confirm reservation">
</pre>
</form>

</body>
</html>