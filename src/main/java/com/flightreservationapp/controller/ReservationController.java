package com.flightreservationapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flightreservationapp.dto.ReservationRequest;
import com.flightreservationapp.entity.Reservation;
import com.flightreservationapp.services.ReservationServices;


@Controller
public class ReservationController {
	@Autowired
	private ReservationServices reservationServices;
	
	@RequestMapping("/confirmReservation")
	public String confirmReservation(ReservationRequest request,ModelMap model) {
		Reservation bookFlightId = reservationServices.bookFlight(request);
		model.addAttribute("bookFlightId", bookFlightId);
		return "finalBooking";
	}

}
