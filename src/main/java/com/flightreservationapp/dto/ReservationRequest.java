package com.flightreservationapp.dto;

public class ReservationRequest {
	private long  id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private String phone;
	private String nameOnCard;
	private String cardNumber;
	private String cvv;
	private String expiryDate;
	public long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public String getCvv() {
		return cvv;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	

}
