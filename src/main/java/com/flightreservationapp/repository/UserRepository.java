package com.flightreservationapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservationapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
