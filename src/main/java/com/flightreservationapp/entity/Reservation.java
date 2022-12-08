package com.flightreservationapp.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity{
	private boolean checkedIn;
	private int numberOfBags;
	@OneToOne
	private Passenger passenger;
	@OneToOne
    private Flight flight;
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
    

}
