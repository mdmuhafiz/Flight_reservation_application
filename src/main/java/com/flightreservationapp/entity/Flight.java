package com.flightreservationapp.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity{
	private String flightNumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Timestamp estimatedDepartureTime;
	public String getFlightNumber() {
		return flightNumber;
	}
	public String getOperatingAirlines() {
		return operatingAirlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	

}
