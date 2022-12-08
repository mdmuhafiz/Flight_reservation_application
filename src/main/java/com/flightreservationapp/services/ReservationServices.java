package com.flightreservationapp.services;

import com.flightreservationapp.dto.ReservationRequest;
import com.flightreservationapp.entity.Reservation;

public interface ReservationServices {
	public Reservation bookFlight(ReservationRequest request);

}
