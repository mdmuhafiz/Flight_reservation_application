package com.flightreservationapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservationapp.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
