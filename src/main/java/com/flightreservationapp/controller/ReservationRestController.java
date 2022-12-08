package com.flightreservationapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightreservationapp.dto.ReservationUpdateRequest;
import com.flightreservationapp.entity.Reservation;
import com.flightreservationapp.repository.ReservationRepository;

@RestController
public class ReservationRestController {
	@Autowired
	private ReservationRepository reserveRepo;
	
	@RequestMapping("reservation/{id}")
	public Reservation getReservation(@PathVariable("id") long id) {
		Optional<Reservation> findById = reserveRepo.findById(id);
		Reservation reservation = findById.get();
		return reservation;
	}
	@RequestMapping("/reservation")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		Optional<Reservation> findById = reserveRepo.findById(request.getId());
		Reservation reservation = findById.get();
		reservation.setCheckedIn(request.isCheckedIn());
		reservation.setNumberOfBags(request.getNumberOfBags());
		return reserveRepo.save(reservation);
	}
	

}
