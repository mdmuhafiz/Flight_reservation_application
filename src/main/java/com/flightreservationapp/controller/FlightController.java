package com.flightreservationapp.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightreservationapp.entity.Flight;
import com.flightreservationapp.repository.FlightRepository;

@Controller
public class FlightController {
	@Autowired
	private FlightRepository flightRepo;
	
	@RequestMapping("/findFlight")
	public String findFlight(@RequestParam("from") String from,
			                 @RequestParam("to") String to,
			                 @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate,
			                 ModelMap model) {
		List<Flight> findFlight = flightRepo.findFlight(from,to,departureDate);
		model.addAttribute("findFlight", findFlight);
		return "displayFlight";
	}
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("id") long id,ModelMap model) {
		Optional<Flight> findById = flightRepo.findById(id);
		Flight flight = findById.get();
		model.addAttribute("flight", flight);
		return "confirmReservation";
	}

}
