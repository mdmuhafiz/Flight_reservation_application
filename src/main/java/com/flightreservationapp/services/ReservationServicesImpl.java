package com.flightreservationapp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightreservationapp.dto.ReservationRequest;
import com.flightreservationapp.entity.Flight;
import com.flightreservationapp.entity.Passenger;
import com.flightreservationapp.entity.Reservation;
import com.flightreservationapp.repository.FlightRepository;
import com.flightreservationapp.repository.PassengerRepository;
import com.flightreservationapp.repository.ReservationRepository;

@Service
public class ReservationServicesImpl implements ReservationServices {
	@Autowired
	private PassengerRepository passengerRepo;
	@Autowired
	private FlightRepository flightRepo;
    @Autowired
    private ReservationRepository reserveRepo;
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setLastName(request.getLastName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		passengerRepo.save(passenger);
		
		long id = request.getId();
		Optional<Flight> findById = flightRepo.findById(id);
		Flight flight = findById.get();
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		reserveRepo.save(reservation);
		
		
		return reservation;
	}

}
