package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String departureCity;
	private String arrivalCity;
	private String seat;
	private String departureTime;
	private String flightCompany;
	private boolean oneWay;
	private String arrivalTime;
	private String flightTime;
	private Float price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Flight idFlight;

	public Flight() {}

	public Flight(Long id, String departureCity, String arrivalCity, String seat, String departureTime,
			String flightCompany, boolean oneWay, String arrivalTime, String flightTime, Float price) {
		super();
		this.id = id;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.seat = seat;
		this.departureTime = departureTime;
		this.flightCompany = flightCompany;
		this.oneWay = oneWay;
		this.arrivalTime = arrivalTime;
		this.flightTime = flightTime;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getFlightCompany() {
		return flightCompany;
	}

	public void setFlightCompany(String flightCompany) {
		this.flightCompany = flightCompany;
	}

	public boolean isOneWay() {
		return oneWay;
	}

	public void setOneWay(boolean oneWay) {
		this.oneWay = oneWay;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}



}