package com.flightreservationapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservationapp.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
